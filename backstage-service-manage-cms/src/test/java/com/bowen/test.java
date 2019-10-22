package com.bowen;

import com.bowen.framework.domain.cms.CmsPage;
import com.bowen.manage_cms.ManageCmsApplication;
import com.bowen.manage_cms.dao.CmsPageRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @ProjectName: GraduationProject-Backstage
 * @Package: com.bowen
 * @ClassName: test
 * @Author: Bowen
 * @Description: 测试\
 * @Date: 2019/10/22 21:49
 * @Version: 1.0.0
 */
@SpringBootTest(classes = ManageCmsApplication.class)
@RunWith(SpringRunner.class)
public class test {

    @Autowired
    CmsPageRepository cmsPageRepository;

    @Test
    public void testFindAll() {
        List<CmsPage> all = cmsPageRepository.findAll();
        System.out.println(all);

    }

    @Test
    public void testFindAllByExample() {
        //分页参数
        int page = 0;//从0开始
        int size = 1;
        Pageable pageable = PageRequest.of(page,size);

        //条件值对象
        CmsPage cmsPage= new CmsPage();
        //要查询5a751fab6abb5044e0d19ea1站点的页面
        cmsPage.setSiteId("5b30b052f58b4411fc6cb1cf");
        //设置模板id条件
//        cmsPage.setTemplateId("5ad9a24d68db5239b8fef199");
        //设置页面别名
        cmsPage.setPageAliase("轮播");
        //条件匹配器
//        ExampleMatcher exampleMatcher = ExampleMatcher.matching();
//        exampleMatcher = exampleMatcher.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        ExampleMatcher exampleMatcher = ExampleMatcher.matching()
                .withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());
        //ExampleMatcher.GenericPropertyMatchers.contains() 包含关键字
//        ExampleMatcher.GenericPropertyMatchers.startsWith()//前缀匹配
        //定义Example
        Example<CmsPage> example = Example.of(cmsPage,exampleMatcher);
        Page<CmsPage> all = cmsPageRepository.findAll(example, pageable);
        List<CmsPage> content = all.getContent();
        System.out.println(content);
    }

}

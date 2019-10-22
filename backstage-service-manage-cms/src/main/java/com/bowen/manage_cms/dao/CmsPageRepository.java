package com.bowen.manage_cms.dao;

import com.bowen.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface CmsPageRepository extends MongoRepository<CmsPage, String> {

    //根据页面名称查询
    CmsPage findByPageName(String pageName);

    //根据页面名称、站点Id、页面webpath查询
    CmsPage findByPageNameAndSiteIdAndPageWebPath(String pageName, String siteId, String pageWebPath);
}

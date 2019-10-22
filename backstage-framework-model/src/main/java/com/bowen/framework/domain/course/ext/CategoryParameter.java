package com.bowen.framework.domain.course.ext;

import com.bowen.framework.domain.course.Category;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@ToString
public class CategoryParameter extends Category {

    //二级分类ids
    List<String> bIds;
    //三级分类ids
    List<String> cIds;

}

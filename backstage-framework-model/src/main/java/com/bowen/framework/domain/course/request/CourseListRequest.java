package com.bowen.framework.domain.course.request;


import com.bowen.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CourseListRequest extends RequestData {
    //公司Id
    private String companyId;
}

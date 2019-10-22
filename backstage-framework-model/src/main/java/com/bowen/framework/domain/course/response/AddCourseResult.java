package com.bowen.framework.domain.course.response;


import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class AddCourseResult extends ResponseResult {
    public AddCourseResult(ResultCode resultCode, String courseid) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}

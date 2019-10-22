package com.bowen.framework.domain.course.response;


import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class DeleteCourseResult extends ResponseResult {
    public DeleteCourseResult(ResultCode resultCode, String courseId) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}

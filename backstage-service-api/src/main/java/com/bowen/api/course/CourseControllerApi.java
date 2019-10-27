package com.bowen.api.course;


import com.bowen.framework.domain.course.Teachplan;
import com.bowen.framework.domain.course.ext.TeachplanNode;
import com.bowen.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;



@Api(value="课程管理接口",tags = "课程管理接口，提供课程的增、删、改、查")
public interface CourseControllerApi {
    @ApiOperation("课程计划查询")
    public TeachplanNode findTeachplanList(String courseId);

    @ApiOperation("添加课程计划")
    public ResponseResult addTeachplan(Teachplan teachplan);
}

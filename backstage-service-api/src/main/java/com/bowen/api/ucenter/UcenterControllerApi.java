package com.bowen.api.ucenter;


import com.bowen.framework.domain.ucenter.ext.XcUserExt;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Administrator.
 */
@Api(value = "用户中心",tags = "用户中心管理")
public interface UcenterControllerApi {
    @ApiOperation("根据用户账号查询用户信息")
    public XcUserExt getUserext(String username);
}

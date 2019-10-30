package com.bowen.api.auth;


import com.bowen.framework.domain.ucenter.request.LoginRequest;
import com.bowen.framework.domain.ucenter.response.JwtResult;
import com.bowen.framework.domain.ucenter.response.LoginResult;
import com.bowen.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by Administrator.
 */
@Api(value = "用户认证", tags = "用户认证接口")
public interface AuthControllerApi {
    @ApiOperation("登录")
    public LoginResult login(LoginRequest loginRequest);

    @ApiOperation("退出")
    public ResponseResult logout();

    @ApiOperation("查询用户jwt令牌")
    public JwtResult userjwt();
}

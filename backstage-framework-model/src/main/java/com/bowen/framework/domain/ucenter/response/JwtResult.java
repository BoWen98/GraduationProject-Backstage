package com.bowen.framework.domain.ucenter.response;

import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * /5/21.
 */
@Data
@ToString
@NoArgsConstructor
public class JwtResult extends ResponseResult {
    public JwtResult(ResultCode resultCode, String jwt) {
        super(resultCode);
        this.jwt = jwt;
    }
    private String jwt;
}

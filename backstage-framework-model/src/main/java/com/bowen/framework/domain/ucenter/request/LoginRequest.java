package com.bowen.framework.domain.ucenter.request;

import com.bowen.framework.model.request.RequestData;
import lombok.Data;
import lombok.ToString;

/**
 * /3/5.
 */
@Data
@ToString
public class LoginRequest extends RequestData {

    String username;
    String password;
    String verifycode;

}

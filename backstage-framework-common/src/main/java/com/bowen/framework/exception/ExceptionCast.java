package com.bowen.framework.exception;


import com.bowen.framework.model.response.ResultCode;


public class ExceptionCast {

    public static void cast(ResultCode resultCode){
        throw new CustomException(resultCode);
    }
}

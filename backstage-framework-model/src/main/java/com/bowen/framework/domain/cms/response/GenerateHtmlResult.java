package com.bowen.framework.domain.cms.response;

import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;


@Data
public class GenerateHtmlResult extends ResponseResult {
    String html;
    public GenerateHtmlResult(ResultCode resultCode, String html) {
        super(resultCode);
        this.html = html;
    }
}

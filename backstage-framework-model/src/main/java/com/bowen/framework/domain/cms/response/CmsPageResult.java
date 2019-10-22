package com.bowen.framework.domain.cms.response;

import com.bowen.framework.domain.cms.CmsPage;
import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;


@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode,CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}

package com.bowen.framework.domain.media.response;

import com.bowen.framework.domain.media.MediaFile;
import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * /3/31.
 */
@Data
@NoArgsConstructor
public class MediaFileResult extends ResponseResult {
    MediaFile mediaFile;
    public MediaFileResult(ResultCode resultCode, MediaFile mediaFile) {
        super(resultCode);
        this.mediaFile = mediaFile;
    }
}

package com.bowen.framework.domain.filesystem.response;

import com.bowen.framework.domain.filesystem.FileSystem;
import com.bowen.framework.model.response.ResponseResult;
import com.bowen.framework.model.response.ResultCode;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class UploadFileResult extends ResponseResult{
    @ApiModelProperty(value = "文件信息", example = "true", required = true)
    FileSystem fileSystem;
    public UploadFileResult(ResultCode resultCode, FileSystem fileSystem) {
        super(resultCode);
        this.fileSystem = fileSystem;
    }

}

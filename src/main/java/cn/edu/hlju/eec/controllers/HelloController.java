package cn.edu.hlju.eec.controllers;

import cn.edu.hlju.eec.common.Result;
import cn.edu.hlju.eec.constants.StringsConstants;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zjxu97 at 2020-05-27 01:25
 */
@Slf4j
@Api(tags = "测试用")
@RestController
@RequestMapping(StringsConstants.API_PREFIX + "/test")
public class HelloController {

    @ApiOperation(value = "打招呼")
    @GetMapping(value = "hello")
    public Result<String> hello() {
        return Result.success("黑龙江大学电子工程学院信号与系统实验平台");
    }

}

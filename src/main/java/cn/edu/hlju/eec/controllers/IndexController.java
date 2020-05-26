package cn.edu.hlju.eec.controllers;

import cn.edu.hlju.eec.constants.StringsConstants;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zjxu97 at 2020-05-27 02:08
 */
@Controller
public class IndexController {

    @GetMapping(StringsConstants.API_PREFIX + "/index")
    public String index() {
        return "index.html";
    }

}
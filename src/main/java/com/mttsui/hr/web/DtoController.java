package com.mttsui.hr.web;

import com.mttsui.hr.common.dto.Resp;
import com.mttsui.hr.common.dto.RestUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;

/**
 * @Author: zsxu2
 * @Date 2018/2/11 8:29
 */
@RestController
@RequestMapping("/dto")
public class DtoController {

    @GetMapping("/resp")
    public Resp resp(){
        return RestUtil.genOk();
    }

    @GetMapping("/dataresp")
    public Resp dataresp(){
        return RestUtil.genDataOk(new Date());
    }

    @GetMapping("/pagedataresp")
    public Resp pagedataresp(){
        return RestUtil.genPageDataOk(new ArrayList<String>(), 10);
    }
}

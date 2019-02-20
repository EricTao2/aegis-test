package com.github.erictao2.aegistest;

import com.github.erictao2.aegis.api.annotation.DefendModify;
import com.github.erictao2.aegis.api.annotation.DefendReplay;
import com.github.erictao2.aegis.api.annotation.DefendTimeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author TJX
 * @Title: DemoController
 * @date 2018/7/2713:30
 */
@RestController
// You also can use annotation in Controller class
//@DefendModify
public class DemoController {

    @RequestMapping("/1")
    //@DefendModify(name ="reqSign", algorithm = "md5", key = "aegis-key")
    @DefendModify
    public String test1(){
        return "test1-demo" ;
    }

    @GetMapping("/2")
    //@DefendTimeout(name ="timestamp", timeout = 1000, timeUnit = {TimeUnit.MILLISECONDS})
    @DefendTimeout
    public String test2(){
        return "test2-demo" ;
    }

    @GetMapping("/3")
    //@DefendReplay(name = "reqNo", prefix = "aegisReqNo", timeout = 1000 , timeUnit = {TimeUnit.MILLISECONDS})
    @DefendReplay
    public String test3(){
        return "test3-demo" ;
    }


}

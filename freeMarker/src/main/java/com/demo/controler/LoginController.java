package com.demo.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dajie on 16-7-4.
 */
@Controller
@RequestMapping(value = "/demo")
public class LoginController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "/login.do")
    public ModelAndView login(HttpServletRequest request, String stuNumber, String stuPassword) {
        logger.info("进入login方法");
        ModelAndView mv = new ModelAndView("index");
        String title = "Spring MVC And Freemarker";
        String content = "Hello world ， test my first spring mvc ! ";
        logger.info("title:{}", title);
        logger.info("content:{}", content);
        mv.addObject("title", title);
        mv.addObject("content", content);

        mv.addObject("stuNumber", stuNumber);
        mv.addObject("stuPassword", stuPassword);
        return mv;
    }

    @RequestMapping(value = "/show.do")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        logger.info("进入show方法");
        ModelAndView mv = new ModelAndView("show");
        String title = "Spring MVC And Freemarker";
        String content = "Hello world ， test my first spring mvc ! ";
        logger.info("title:{}", title);
        logger.info("content:{}", content);
        mv.addObject("title", title);
        mv.addObject("content", content);

        mv.addObject("foo", true);

        List<String> weekList = new ArrayList<String>();
        weekList.add("星期日");
        weekList.add("星期一");
        weekList.add("星期二");
        weekList.add("星期三");
        weekList.add("星期四");
        weekList.add("星期五");
        weekList.add("星期六");
        mv.addObject("weekList", weekList);

        //传递空
        mv.addObject("myName", null);


        Map<String, String> map = new HashMap<String, String>();
        map.put("name","张三");
        map.put("height","180");
        map.put("wight","150");
        mv.addObject("map", map);


        return mv;
    }

}

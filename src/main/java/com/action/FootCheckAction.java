package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Controller
@RequestMapping("/footCheckAction")
public class FootCheckAction {

    //添加一个物品到购物车
    @RequestMapping("/addFootCheck")
    public String addFootCheck(String fname2,int fnum){
        System.out.println(fname2+":"+fnum);
        //查询到该物品的信息，数量，添加到购物车中

        return null;
    }
}

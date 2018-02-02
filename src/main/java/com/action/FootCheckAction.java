package com.action;

import com.entity.Foot;
import com.service.IFootCheckService;
import com.service.IFootService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Controller
@RequestMapping("/footCheckAction")
public class FootCheckAction {

    @Resource
    private IFootService footService;
    private IFootCheckService checkService;

    //添加一个物品到购物车
    @RequestMapping("/addFootCheck")
    public String addFootCheck(String fname2,int fnum){
        System.out.println(fname2+":"+fnum);
        //查询到该物品的信息，数量，添加到购物车中;
        System.out.println(footService.findFootByName(fname2));
        Foot foot = footService.findFootByName(fname2);
        if(checkService.addF_C(fnum,foot)){
            System.out.println("成功");
        }else{
            System.out.println("失败");
        }
        return null;

    }

    public void setFootService(IFootService footService) {
        this.footService = footService;
    }

    public void setCheckService(IFootCheckService checkService) {
        this.checkService = checkService;
    }
}

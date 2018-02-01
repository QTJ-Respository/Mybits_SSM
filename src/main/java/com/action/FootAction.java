package com.action;

import com.entity.Foot;
import com.service.IFootService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/1/31 0031.
 */
@Controller
@RequestMapping("/footAction")
public class FootAction {

    @Resource
    private IFootService footService;

    @RequestMapping("/addFoot")
    public String addFoot(String fname, double fprice, RedirectAttributes attr){
        Foot foot = new Foot();
        foot.setFname(fname);
        foot.setFprice(fprice);
        if(footService.addFoot(foot)){
            attr.addAttribute("rtype",1);
        }else{
            attr.addAttribute("rtype",-1);
        }
        return "redirect:/pages/main.jsp";
    }

    //查询所有物品名称
    @RequestMapping("/footList")
    @ResponseBody
    public List footList(){
        System.out.println(footService.footList());
        return footService.footList();
    }
    //根据名称查询物品信息
    @RequestMapping("/findfootByName")
    @ResponseBody
    public Foot findfootByName(String fname){
        return footService.findFootByName(fname);
    }



    public void setFootService(IFootService footService) {
        this.footService = footService;
    }
}

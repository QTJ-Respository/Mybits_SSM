package com.action;

import com.entity.Emp;
import com.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by Administrator on 2018/1/30 0030.
 */
@Controller
@RequestMapping("/loginAction")
public class LoginAction {

    @Resource
    private ILoginService loginService;


    @RequestMapping("/dologin")
    public String dologin(int d_ID, String d_pwd, Model model, HttpSession session){
        Emp emp = loginService.findEmp(d_ID,d_pwd);
        System.out.println(emp);
        if(emp!=null){
            session.setAttribute("emp",emp);
            return "redirect:/pages/main.jsp";
        }else{
            model.addAttribute("mess","请输入正确用户名密码");
            return "redirect:/index.jsp";
        }
    }





}

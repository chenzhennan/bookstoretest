package com.scut.bookstore.web.user;

import com.scut.bookstore.entity.User;
import com.scut.bookstore.entity.pojo.ResultBean;
import com.scut.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author: kevin
 * @data: 2019/4/25 15:49
 * @description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册页面
     */
    @RequestMapping("/toRegister.html")
    public String toRegister(){
        return "bookstore/user/register";
    }

    /**
     * 登录页面
     */
    @RequestMapping("/toLogin.html")
    public String toLogin(){
        return "bookstore/login.html";
    }

    /**
     * 用户登录
     */
    @RequestMapping("/login.do")
    public void login(String username, String password,
                      HttpServletRequest request, HttpServletResponse response)throws IOException, LoginException{
        User user = userService.checkLogin( username, password);
        if(user != null){
            /**
             * 登录成功，返回首页
             */
            request.getSession().setAttribute("user", user);
            response.sendRedirect("/bookstore/index.html");
        }
        else{
            response.sendRedirect("/bookstore/error.html");
            throw new LoginException("用户名不存在或密码错误！");
        }
    }

    /**
     * 用户注册
     */
    @RequestMapping("/register.do")
    public void register(String userName, String password, String phone,String mailAddress,
                         HttpServletRequest request, HttpServletResponse response)throws IOException, LoginException{
        User user = new User();
        user.setUserName(userName);
        user.setPassword(password);
        user.setPhone(phone);
        user.setMailAddress(mailAddress);
        user.setIntegration(0);

        /**
         * 创建用户
         */
        userService.create(user);

        /**
         * 获取用户信息
         */
        request.getSession().setAttribute("user", user);

        /**
         * 返回主界面
         */
        response.sendRedirect("/bookstore/index.html");
    }

    @RequestMapping("/logout.do")
    public void logout(HttpServletRequest request, HttpServletResponse response)throws IOException{
        request.getSession().removeAttribute("user");
        response.sendRedirect("/bookstore/index.html");
    }

    /**
     * 验证用户名是否唯一
     */
    @RequestMapping("/checkUsername.do")
    public ResultBean<Boolean> checkUsername(String userName){
        List<User> user = userService.findByUsername(userName);
        if(user == null || user.isEmpty()){
            return new ResultBean <>(true);
        }
        return new ResultBean<>(false);
    }

    @RequestMapping("/error.html")
    public String error(HttpServletRequest request, HttpServletResponse response){
        return "error!";
    }
}

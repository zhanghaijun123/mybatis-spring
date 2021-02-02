package tk.mybatis.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * @Description: 主页面控制器
 * @Author zhanghj
 * @Date 2021/2/2 13:41
 */
@Controller
public class IndexController {
    @RequestMapping(value = {"","/index"})
    public ModelAndView dict(Model model){
        ModelAndView mv=new ModelAndView("index");
        model.addAttribute("now",new Date());
        return mv;
    }
}

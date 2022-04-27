package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public ModelAndView home() {
        System.out.println("Start oif Controller");
        List<User> listUser = userService.listAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listUsers", listUser);
        return mav;
    }
}
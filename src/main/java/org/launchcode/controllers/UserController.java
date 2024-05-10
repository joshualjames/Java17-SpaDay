package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @GetMapping("add")
    public String displayAddUserForm() {
        return "/user/add";
    }

    @PostMapping("add")
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify, String username, String email) {
// add form submission handling code here
        model.addAttribute("user",user);
        if (verify.equals(user.getPassword())) {
            return "user/index";
        } else {
            model.addAttribute("error", "Error, passwords must match.");
            model.addAttribute("username", username);
            model.addAttribute("email", email);
            return "user/add";
        }
    }

    @GetMapping("index")
    public String displayUserWelcome(Model model, String user){
//        model.addAttribute()
        return "user/index";
    }


}

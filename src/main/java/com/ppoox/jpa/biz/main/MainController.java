package com.ppoox.jpa.biz.main;

import com.ppoox.jpa.biz.main.member.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/main")
    public String main(Model model) {
        model.addAttribute("data", "main!!");

        return "main";
    }
}

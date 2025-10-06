package com.Assignment5DJJJ.Assignment5DJJJ;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
   
      @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
}

  // Login
  @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }
}
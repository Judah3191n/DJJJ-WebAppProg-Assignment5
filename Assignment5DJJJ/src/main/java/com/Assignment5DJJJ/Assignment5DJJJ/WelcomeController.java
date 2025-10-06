package com.Assignment5DJJJ.Assignment5DJJJ;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {
   
@GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

      @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
      model.addAttribute("username", username);
      model.addAttribute("password", password);
        /* 
        if ("user".equals(username) && "pass".equals(password)) {
            model.addAttribute("message", "Login successful!");
            return "welcome";
        } else {
            model.addAttribute("message", "Invalid username or password.");
            return "login";
        }
            */
            return "login";
    }

  
}
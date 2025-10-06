package com.Assignment5DJJJ.Assignment5DJJJ;

import org.springframework.ui.Model;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class WelcomeController {
  public ArrayList<User> users = new ArrayList<User>();

  @PostMapping("/login")
    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {

  @GetMapping("/login")
  public String showLoginForm() {
    return "login";
  }

  // Register
  @GetMapping("/register")
  public String showRegisterForm() {
    return "register";
  }

  @PostMapping("/register")
  public String postMethodName(@RequestParam String username, @RequestParam String password, @RequestParam String email,
    @RequestParam String address, Model model) {
    for (User user : users) {
      if (user.getName().equals(username)) {
        model.addAttribute("usernameError", "Username already taken");
        return "register";
      }
    }
    users.add(new User(username, password, email, address));
    return "login";
  }

}
}
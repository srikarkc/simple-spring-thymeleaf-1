package ca.srikar.thymeleaf_demo.controller;

import ca.srikar.thymeleaf_demo.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/")
    public String getUsers(Model model) {
        List<User> users = Arrays.asList(
                new User(1L, "John", "Doe", "john.doe@example.com"),
                new User(2L, "Jane", "Doe", "jane.doe@example.com"),
                new User(3L, "Jim", "Beam", "jim.beam@example.com")
        );

        model.addAttribute("users", users);
        return "users";
    }
}

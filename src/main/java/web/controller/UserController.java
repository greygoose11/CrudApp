package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import web.Model.User;
import web.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;


//    @Qualifier(value = "userServiceImpl")
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
    @GetMapping(value = "/")
    public String home(){
        return "redirect:/users";
    }
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String listUsers(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("listUsers", userService.listAll());
        return "index1";
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@ModelAttribute("user") User user){
        userService.save(user);
//        if(user.getId() == 0) {
//            this.userService.addUser(user);
//        } else {
//            this.userService.updateUser(user);
//        }
        return "redirect:/users";
    }

    @RequestMapping("/delete/{id}")
    public String removeUser(@PathVariable("id") long id) {
        userService.delete(id);

        return "redirect:/users";
    }

    @GetMapping("/edit/{id}")
    public String editUser(@PathVariable("id") long id, Model model) {
        model.addAttribute("user", userService.get(id));
//        model.addAttribute("listUsers", this.userService.listUsers());

        return "editUser";
    }

    @PostMapping("/edit")
    public String editUser(@ModelAttribute("user") User user) {
       userService.save(user);

        return "redirect:/users";
    }

//    @RequestMapping("/userdate/{id}")
//    public String userData(@PathVariable("id") long id, Model model) {
//        model.addAttribute("user", this.userService.getUserById(id));
//
//        return "userdate";
//
//    }


//    @RequestMapping(value = { "/", "/home" }, method = RequestMethod.GET)
//    public ModelAndView hello(HttpServletResponse response) throws IOException {
//        ModelAndView modelAndView = new ModelAndView();
//        List<User> usersList = new ArrayList<>();
//        usersList.add(new User(1,"Ivan", "Ivanov",40 ));
//        usersList.add(new User(2,"Федор", "Федоров",30 ));
//        usersList.add(new User(5,"Petr", "Petrov",30 ));
//        modelAndView.addObject("userList", usersList);
//        modelAndView.setViewName("index1");
//        return modelAndView;
//    }/*
//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    public ModelAndView editUsers(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("editIndex");
//        return modelAndView;
//    }

}

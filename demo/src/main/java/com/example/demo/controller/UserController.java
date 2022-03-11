package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.data.entity.User;
import com.example.demo.data.repository.UserRepository;
import com.example.demo.form.UserForm;

@Controller
public class UserController {
	@Autowired //@Autowiredアノテーションを付けると、Spring Bootが自動でインスタンスをInject(注入)します。
	 private UserRepository userRepository;
	
	@GetMapping("/users")
	public String getUsers(Model model) {// 引数にorg.springframework.ui.Modelを追加
		List<User> users = userRepository.findAll();
		// Modelにusersを追加
		model.addAttribute("users", users);
		  return "users"; // テンプレートは src/main/resources/templates/users.html とします。
		 }
	
	@GetMapping("/newuser")
	public String getNewUser(Model model) {
		UserForm userForm = new UserForm();
		model.addAttribute("userForm", userForm);
		return "newuser";
	}
	
	@PostMapping("/newuser")
    public String registerUser(UserForm userForm) {
        // UserFormの値をUserクラス（Entity）にセットする
        User user = new User();
        user.setName(userForm.getName());
        user.setEmail(userForm.getEmail());

        // データベースに保存
        userRepository.save(user);

        return "redirect:/users";
    }
}

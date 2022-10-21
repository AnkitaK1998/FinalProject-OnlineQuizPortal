package com.quiz.portal;

import com.quiz.portal.helper.UserFoundException;
import com.quiz.portal.model.Role;
import com.quiz.portal.model.User;
import com.quiz.portal.model.UserRole;
import com.quiz.portal.repo.QuizRepository;
import com.quiz.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class OnlineQuizPortalApp implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    public QuizRepository quizRepository;

    public static void main(String[] args) {


        SpringApplication.run(OnlineQuizPortalApp.class, args);


    }

    @Override
    public void run(String... args) {
//        try {
//
//
//            System.out.println("starting code");
//            User user = new User();
//
//            user.setFirstName("Ankita");
//            user.setLastName("Khandekar");
//            user.setUsername("Ankita@1998");
//            user.setPassword(this.bCryptPasswordEncoder.encode("abc"));
//            user.setEmail("abc@gmail.com");
//            user.setProfile("default.png");
//            user.setPhone("9988776612");
//            Role role1 = new Role();
//            role1.setRoleId(44L);
//            role1.setRoleName("ADMIN");
//
//            Set<UserRole> userRoleSet = new HashSet<>();
//            UserRole userRole = new UserRole();
//
//            userRole.setRole(role1);
//
//            userRole.setUser(user);
//
//            userRoleSet.add(userRole);
//
//            User user1 = this.userService.createUser(user, userRoleSet);
//            System.out.println(user1.getUsername());
//
//
//        } catch (UserFoundException e) {
//            e.printStackTrace();
//
//
//        } catch (Exception e) {
//          e.printStackTrace();
//        }
//
//
  }


}

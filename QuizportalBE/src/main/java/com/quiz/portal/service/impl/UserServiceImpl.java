package com.quiz.portal.service.impl;

import com.quiz.portal.helper.UserFoundException;
import com.quiz.portal.model.User;
import com.quiz.portal.model.UserRole;
import com.quiz.portal.repo.RoleRepository;
import com.quiz.portal.repo.UserRepository;
import com.quiz.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.oauth2.core.oidc.OidcIdToken;
import org.springframework.security.oauth2.core.oidc.OidcUserInfo;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    //creating user
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws UserFoundException {


        User local = this.userRepository.findByUsername(user.getUsername());
        if (local != null) {
            System.out.println("User is already there !!");
            throw new UserFoundException();
        } else {
            //user create
            for (UserRole ur : userRoles) {
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            local = this.userRepository.save(user);

        }

        return local;
    }

    //getting user by username
    @Override
    public User getUser(String username) {
//        return this.userRepository.findByUsername(username);
      User user = this.userRepository.findByUsername(username);
      if (user == null) {
        System.out.println("User not found");
        throw new UsernameNotFoundException("No user found !!");
      }

      return user;
    }

    @Override
    public void deleteUser(Long userId) {
        this.userRepository.deleteById(userId);
    }




}

package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entities.AppUser;
import com.example.demo.Repository.UserRepository;

@Service
public class UserService {
    UserRepository userRepository;
    	@Autowired
	    public UserService(UserRepository userRepository){
		this.userRepository=userRepository;
	}

    public List<AppUser> getAllPeople(){
        return userRepository.findAll();
        
    }
     public void save(AppUser user){
        userRepository.save(user);
    }
}

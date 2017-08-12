package com.example.demo;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.User;
import com.example.demo.UserService;
import com.example.demo.CustomErrorType;
@RestController
@RequestMapping("/api")
public class DemoController {
 
	public static final Logger logger = LoggerFactory.getLogger(DemoController.class);
	UserService userService;//Service which will do all data retrieval/manipulation work
 
    @RequestMapping(value = "/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers() {
        List<User> users = userService.findAllUsers();
        if (users.isEmpty()) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
            // You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
    }
//    public String listAllUsers() {
//        
//        return "hiii";
//    }
 
    // -------------------Retrieve Single User------------------------------------------
 
   
}
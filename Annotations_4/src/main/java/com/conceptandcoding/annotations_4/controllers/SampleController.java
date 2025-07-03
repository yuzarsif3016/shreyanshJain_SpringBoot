package com.conceptandcoding.annotations_4.controllers;

import com.conceptandcoding.annotations_4.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SampleController {

//    @GetMapping("/fetchUser")
//    public String getUserDetails(@RequestParam(name = "firstName") String firstName,
//                                 @RequestParam(name = "lastName", required = false) String lastName,
//                                 @RequestParam(name = "age", required = false, defaultValue = "0") int age) {
//
//        if (lastName == null) {
//            lastName = "";
//        }
//
//        return "Fetching and returning user details as follows = " + firstName + " " + lastName + " " + age;
//    }

//
//    //PathVariable
//    @GetMapping(path="/fetchUser/{firstName}")
//    public String getUserDetails(@PathVariable (value = "firstName") String firstName){
//        return "Fetching and returning user details as follows = " + firstName;
//    }

    //RequestBody
    @PostMapping(path ="/saveUser")
    public String getUserDetails(@RequestBody User user){
        return "User Created " + user.getUserName() + ":" + user.getEmail();
    }
}

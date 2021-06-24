//package com.example.demo1.controllers;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import lombok.extern.java.Log;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demo1.dao.UserRepository;
//import com.example.demo1.models.User;
//
//@Controller
//@Log
//@RequestMapping("student")
//public class UserController {
//
//    @Autowired
//    StudentService sService;
//
//    @Autowired
//    CourseService courseService;
//
//    @ModelAttribute("student")
//    public Student initStudent(){
//        return new Student();
//    }
//
//    @ModelAttribute("course")
//    public Course initCourse(){
//        return new Course();
//    }
//
//    @GetMapping("/register")
//    public String registerPage() {
//        return "register"; }
//
//    @PostMapping("/register")
//    public String registerNewUser(@ModelAttribute("User") @Valid User user, BindingResult result, Model model) {
//
//        if (result.hasErrors()) {
//            log.warning("Invalid input");
//            return "register";
//        }
//
//        model.addAttribute("user", user);
//        sService.saveUser(user);
//        return "redirect:../student/registertocourse/"+student.getSId();
//    }
//
//
//    @GetMapping("/registertocourse/{id}")
//    public String coursePage(@PathVariable("id") Long id, Model model) {
//        Student student = sService.getStudentById(id);
//        // Student student = (Student) model.getAttribute("student");
//
//        List<Course> courseList = courseService.getAllCourses();
//        model.addAttribute("student", student);
//        model.addAttribute("courses", courseList);
//        return "course";
//    }
//
//    @PostMapping("/progress")
//    public String registerStudentToCourse(@RequestParam("sId") Long id,
//                                          @RequestParam("sCourses") List<Course> courses,
//                                          Model model) {
//
//        Student student = sService.getStudentById(id);
//        student.getSCourses().forEach(courses::add);
//        student.setSCourses(courses);
//        sService.saveStudent(student);
//        return "confirm";
//
//    }
//}

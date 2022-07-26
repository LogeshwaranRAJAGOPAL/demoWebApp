package com.sample.demoWebApp.Controller;

import com.sample.demoWebApp.Model.Student;
import com.sample.demoWebApp.Repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@Controller
public class controller {

    @Autowired
    private repository repo;



    @GetMapping("/")
    public String StudentList(Model model)
    {
        model.addAttribute("students",repo.findAll());
        return "index";
    }

    @GetMapping("/newStudent")
    public String newStudentForm(Student student)
    {
        return "newStudent";
    }
    @PostMapping("/newStudent")
    public String newStudent(Student student,BindingResult result,Model model)
    {
        if(result.hasErrors())
        {
            return "redirect:/";
        }
        repo.save(student);
        return "redirect:/";
    }

    @RequestMapping("/edit")
    public String edit(Student student)
    {
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateStudent(@PathVariable("id") String id,Model model)
    {
        Student student = repo.findById(id).get();
        repo.save(student);
        return "redirect:/";
    }

    @RequestMapping("/delete")
    public String deleteStudent(@ModelAttribute Student student, Model model)
    {
        repo.delete(student);
        return "redirect:/";
    }





}
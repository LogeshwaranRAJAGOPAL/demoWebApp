package com.sample.demoWebApp.Controller;

import com.sample.demoWebApp.Model.Student;
import com.sample.demoWebApp.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class controller {

    @Autowired
    private StudentRepository repo;



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

    @RequestMapping("/edit/{id}")
    public ModelAndView edit(@PathVariable Integer id)
    {
        Student student=repo.findById(id).get();
        ModelAndView mv=new ModelAndView("edit");
        mv.addObject("student",student);

        return mv;
    }

    @PostMapping("/edit")
    public String updateStudent(@ModelAttribute ("student") Student student)
    {
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
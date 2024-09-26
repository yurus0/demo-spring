package com.example.demo.Controller;
import com.example.demo.Service.ModuleService;
import com.example.demo.Model.Module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ModuleController {
    @Autowired
    private ModuleService moduleService;

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }

    // Get modules list
    @RequestMapping("/modules")
    public List<Module> getModules() {
        return moduleService.getModules(); // Appel correct de la méthode
    }

    // Get one module
    @RequestMapping("/modules/{id}")
    public Module getModule(@PathVariable Integer id) {
        return moduleService.getModule(id);
    }

    //ADD
    @RequestMapping(method= RequestMethod.POST, value="/modules")
    public void ajouterModule(@RequestBody Module module) {
        moduleService.ajouterModule(module);
    }

    //edit
    @RequestMapping(method=RequestMethod.PUT, value="/modules/{id}")
    public void modifierModule(@RequestBody Module module, @PathVariable Integer id) {
        moduleService.modifierModule(id, module);
    }

    //delete
    @RequestMapping(method=RequestMethod.DELETE, value="/modules/{id}")
    public void supprimerModule(@PathVariable Integer id) {
        moduleService.supprimerModule(id);
    }
}
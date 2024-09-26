package com.example.demo.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.example.demo.Model.Module;
import org.springframework.stereotype.Service;

@Service
public class ModuleService {
    // Utiliser une liste modifiable
    private List<Module> modules = new ArrayList<>(Arrays.asList(
            new Module(10, "La plateforme Java Standard Edition", "Description de la plateforme Java SE"),
            new Module(12, "La plateforme Java Enterprise Edition", "Description de la plateforme Java EE")
    ));

    public List<Module> getModules() {
        return modules;
    }

    public Module getModule(Integer id) {
        for (Module module : modules) {
            if (id.equals(module.getId())) {
                return module;
            }
        }
        return null; // Module non trouvé
    }

    public void ajouterModule(Module module) {
        modules.add(module); // Ajout d'un module
    }

    public void modifierModule(Integer id, Module module) {
        for (int i = 0; i < modules.size(); i++) {
            Module m = modules.get(i);
            if (id.equals(m.getId())) {
                modules.set(i, module); // Remplacement du module
                return;
            }
        }
        // Optionnel : lancer une exception ou un message si le module n'est pas trouvé
    }

    public void supprimerModule(Integer id) {
        modules.removeIf(m -> id.equals(m.getId())); // Suppression d'un module
    }
}
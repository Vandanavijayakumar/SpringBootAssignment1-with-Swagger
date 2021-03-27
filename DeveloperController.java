package org.example.SpringBootSample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeveloperController {

    @Autowired
    DeveloperService developerService;

    /**
     * gets the details of all developers
     * @return
     */
    @RequestMapping("/developers")
    public List<Developers> getDevelopers() {
        return developerService.getAllDevelopers();
    }

    /**
     * creates a new developer entity
     * @param developers
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/developers")
    public String addDevelopers(@RequestBody Developers developers) {
        developerService.addDeveloper(developers);
        return ("Developer is created successfully");
    }

    /**
     * updates the name of an existing developer whose id matches
     * @param developers
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/developers/{id}")
    public String updateDeveloper(@RequestBody Developers developers, @PathVariable String id) {
        developerService.updateDeveloper(id, developers);
        return ("Developer is updated successfully");
    }

    /**
     * deletes an existing developer
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.DELETE, value = "/developers/{id}")
    public String deleteDeveloper(@PathVariable String id) {
        developerService.deleteDeveloper(id);
        return ("Developer is deleted successfully");
    }
}
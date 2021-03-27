package org.example.SpringBootSample;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DeveloperService {
    /**
     * stores the details of developers
     */
    public List<Developers> developerList = new ArrayList(Arrays.asList(
            new Developers("1","Developer1","Java , SpringBoot"),
            new Developers("2","Developer2","Java , SpringBoot,REST,AWS")
    ));

    /**
     * gets the details of developers
     * @return
     */
    public List<Developers> getAllDevelopers(){
        return developerList;
    }

    /**
     * Adds a new developer to the list
     * @param developers
     */
    public void addDeveloper(Developers developers){
        developerList.add(developers);
    }

    /**
     * updates the name of existing developer
     * @param id
     * @param developers
     */
    public void updateDeveloper(String id, Developers developers){
        Developers developer = developerList.stream().filter(d-> d.getId().equals(id)).findFirst().get();
        developer.setName(developers.getName());
    }

    /**
     * deletes an existing developer
     * @param id
     */
    public void deleteDeveloper(String id){
        Developers developer = developerList.stream().filter(d-> d.getId().equals(id)).findFirst().get();
        developerList.remove(developer);
    }
}

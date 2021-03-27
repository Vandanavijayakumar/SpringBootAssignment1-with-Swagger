package org.example.SpringBootSample;

public class Developers {
    private String id;
    private String name;
    private String skills;

    public Developers() {
    }

    public Developers(String id, String name, String skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {

        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }
}

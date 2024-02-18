package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Job extends AbstractEntity {


    //private String name;
     @OneToMany
    private Employer employer;

     @ManyToMany(mappedBy="skills")
    private Skill skills;



    public Job() {
    }

    // Initialize the id and value fields.
    public Job(Employer anEmployer, Skill someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    // Getters and setters.


    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setSkills(Skill skills) {
        this.skills = skills;
    }

    public Skill getSkills() {
        return skills;
    }
}

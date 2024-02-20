package org.launchcode.techjobs.persistent.models;


import jakarta.persistence.*;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {


    //private String name;
    @ManyToOne()
    private Employer employer;

    @ManyToMany()
    private List<Skill> skills = new ArrayList<>();


    public Job(Employer anEmployer, List<Skill> someSkills) {
        super();
        this.employer = anEmployer;
        this.skills = someSkills;
    }

    public Job() {
    }

    // Initialize the id and value fields.


    // Getters and setters.


    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    public List<Skill> getSkills() {
        return skills;
    }
}


package org.cap.apps.freelancerapp.freelancerms.entities;

import org.cap.apps.freelancerapp.feedbackms.entities.Feedback;
import org.cap.apps.freelancerapp.jobapplicationms.entities.JobApplication;
import org.cap.apps.freelancerapp.skillexperiencems.entities.SkillExperience;

import javax.persistence.Entity;
import java.util.List;
import java.util.Objects;

public class Freelancer {
    private Long id;

    private List<Feedback>feedbacks;

    private String firstName,lastName,password;


    private List<JobApplication>appliedJobs;


    private List<SkillExperience>skills;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<JobApplication> getAppliedJobs() {
        return appliedJobs;
    }

    public void setAppliedJobs(List<JobApplication> appliedJobs) {
        this.appliedJobs = appliedJobs;
    }

    public List<SkillExperience> getSkills() {
        return skills;
    }

    public void setSkills(List<SkillExperience> skills) {
        this.skills = skills;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Freelancer that = (Freelancer) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

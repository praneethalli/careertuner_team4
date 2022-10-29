package org.cap.apps.freelancerapp.skillexperiencems.dao;

import org.cap.apps.freelancerapp.skillexperiencems.entities.SkillExperience;

public interface ISkillExperienceDao {
    SkillExperience save(SkillExperience experience);

    SkillExperience update(SkillExperience experience);

    void remove(SkillExperience experience);

    SkillExperience findById(Long id);
}

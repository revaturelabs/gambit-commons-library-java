package com.revature.commons.dto.trainer;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.commons.dto.batch.Batch;
import com.revature.commons.dto.skill.Skill;
import com.revature.commons.dto.unavailable.Unavailable;
import com.revature.commons.dto.user.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Trainer {
    private Integer id;
    private User info;
    private String title;
    private Boolean active;
    private Set<Batch> batches;
    private Set<Certification> certifications;
    private Set<Skill> skills;
    private Set<Unavailable> unavailabilities;
}

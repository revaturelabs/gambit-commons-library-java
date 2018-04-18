package com.revature.commons.dto.skill;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.commons.dto.batch.Batch;
import com.revature.commons.dto.curriculum.Curriculum;
import com.revature.commons.dto.trainer.Trainer;
import lombok.*;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"trainers", "curricula", "batches"})
@ToString(exclude = {"trainers", "curricula", "batches"})
public class Skill {
    private Integer id;
    private String name;
    private Boolean active;
    private Set<Curriculum> curricula;
    private Set<Trainer> trainers;
    private Set<Batch> batches;
}

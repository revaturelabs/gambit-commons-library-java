package commons.skill;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.batch.Batch;
import commons.curriculum.Curriculum;
import commons.trainer.Trainer;
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

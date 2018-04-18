package commons.curriculum;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.batch.Batch;
import commons.skill.Skill;
import lombok.*;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"skills"})
@ToString(exclude = {"skills"})
public class Curriculum {
    private Integer id;
    private String name;
    private Boolean active;
    private Boolean core;
    private Set<Batch> batches;
    private Set<Skill> skills;
}

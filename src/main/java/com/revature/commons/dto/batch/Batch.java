package commons.batch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.curriculum.Curriculum;
import commons.location.Location;
import commons.location.Room;
import commons.skill.Skill;
import commons.trainer.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Batch {
    private Integer id;
    private String name;
    private Timestamp startDate;
    private Timestamp endDate;
    private BatchStatus status;
    private Curriculum curriculum;
    private Skill focus;
    private Set<Skill> skills;
    private Trainer trainer;
    private Trainer cotrainer;
    private BatchLocation batchLocation;
    private Location location;
    private Room room;
}

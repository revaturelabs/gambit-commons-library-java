package commons.unavailable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.location.Room;
import commons.trainer.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.Set;

@JsonIgnoreProperties
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Unavailable {
    private Integer id;
    private Timestamp startDate;
    private Timestamp endDate;
    private Set<Room> rooms;
    private Set<Trainer> trainers;
}

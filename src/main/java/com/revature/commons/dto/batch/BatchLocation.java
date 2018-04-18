package commons.batch;

import commons.location.Building;
import commons.location.Location;
import commons.location.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchLocation {
    private Integer id;
    private Building building;
    private Location location;
    private Room room;
}

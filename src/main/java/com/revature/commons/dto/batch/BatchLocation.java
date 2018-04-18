package com.revature.commons.dto.batch;

import com.revature.commons.dto.location.Building;
import com.revature.commons.dto.location.Location;
import com.revature.commons.dto.location.Room;
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

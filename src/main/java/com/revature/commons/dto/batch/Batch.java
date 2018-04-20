package com.revature.commons.dto.batch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.revature.commons.dto.curriculum.Curriculum;
import com.revature.commons.dto.location.Location;
import com.revature.commons.dto.location.Room;
import com.revature.commons.dto.trainer.Trainer;
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
    private Trainer trainer;
    private Trainer cotrainer;
    private Timestamp startDate;
    private Timestamp endDate;
    private Location location;
    private Room room;
    private Curriculum curriculum;
    private Set<String> notes;
    private BatchStatus status;
}

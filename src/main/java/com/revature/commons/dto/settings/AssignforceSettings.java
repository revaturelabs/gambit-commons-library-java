package commons.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.location.Building;
import commons.location.Room;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AssignforceSettings {
    private Integer id;
    private String alias;
    private Integer trainersPerPage;
    private Integer reportGrads;
    private Integer batchLength;
    private Integer reportIncomingGrads;
    private Integer minBatchSize;
    private Integer maxBatchSize;
    private Integer trainerBreakDays;
    private Room defaultLocation;
    private Building defaultBuilding;
    private String defaultNamePattern;
}

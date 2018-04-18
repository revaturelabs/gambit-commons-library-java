package commons.location;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import commons.unavailable.Unavailable;
import lombok.*;

import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(exclude = {"unavailabilities"})
@ToString(exclude = {"unavailabilities"})
public class Room {
    private Integer id;
    private String name;
    private Boolean active;
    private Building building;
    private Set<Unavailable> unavailabilities;
}

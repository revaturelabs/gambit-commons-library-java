package commons.trainer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Certification {
    private Integer id;
    private String url;
    private String name;
    private Trainer trainer;
}

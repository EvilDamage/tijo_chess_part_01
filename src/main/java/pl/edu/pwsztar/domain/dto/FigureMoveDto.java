package pl.edu.pwsztar.domain.dto;

import lombok.*;
import pl.edu.pwsztar.domain.enums.FigureType;

@Builder(toBuilder = true)
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FigureMoveDto{
    private String source;
    private String destination;
    private FigureType type;
}

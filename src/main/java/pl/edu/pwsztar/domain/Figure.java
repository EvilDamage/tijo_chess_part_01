package pl.edu.pwsztar.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import pl.edu.pwsztar.domain.enums.FigureType;

@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
class Figure {
    private String source;
    private String destination;
    private FigureType type;

    Figure dto() {
        return Figure.builder()
                .source(this.source)
                .destination(this.destination)
                .type(this.type)
                .build();
    }
}

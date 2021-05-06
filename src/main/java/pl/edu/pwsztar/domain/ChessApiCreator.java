package pl.edu.pwsztar.domain;

import pl.edu.pwsztar.domain.dto.FigureMoveDto;

class ChessApiCreator {

    Figure from(FigureMoveDto figureMoveDto) {
        return Figure.builder()
                .source(figureMoveDto.getSource())
                .destination(figureMoveDto.getDestination())
                .type(figureMoveDto.getType())
                .build();
    }
}

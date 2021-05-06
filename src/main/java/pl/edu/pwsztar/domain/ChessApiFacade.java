package pl.edu.pwsztar.domain;

import org.springframework.transaction.annotation.Transactional;
import pl.edu.pwsztar.domain.dto.FigureMoveDto;


@Transactional
public class ChessApiFacade {

    private final ChessApiCreator chessApiCreator;

    public ChessApiFacade( ChessApiCreator chessApiCreator) {
        this.chessApiCreator = chessApiCreator;
    }

    public boolean bishopCheck(FigureMoveDto figureMoveDto){

        System.out.println(figureMoveDto.getDestination());
        return true;
    }
}

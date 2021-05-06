package pl.edu.pwsztar.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ChessApiConfiguration {

    @Bean
    ChessApiFacade chessApiFacade(){
        ChessApiCreator chessApiCreator = new ChessApiCreator();
        return new ChessApiFacade(chessApiCreator);
    }
}

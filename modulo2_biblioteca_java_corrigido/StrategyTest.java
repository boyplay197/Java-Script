import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class StrategyTest {
    @Test
    void testarPublicacaoLivro() {
        Autor autor = new Autor("Joao", 30, false);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoLivro());
        assertDoesNotThrow(autor::publicar);
    }

    @Test
    void testarPublicacaoArtigo() {
        Autor autor = new Autor("Joao", 30, true);
        autor.setEstrategiaPublicacao(new EstrategiaPublicacaoArtigo());
        assertDoesNotThrow(autor::publicar);
    }
}

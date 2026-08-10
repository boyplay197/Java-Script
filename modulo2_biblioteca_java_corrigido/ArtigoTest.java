import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtigoTest {
    @Test
    void deveCriarArtigoCorretamente() {
        Autor autor = new Autor("Jessica Felix", 30, true);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "Tecnologia", true);
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("Tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}

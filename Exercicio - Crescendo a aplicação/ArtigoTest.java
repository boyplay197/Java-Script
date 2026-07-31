import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArtigoTest {

    @Test
    public void deveCriarArtigoCorretamente() {
        Autor autor = new Autor("Jessica Felix", 35, false);

        Artigo artigo = new Artigo(
            "Entendendo Compiladores",
            autor,
            "tecnologia",
            true
        );

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}

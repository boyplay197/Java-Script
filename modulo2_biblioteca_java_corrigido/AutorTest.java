import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AutorTest {
    @Test
    void deveIdentificarSeAutorEhUsuario() {
        Autor autor = new Autor("Jessica Felix", 30, true);
        assertTrue(autor.isUsuario());
    }
}

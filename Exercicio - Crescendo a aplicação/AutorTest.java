import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AutorTest {

    @Test
    public void deveIdentificarSeAutorEhUsuario() {
        Autor autorUsuario = new Autor("Joao", 30, true);
        Autor autorTradicional = new Autor("Maria", 40, false);

        assertTrue(autorUsuario.isUsuario());
        assertFalse(autorTradicional.isUsuario());
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class UsuarioTest{
 @Test public void testGetSet(){
  Usuario u=new Usuario("Gabriel",21);
  assertEquals("Gabriel",u.getNome());
  assertEquals(21,u.getIdade());
  u.setNome("Lucas"); u.setIdade(25);
  assertEquals("Lucas",u.getNome());
  assertEquals(25,u.getIdade());
 }
}
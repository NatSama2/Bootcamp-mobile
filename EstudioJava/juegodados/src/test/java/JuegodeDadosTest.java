import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.juego.JuegoDados;

public class JuegodeDadosTest {

  private JuegoDados juego;

  @BeforeEach
  public void setUp() {
    // Preparar la entrada simulada
    String input = "Garfield\n Dongato\n";
    InputStream in = new ByteArrayInputStream(input.getBytes());
    System.setIn(in);

    // Inicializar el objeto Juego
    juego = new JuegoDados();
  }

  @Test
  public void testIniciar() {
    // Ejecutar el método que utiliza System.in
    juego.iniciar();

    // Verificar resultados
    assertEquals("Garfield", juego.getJugador1());
    assertEquals("Dongato", juego.getJugador2());
  }
}
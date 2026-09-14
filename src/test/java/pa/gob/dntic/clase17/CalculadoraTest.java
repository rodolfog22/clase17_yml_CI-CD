package pa.gob.dntic.clase17;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


 class CalculadoraTest {
    @Test
     void suma_dos_numeros() {
         assertEquals(5, new Calculadora().sumar(2,3));
    }


 }

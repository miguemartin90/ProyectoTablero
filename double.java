import org.testng.Assert;
import org.testng.annotations.Test;

public class DoubleTest {

    @Test
    public void testSum() {
        double result = DoubleOperations.sum(3.5, 4.2);
        Assert.assertEquals(result, 7.7, 0.001, "Suma incorrecta");
    }

    @Test
    public void testMax() {
        double result = DoubleOperations.max(3.5, 4.2);
        Assert.assertEquals(result, 4.2, 0.001, "Máximo incorrecto");
    }

    // Agrega más tests según sea necesario
}

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegerTest {

    @Test
    public void testSum() {
        int result = Integer.sum(3, 4);
        Assert.assertEquals(result, 7, "Suma incorrecta");
    }

    @Test
    public void testMax() {
        int result = Integer.max(3, 4);
        Assert.assertEquals(result, 4, "Máximo incorrecto");
    }

    // Agrega más tests según sea necesario
}

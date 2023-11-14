import org.testng.Assert;
import org.testng.annotations.Test;

public class FloatTest {

    @Test
    public void testSum() {
        float result = FloatOperations.sum(3.5f, 4.2f);
        Assert.assertEquals(result, 7.7f, 0.001f, "Suma incorrecta");
    }

    @Test
    public void testMax() {
        float result = FloatOperations.max(3.5f, 4.2f);
        Assert.assertEquals(result, 4.2f, 0.001f, "Máximo incorrecto");
    }

    // Agrega más tests según sea necesario
}

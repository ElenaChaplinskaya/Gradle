import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.clevertec.StringUtils;

public class UtilsTest {

    @Test
    void isPositiveNumberShouldBeTrue() {
        Assertions.assertTrue(StringUtils.isPositiveNumber("1"));
    }
    @Test
    void isPositiveNumberShouldBeFalse() {
        Assertions.assertFalse(StringUtils.isPositiveNumber("-1"));
    }
}

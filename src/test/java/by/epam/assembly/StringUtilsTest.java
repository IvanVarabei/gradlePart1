package by.epam.assembly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {
    @Test
    void isPositiveNumberReallyPositive() {
        assertTrue(StringUtils.isPositiveNumber("123"));
    }
}

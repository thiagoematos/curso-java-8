package util;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StringGeneratorTest {

    @Test
    public void defaultValues() {
        // When
        List<String> generate = StringGenerator.generate();

        // Then
        assertEquals(StringGenerator.QUANTITY, generate.size());
        assertEquals(StringGenerator.LENGTH, generate.get(0).length());
    }

    @Test
    public void customValues() {
        // Given
        int quantity = 5;
        int length = 3;

        // When
        List<String> generate = StringGenerator.generate(quantity, length);

        // Then
        assertEquals(quantity, generate.size());
        assertEquals(length, generate.get(0).length());

        assertNotEquals(StringGenerator.QUANTITY, generate.size());
        assertNotEquals(StringGenerator.LENGTH, generate.get(0).length());
    }

}

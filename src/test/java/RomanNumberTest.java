import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumberTest {

    @Test
    public void shouldConvertNumberOne() {
        // Given

        // When
        int actual = convert("I");

        // Then
        assertEquals(1, actual);
    }

    @Test
    public void shouldCovertNumberFive() {
        // Given

        // When
        int actual = convert("V");

        // Then
        assertEquals(5, actual);
    }

    @Test
    public void shouldCovertNumberTen() {
        // Given

        // When
        int actual = convert("X");

        // Then
        assertEquals(10, actual);
    }

    @Test
    public void shouldCovertNumberFifty() {
        // Given

        // When
        int actual = convert("L");

        // Then
        assertEquals(50, actual);
    }

    @Test
    public void shouldCovertNumberOneHundred() {
        // Given

        // When
        int actual = convert("C");

        // Then
        assertEquals(100, actual);
    }

    @Test
    public void shouldCovertNumberFiveHundred() {
        // Given

        // When
        int actual = convert("D");

        // Then
        assertEquals(500, actual);
    }

    @Test
    public void shouldCovertNumberOneThousend() {
        // Given

        // When
        int actual = convert("M");

        // Then
        assertEquals(1000, actual);
    }

    @Test
    public void shouldCovertNumberTwo() {
        // Given

        // When
        int actual = convert("II");

        // Then
        assertEquals(2, actual);
    }

    @Test
    public void shouldCovertNumberThree() {
        // Given

        // When
        int actual = convert("III");

        // Then
        assertEquals(3, actual);
    }

    @Test
    public void shouldCovertNumberTwenty() {
        // Given

        // When
        int actual = convert("XX");

        // Then
        assertEquals(20, actual);
    }

    @Test
    public void shouldCovertNumberTwentyTwo() {
        // Given

        // When
        int actual = convert("XXII");

        // Then
        assertEquals(22, actual);
    }

    @Test
    public void shouldCovertNumberNine() {
        // Given

        // When
        int actual = convert("IX");

        // Then
        assertEquals(9, actual);
    }

    @Test
    public void shouldCovertNumberTwentyFour() {
        // Given

        // When
        int actual = convert("XXIV");

        // Then
        assertEquals(24, actual);
    }

    private int convert(String romanNumber) {
        return new RomanNumber(romanNumber).toInteger();
    }

}

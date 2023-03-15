package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SqrServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/squares.csv")

    public void howManySquaresFounded(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);

        Assertions.assertEquals(expected, actual);
    }
}

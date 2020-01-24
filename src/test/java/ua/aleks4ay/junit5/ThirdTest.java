package ua.aleks4ay.junit5;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

//@RunWith(JUnitPlatform.class)
public class ThirdTest {

    @Test
    void succeedingTest() {
        /* no-op */
    }

    @Test
    void failingTest() {
        fail("Failing for failing's sake.");
    }

}
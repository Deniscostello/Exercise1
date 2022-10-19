package ie.atu.Exercise1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {
    Counter myCount;

    @BeforeEach
    void setUp() {
        myCount = new Counter();
    }

    @Test
    void testincreament(){
        assertEquals(1,myCount.increament());
    }

    @AfterEach
    void tearDown() {
    }
}
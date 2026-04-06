package com.example;

import org.junit.Test;
import static org.junit.Assert.*;
public class AppTest {
    @Test
    public void testIsEven() {
        App app = new App();
        assertTrue(app.isEven(4));
        assertFalse(app.isEven(7));
    }
}

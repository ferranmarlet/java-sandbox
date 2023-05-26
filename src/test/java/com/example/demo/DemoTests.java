package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DemoTests {

    @Test
    public void testThatfunctionReturnsTrue() {
        Demo demo = new Demo();
        assertTrue(demo.functionThatReturnsTrue());
    }
}

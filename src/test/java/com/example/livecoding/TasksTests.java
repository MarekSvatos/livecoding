package com.example.livecoding;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TasksTests {

    @Test
    void shouldGetHelloWorld() {
        assertEquals(Tasks.helloWorld(), "Hello World!");
    }

}

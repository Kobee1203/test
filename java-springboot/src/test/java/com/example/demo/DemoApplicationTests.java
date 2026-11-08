package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
        // Vérifie que le contexte applicatif Spring Boot démarre correctement
        assertThat(true).isTrue();
    }
}

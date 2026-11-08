package com.example.demo.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomeController.class)
class HomeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("Test unitaire direct avec AssertJ")
    void testUnitGreetDirectly() {
        HomeController controller = new HomeController();
        String result = controller.greet("Alice");

        assertThat(result)
            .isNotNull()
            .isEqualTo("Bonjour, Alice !");
    }

    @Test
    @DisplayName("Test de la page web HTML racine avec MockMvc et AssertJ")
    void testHomePageReturnsHtml() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/"))
            .andExpect(status().isOk())
            .andReturn();

        String content = mvcResult.getResponse().getContentAsString();

        assertThat(content)
            .contains("<!DOCTYPE html>")
            .contains("Application Web Active")
            .contains("Bonjour <strong>Visiteur</strong> !");
    }

    @Test
    @DisplayName("Test de la page web avec paramètre personnalisé")
    void testHomePageWithCustomName() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/").param("name", "Bob"))
            .andExpect(status().isOk())
            .andReturn();

        String content = mvcResult.getResponse().getContentAsString();

        assertThat(content)
            .contains("Bonjour <strong>Bob</strong> !");
    }

    @Test
    @DisplayName("Test de l'endpoint API greet")
    void testGreetApiEndpoint() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/api/greet").param("name", "Charlie"))
            .andExpect(status().isOk())
            .andReturn();

        String content = mvcResult.getResponse().getContentAsString();

        assertThat(content)
            .isEqualTo("Bonjour, Charlie !");
    }
}

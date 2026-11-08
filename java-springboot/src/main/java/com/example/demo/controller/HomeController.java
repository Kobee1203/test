package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home(@RequestParam(defaultValue = "Visiteur") String name) {
        String cleanName = (name == null || name.isBlank()) ? "Visiteur" : name.trim();
        return """
            <!DOCTYPE html>
            <html lang="fr">
            <head>
                <meta charset="UTF-8">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">
                <title>Accueil Spring Boot</title>
                <style>
                    body {
                        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, sans-serif;
                        display: flex;
                        align-items: center;
                        justify-content: center;
                        min-height: 100vh;
                        margin: 0;
                        background: #f0f2f5;
                    }
                    .card {
                        background: white;
                        padding: 2.5rem;
                        border-radius: 12px;
                        box-shadow: 0 10px 25px rgba(0, 0, 0, 0.08);
                        text-align: center;
                        max-width: 480px;
                    }
                    h1 { color: #6db33f; margin-top: 0; }
                    p { color: #4a5568; font-size: 1.1rem; line-height: 1.5; }
                    .badge {
                        display: inline-block;
                        padding: 0.25rem 0.75rem;
                        background: #e8f5e9;
                        color: #2e7d32;
                        border-radius: 9999px;
                        font-size: 0.875rem;
                        font-weight: 600;
                    }
                </style>
            </head>
            <body>
                <div class="card">
                    <span class="badge">Spring Boot 3</span>
                    <h1>Application Web Active</h1>
                    <p>Bonjour <strong>%s</strong> ! Votre page d'accueil est servie avec succès.</p>
                </div>
            </body>
            </html>
            """.formatted(cleanName);
    }

    @GetMapping("/api/greet")
    public String greet(@RequestParam(defaultValue = "Visiteur") String name) {
        String cleanName = (name == null || name.isBlank()) ? "Visiteur" : name.trim();
        return "Bonjour, " + cleanName + " !";
    }
}

package com.example.springai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Spring Boot AI Projects Application
 *
 * <p>This application demonstrates a RAG (Retrieval-Augmented Generation) pipeline using Spring AI:
 *
 * <ul>
 *   <li><b>Ingestion</b> – raw text is split into chunks and embedded into a vector store.
 *   <li><b>Retrieval</b> – at query time the top-K most semantically similar chunks are fetched.
 *   <li><b>Generation</b> – the retrieved chunks are prepended to the LLM prompt as context.
 * </ul>
 *
 * <p>REST endpoints are available under {@code /api/rag}.
 */
@SpringBootApplication
public class SpringAiProjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAiProjectsApplication.class, args);
    }
}

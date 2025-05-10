/*
 * Copyright 2025 Kompile Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ai.kompile.app; // New package for the main application module



import ai.kompile.loaders.orchestrator.config.AppDocumentSourceProperties;
import ai.kompile.tool.filesystem.config.FilesystemToolProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

// scanBasePackages is crucial for a multi-module setup if your modules share a common root package.
// "ai.kompile" should cover all your modules like ai.kompile.core, ai.kompile.anserini, ai.kompile.loaders, etc.
@SpringBootApplication(scanBasePackages = "ai.kompile")
@EnableConfigurationProperties({
})
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
        System.out.println("RAG MCP Assistant (Multi-Module) is running!");
        System.out.println("API Endpoints typically under /api/...");
        System.out.println("MCP Server SSE endpoint likely at: http://localhost:8080/mcp/sse (check Spring AI defaults)");
        System.out.println("MCP Server Message endpoint likely at: http://localhost:8080/mcp/message (check Spring AI defaults)");
        // Consider adding a health check endpoint or more specific startup messages.
    }
}
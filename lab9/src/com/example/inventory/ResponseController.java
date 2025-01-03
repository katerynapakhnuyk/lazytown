package com.example.inventory;

import org.springframework.web.bind.annotation.*;

import java.io.FileWriter;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class ResponseController {

    private static final String FILE_PATH = "responses.txt";

    @PostMapping("/save")
    public String saveResponse(@RequestBody String response) {
        try (FileWriter writer = new FileWriter(FILE_PATH, true)) {
            writer.write(response + System.lineSeparator());
            return "Response saved successfully!";
        } catch (IOException e) {
            return "Error saving response: " + e.getMessage();
        }
    }

    @GetMapping("/read")
    public String readResponses() {
        try {
            return new String(java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(FILE_PATH)));
        } catch (IOException e) {
            return "Error reading file: " + e.getMessage();
        }
    }
}

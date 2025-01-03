package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        Student rina = new Student("Pakhnyuk", "Kateryna", "IO-32");
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(rina);
        System.out.println(s);
    }
}
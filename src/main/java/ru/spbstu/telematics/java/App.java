package ru.spbstu.telematics.java;

import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        String filePath = "file.txt";
        String textToWrite = "New text!";
        
        try (FileWriter writer = new FileWriter(filePath, false)) { 
            writer.write(textToWrite);
            System.out.println("Запись в файл завершена.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}

package ru.spbstu.telematics.java;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Укажите путь до файла: ");
        String filePath = scanner.nextLine(); 

        System.out.print("Введите текст для записи в файл: "); 
        String textToWrite = scanner.nextLine(); 

        try (FileWriter writer = new FileWriter(filePath, false)) { 
            writer.write(textToWrite);
            System.out.println("Запись в файл завершена.");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
package ru.spbstu.telematics.java;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.Assert.assertEquals;

public class AppTest {

    private Path tempFile;

    @Before
    public void setUp() throws IOException {
        tempFile = Files.createTempFile("test", ".txt");
        String content = "INIT TEXT";
        Files.write(tempFile, content.getBytes());
    }

    @After
    public void tearDown() throws IOException {
        Files.deleteIfExists(tempFile);
    }

    @Test
    public void testWriteToFile() throws IOException {
        String textToWrite = "Hello there!";

        App.writeToFile(tempFile.toString(), textToWrite);

        String actualContent = new String(Files.readAllBytes(tempFile));
        assertEquals(textToWrite, actualContent);
    }
}

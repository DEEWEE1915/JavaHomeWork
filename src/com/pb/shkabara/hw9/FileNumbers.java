package com.pb.shkabara.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FileNumbers {
    public static void createNumbersFile() throws IOException {
        Files.deleteIfExists(Paths.get("C:\\Users\\ПБ\\Desktop\\java\\src\\com\\pb\\shkabara\\hw9\\numbers.txt"));
        Path file = Files.createFile(Paths.get("C:\\Users\\ПБ\\Desktop\\java\\src\\com\\pb\\shkabara\\hw9\\numbers.txt"));

        int[][] array = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(99);
            }
        }

        try (Writer writer = new FileWriter("C:\\Users\\ПБ\\Desktop\\java\\src\\com\\pb\\shkabara\\hw9\\numbers.txt")) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(String.valueOf(array[i][j]));
                    writer.write(" ");
                }
                writer.write("\r\n");
            }

        } catch (Exception e) {
            System.out.println("Помилка: " + e.getStackTrace());
        }

    }

    public static void createOddNumbersFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ПБ\\Desktop\\java\\src\\com\\pb\\shkabara\\hw9\\numbers.txt"));
        List<String> lines = new ArrayList<>();
        while (br.ready()) {
            lines.add(br.readLine());
        }

        Integer[][] array = new Integer[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                String[] line = lines.get(i).split(" ");
                array[i][j] = Integer.parseInt(line[j]);
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = 0;
                }
            }
        }

        try (Writer writer = new FileWriter("C:\\Users\\ПБ\\Desktop\\java\\src\\com\\pb\\shkabara\\hw9\\odd-numbers.txt")) {

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    writer.write(String.valueOf(array[i][j]));
                    writer.write(" ");
                }
                writer.write("\r\n");
            }

        } catch (Exception e) {
            System.out.println("Ошибка " + e.getStackTrace());
        }
    }

    public static void main(String[] args) throws IOException {
        createNumbersFile();
        createOddNumbersFile();
    }
}

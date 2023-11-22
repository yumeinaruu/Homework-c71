package Homework14.Task1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        try (FileReader fileReader = new FileReader("romeo-and-juliet.txt")) {
            int i;
            StringBuilder stringBuilder = new StringBuilder();
            while ((i = fileReader.read()) != -1) {
                stringBuilder.append((char) i);
            }
            stringBuilder = new StringBuilder(stringBuilder.toString().replaceAll("\\W+", " "));
            String[] text = stringBuilder.toString().split(" +");
            for (int j = 0; j < text.length - 1; j++) {
                int min = j;
                for (int k = j + 1; k < text.length; k++) {
                    if (text[min].length() > text[k].length()) {
                        min = k;
                    }
                }

                if (min != j) {
                    String temp = text[j];
                    text[j] = text[min];
                    text[min] = temp;
                }
            }

            System.out.println("Слово минимальной длины: " + text[0] + "\nСлово максимальной длины: " + text[text.length - 1]);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

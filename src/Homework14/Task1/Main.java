package Homework14.Task1;

import java.io.FileReader;
import java.io.IOException;

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
            int maxIndex = 0;
            int minIndex = 0;
                for(int k = 0; k < text.length - 1; k++){
                    if(text[maxIndex].length() < text[k].length()){
                        maxIndex = k;
                    }
                    if(text[minIndex].length() > text[k].length()){
                        minIndex = k;
                    }
                }
            System.out.println("Слово минимальной длины: " + text[minIndex] + "\nСлово максимальной длины: " + text[maxIndex]);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

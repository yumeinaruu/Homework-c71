package Homework14.Task2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("docs.txt");
            FileWriter fileWriter = new FileWriter("goodDocs.txt");
            FileWriter fileWriterError = new FileWriter("errorDocs.txt")){
            StringBuilder stringBuilder = new StringBuilder();
            int k;
            while((k = fileReader.read()) != -1){
                stringBuilder.append((char) k);
            }
            String[] text = stringBuilder.toString().split("\n");
            for(int i = 0; i < text.length; i++) {
                if (text[i].matches("docnum\\w{15}") || text[i].matches("contract\\w{15}")) {
                    fileWriter.write(text[i]);
                } else {
                    fileWriterError.write(text[i]);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

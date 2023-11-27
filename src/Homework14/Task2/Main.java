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
            String text = stringBuilder.toString();
            System.out.println(text);
            Pattern pattern = Pattern.compile("[docnum][\\w]{15}[\\n]");
            Pattern patternError = Pattern.compile("[^docnum][\\w]+");
            Matcher matcher = pattern.matcher(text);
            Matcher matcherError = patternError.matcher(text);
            while (matcher.find()){
                fileWriter.append(matcher.group());
            }
            while(matcherError.find()){
                fileWriterError.append(matcherError.group());
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

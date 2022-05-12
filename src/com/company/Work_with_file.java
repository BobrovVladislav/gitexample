package com.company;

/*
Проверка второго комита
*/

/*Создайте приложение для поиска слова в некотором файле. Слово и путь к файлу указываются пользователем.
 По итогам поиска приложение должно показать сколько раз слово встретилось в файле.*/

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.nio.file.Paths.*;

public class Work_with_file {

    public static void main(String[] args) throws IOException {
        String ch;
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\монолит\\Desktop\\IdeaProjects\\new structured\\src\\com\\company\\t01.txt"));
        ch = br.readLine();
        System.out.println(ch);
        System.out.println(countWords(ch));
    }


    public static int countWords(String str) {
        char[] sentence = str.toCharArray();
        boolean inWord = false;
        int wordCt = 0;
        for (char c : sentence) {
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
                if (!inWord) {
                    wordCt++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }
        return wordCt;
    }

}

  /*  public static void main(String[] args) throws Exception {

        FileReader reader = new FileReader("C:\\Users\\монолит\\Desktop\\IdeaProjects\\new structured\\src\\com\\company\\t01.txt");
            char[] buf = new char[256];
            int c;
            while((c = reader.read(buf))>0) {

                if (c < 256) {
                    buf = Arrays.copyOf(buf, c);
                }
                System.out.print(buf);
            }

        System.out.println();
        System.out.println(buf.length);
        System.out.println(buf[1]);

        File file = new File("C:\\Users\\монолит\\Desktop\\IdeaProjects\\new structured\\src\\com\\company\\t01.txt");
        if (file.exists())
            System.out.println("Файл " + file.getName() + " существует!!!");
        else
            System.out.println("Файл не существует!!!");

        System.out.println(fileContainsWords("C:\\Users\\монолит\\Desktop\\IdeaProjects\\new structured\\src\\com\\company\\t01.txt", "Привет"));

    }

    public static boolean fileContainsWords(String fileName, String word) throws IOException {
         return new String(Files.readAllBytes(Paths.get(fileName))).contains(word);
    }
*/
/*}*/


/*
    public static void main(String[] args) throws FileNotFoundException, IOException {

       Work_with_file.workWithFiles();

    }


    public static void workWithFiles () throws FileNotFoundException, IOException{

        String searchWord = "Пока"; // слово заменить на нужное

        FileInputStream fis = new FileInputStream(new File("C:\\Users\\монолит\\Desktop\\IdeaProjects\\new structured\\src\\com\\company\\t01.txt")); // путь заменить на нужный
        byte[] content = new byte[fis.available()];
        fis.read(content);
        fis.close();

        String[] lines = new String(content, "UTF-8").split("\n"); // кодировку указать нужную
        int i = 1;
        for (String line : lines) {
            String[] words = line.split(" ");
            int j = 1;
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    System.out.println("Найдено в " + i + "-й строке, " + j + "-е слово");
                }
                j++;
            }
            i++;
        }

    }

}
*/

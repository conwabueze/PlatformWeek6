import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InAndOutOne {
    public static void main(String[] args) {
        ///////1. Write a Java Program to read a file content line by line
        File file = new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\Shook Ones Lyrics.txt");
        String lyrics="";
        List<String> list = new ArrayList<>();
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();

                //2.Storing it into a variable
                lyrics+=line;

                //3.Storing into an Array
                list.add(line);
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }finally {

            //Output variable
            System.out.println(lyrics);

            System.out.println();

            //Output Array
            for(int i=0;i<list.size();i++){
                System.out.println(list.get(i));
            }
        }

        /////////4.Write a program to write and read plain text file
        System.out.println();
        File newFile = new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\iLike2Write.txt");
        final String newLine = "\n";
        try{
            //writing to file
            BufferedWriter letWrite = new BufferedWriter(new FileWriter(newFile));
            FileWriter writer = new FileWriter(newFile);
            letWrite.write("Hello World ");
            letWrite.write(newLine);
            letWrite.write("How you doing?");
            letWrite.close();

            //reading to file
            BufferedReader reader = new BufferedReader(new FileReader(newFile));
            String currentLine = reader.readLine();
            while (currentLine!=null){
                System.out.println(currentLine);
                currentLine = reader.readLine();
            }
        }catch (IOException e){
            System.out.println("Something wrong here");
        }finally {

        }

        ////5.Write a java program to append a text to an existing file
        System.out.println();
        try {
            //appending to existing file
            BufferedWriter writer = new BufferedWriter(new FileWriter(newFile));
            writer.write("Hey guys im just going to append myself right here!!!");
            writer.newLine();
            writer.write("Good bye now!!!!!!");
            writer.close();

            //print out
            Scanner newReader = new Scanner(newFile);
            while (newReader.hasNextLine()){
                System.out.println(newReader.nextLine());
            }
        }catch (IOException e){
            System.out.println("ohhh nooo something went wrong");
        }

        //6. Write a Java program to read first 3 line from file
        System.out.println();
        try {
            BufferedReader first3 = new BufferedReader(new FileReader(file));
            for(int i = 0; i<3; i++){
                System.out.println(first3.readLine());
            }
        }catch (IOException e){
            System.out.println("damn");
        }

        //7.Write a Java program to find the longest word in a text file
        System.out.println();
        try{
            Scanner findLongest = new Scanner(
                    new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\Shook Ones Lyrics.txt"));
            String longestWord = "";

            //Looking for longest word
            while (findLongest.hasNext()){
                if(findLongest.next().length()>longestWord.length())
                    longestWord=findLongest.next();
            }
            System.out.println("Longest Word is: " + longestWord);
        }catch (IOException e){
            System.out.println("Houston we have a problem");
        }

    }
}

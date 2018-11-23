import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InAndOutTwo {
    public static void main(String[] args) throws IOException {

        //1.Letter print out
        System.out.println("\t\t\t\t\t\t ####");//6tabs
        System.out.println("\t\t\t\t\t\t ####");//6tabs
        System.out.println("\t\t\t\t\t\t ####");//6tabs

        System.out.println("\t\t\t Hokage Naruto");//3tabs
        System.out.println("\t\t 1800 Leaf Village");//2tabs
        System.out.println("\t  Manga Land, XX 12345");//2tabs

        //2.output it into a .txt file
        FileWriter letterWriter = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\letter2U.txt"));
        letterWriter.append("\t\t\t\t\t\t ####\n");
        letterWriter.append("\t\t\t\t\t\t ####\n");
        letterWriter.append("\t\t\t\t\t\t ####\n");
        letterWriter.append("\n");
        letterWriter.append("\t\t\t Hokage Naruto\n");
        letterWriter.append("\t\t 1800 Leaf Village\n");
        letterWriter.append("\t  Manga Land, XX 12345\n");
        letterWriter.close();

        //3. Write a program that asks the user for their name and a number.
        // Then store the following message in a file named: score.txt: “[name] got a [number] in the Math test.
        Scanner input = new Scanner(System.in);
        System.out.println("Whats your name?");
        String name = input.nextLine();
        System.out.println("What is your number?");
        String number = input.nextLine();

        String line = name + " got a " + number + " in the Math test ";

        FileWriter mathTest = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\score.txt"));
        mathTest.append(line);
        mathTest.close();

        //4.Create a file named: num1.txt and insert integers separated by some white space.
        // Write a program that reads three integers from the file nums.txt and displays (on the screen)
        // the total of the integers.


        //create file
        FileWriter intsert = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\nums.txt"));
        intsert.append("23 24 32 64 1234");
        intsert.close();

        //scanning file and adding up nums
        Scanner addItUp = new Scanner(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\nums.txt"));
        int total = 0;
        while(addItUp.hasNext()){
            int next = addItUp.nextInt();
            //calculating total
            total+=next;
            //display nums in file
            System.out.print(next + " ");
        }
        //Display total
        System.out.println("Total: " + total);


        //5.Create several more files in Notepad containing three integers separated by some whitespace.
        // Save them in your home directory as "nums2.txt", "nums3.txt", "nums4.txt", etc.
        //Then write a program that asks the user which file to open. Then it should open that file,
        // and read the three integers from the file. It should then display (on the screen) the total of the integers.


        FileWriter num2 = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\nums2.txt"));
        num2.append("3 4 2 6 14");
        num2.close();

        FileWriter num3 = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\nums3.txt"));
        num3.append("2 2 3 4 34");
        num3.close();

        FileWriter num4 = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\nums4.txt"));
        num4.append("9 724 632 77764 88 77777 999");
        num4.close();


        System.out.println("What file do you want calculated? ");
        String fileName =input.nextLine();
        Scanner chosenFile = new Scanner(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\"+fileName));

        int chooseFileTot=0;
        while(chosenFile.hasNext()){
            int x = chosenFile.nextInt();
            chooseFileTot+=x;
            System.out.print(x + " ");
        }

        System.out.println(fileName+"'s total is: "+ chooseFileTot);

        //6.Open a file specified by the user. This file will contain a bunch of characters.
        // You should read in each character from the file, one character at a time.
        // Display every third character on the screen. Throw the other characters away.


        //puzzle one
        File puzzleFile = new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\puzzle.txt");
        FileWriter puzzle = new FileWriter(puzzleFile);
        puzzle.append("MWTaahyiebt_e,c__hnyaoontuc;'e_rste_r_aynr_oert_e_gasoduoipdnp_got_shoeandtl__yty_oot_uhrree__apTdrH_oItgRhrDia_sml__eowtnotere.kr_ss_.");
        puzzle.close();


        //puzzle 2
        File puzzle2File = new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\puzzle2.txt");
        FileWriter puzzle2 = new FileWriter(puzzle2File);
        puzzle2.append("WTTohhriikssi__niigss,___ttbhhueet___wryrioogunh'gtr__emm_eessshssoaawggieen__gff_rrtoohmme___sswaarmmoppnllgee_22o..nttexxstt");
        puzzle2.close();
        //puzzle chose
        System.out.println("type name of puzzle file you want opened");

        String choosePuzzle = input.nextLine();
        List<Character> everyThird = new ArrayList<>();
        Scanner breakdown = new Scanner(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\"+choosePuzzle));

        //getting every third character
        while (breakdown.hasNextLine()){
            int thirdCharCount = 1;
            String puzzleLine = breakdown.nextLine();
            for(int i =0; i<puzzleLine.length(); i++){
                if(thirdCharCount == 3){
                    everyThird.add(puzzleLine.charAt(i));
                    thirdCharCount =1;//reset count to find the next third char
                }else
                thirdCharCount++;
            }
        }

        //array list/message printout
        for(int i =0;i<everyThird.size(); i++){
            System.out.print(everyThird.get(i));
        }


        //7.Write a program that would reads the text in
        // CrazyText.txt and output it to CrazyTextModified.txt with every vowel capitalize.

        //vowels are composed of the letters a,e,i,o,u,y

        //Create file
        File text = new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\CrazyText.txt");
        //Scan vowel
        Scanner vowelCapReader = new Scanner(text);

        //Store changed lines into arraylist
        List<String> lineStorage = new ArrayList<>();

        //traversing line by line
        while(vowelCapReader.hasNextLine()){
            StringBuilder lineBuilder = new StringBuilder(vowelCapReader.nextLine());

            //once we have line you a switch statement to change vowels to cap using string builder
            for(int i = 0; i<lineBuilder.length(); i++){
                switch (lineBuilder.charAt(i)){
                    case 'a': case'e': case 'i': case'o': case 'u': case'y':
                        String chartToString = lineBuilder.charAt(i)+"";
                        lineBuilder.replace(i,i+1,chartToString.toUpperCase());


                }
            }
            lineStorage.add(lineBuilder.toString());
        }

        //Writing everything from array list to empty file
        FileWriter withVowelsUpCased = new FileWriter(new File("C:\\Users\\chino\\IdeaProjects\\Platform Week 6\\CrazyTextModified.txt"));

        for(int w = 0; w<lineStorage.size(); w++){
            withVowelsUpCased.append(lineStorage.get(w));
            withVowelsUpCased.append("\n");
        }

        withVowelsUpCased.close();

    }
}

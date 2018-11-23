import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListAssignment {
    public static void main(String[] args) {
        //1.Write a Java program to create a new ArrayList of strings.
        //Add some colors (string) and print out the collection.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        System.out.println(colors);

        System.out.println();
        //2.Write a Java method to iterate through all elements in the previous ArrayList.
        //Print each color out in the format of: "Today's Color is [color]!"
        for(int i = 0; i<colors.size();i++){
            System.out.println("Today's Color is "+ colors.get(i)+"!");
        }

        //3.Write a method to change the fifth element of your ArrayList to "Magenta"
        changeFifth(colors,"Magenta");


        //4.Write a method to remove the third element of your ArrayList
        removeTheThird(colors);

        System.out.println();
        //5.Write a method to search your ArrayList for a specified color.
        if(searchFor(colors,"Magenta")!=-1){
            System.out.println("Index of search is: "+ searchFor(colors,"Magenta") );
        }else {
            System.out.println("Could not find color");
        }

        System.out.println();
        //6.Write a method to sort your ArrayList from A-Z
        sort(colors);

        //7.Write a method to reverse your ArrayList
        reverse(colors);

        //8.Write a method that will copy the contents of one ArrayList to another.
        ArrayList<String> newList = duplicate(colors);

        //9.Write a method that will compare two ArrayLists, printing out which elements they have in common.
        System.out.println(comparsion(colors,newList));

        //10.Write a method that will append the contents of one ArrayList to another.
        System.out.println();
        System.out.println(append(colors,newList));

        //11.Write a method that will print out each element of your ArrayList using a For-Each loop.
        System.out.println();
        printArray(colors);

        //12.Write a method that will convert a regular Array to an ArrayList.
        System.out.println("\n");
        String[] arr = {"one","two","three","four"};
        ArrayList<String> toArrList = toArrayList(arr);
        System.out.println(toArrList);

    }

    ///METHODS//


    //3.Write a method to change the fifth element of your ArrayList to "Magenta"
    public static void changeFifth(ArrayList<String> list, String color){
        list.set(4,color); //5th is really the 4th


    }

    //4.Write a method to remove the third element of your ArrayList
    public static void removeTheThird(ArrayList<String> list){
        list.remove(2);//3rd is really 2nd
    }

    //5.Write a method to search your ArrayList for a specified color.
    public static int searchFor(ArrayList<String> list, String target){
        return list.indexOf(target);
    }

    //6.Write a method to sort your ArrayList from A-Z
    public static void sort(ArrayList<String> list){
        Collections.sort(list);
    }

    //7.Write a method to reverse your ArrayList
    public static void reverse(ArrayList<String> list){
        Collections.reverse(list);
    }

    //8.Write a method that will copy the contents of one ArrayList to another.
    public static ArrayList<String> duplicate(ArrayList<String> list){
        ArrayList<String> newList = new ArrayList<>();
        for (int i = 0; i<list.size(); i++){
            newList.add(list.get(i));
        }
        return newList;
    }

    //9.Write a method that will compare two ArrayLists, printing out which elements they have in common.
    public static String comparsion(ArrayList<String> list1, ArrayList<String> list2){
        String inCommon = "";
        for(int i = 0; i<list1.size(); i++){
            if(list2.indexOf(list1.get(i))!=-1){
                inCommon += list1.get(i);
                inCommon+=" ";
            }
        }
        return "Elements in common are "+ inCommon;
    }

    //10.Write a method that will append the contents of one ArrayList to another.
    public static ArrayList<String> append(ArrayList<String> list1, ArrayList<String> list2){
        for(int i = 0; i<list2.size();i++){
            //append list2 to list1
            list1.add(list1.size(),list2.get(i));
        }
        return list1;
    }

    //11.Write a method that will print out each element of your ArrayList using a For-Each loop.
    public static void printArray(ArrayList<String> list){
        for(String item: list){
            System.out.print(item+" ");
        }
    }

    //12.Write a method that will convert a regular Array to an ArrayList.
    public static ArrayList<String> toArrayList(String[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }


    //Print out method
    public static void listPrintOut(ArrayList<String> list){
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }



}

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class HashMapsAssignment {
    public static void main(String[] args) {
        HashMap<Integer, String > map = new HashMap<>();
        map.put(0,"Red");
        map.put(1,"Blue");
        map.put(2,"Yellow");
        map.put(3,"Pink");
        map.put(4,"Black");


        System.out.println("Keys"+map.keySet());
        System.out.println("Values"+map.values());

        map.put(4,"Purple");

        System.out.println("Keys"+map.keySet());
        System.out.println("Values"+map.values());

        //The value does change because there cant be two key with the same value.

        //2.Print out one by one

        //iterator
        System.out.println("\nwith iterator:");
        Iterator it = map.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry pair = (HashMap.Entry)it.next();
            System.out.println(pair.getKey()+"="+pair.getValue());
        }

        ///for each
        System.out.println("\nwith For Each:");
        for(Integer key: map.keySet()){
            System.out.println(key + " " + map.get(key));
        }

        //3. Write a simple Restaurant Ordering Menu & Cart.
        HashMap<String, Integer> cart = new HashMap<>();
        String[] menu =  {"Hamburgers", "Hot Dogs", "Sandwiches", "Soda", "Fries"};
        int[] quantity = {0,0,0,0,0};
        Scanner input = new Scanner(System.in);

        System.out.println("\nHERES ARE MENU");
        for(int i=0; i<menu.length; i++){
            System.out.println(i+1+". "+menu[i]);
        }
        System.out.println("0. To End Order");



        int end = 1;
        while(end!=0){
            System.out.println("\nMake your order by entering order#:");
            int chosenItem = input.nextInt();


            //choosing item, putting in hash map, and updating quantity
            switch (chosenItem){
                case 1:
                    quantity[0]++;
                    cart.put(menu[0],quantity[0]);
                    break;
                case 2:
                    quantity[1]++;
                    cart.put(menu[1],quantity[1]);
                    break;
                case 3:
                    quantity[2]++;
                    cart.put(menu[2],quantity[2]);
                    break;
                case 4:
                    quantity[3]++;
                    cart.put(menu[3],quantity[3]);
                    break;
                case 5:
                    quantity[4]++;
                    cart.put(menu[4],quantity[4]);
                    break;
                case 0:
                    System.out.println("\nFINAL ORDER: ");
                    end = 0;
                    break;
                default:
                    System.out.println("!!!!!!!!!!!!Invalid Entry!!!!!!!!!!!!!!");
            }
            //Cart print out
            for(String key: cart.keySet()){
                System.out.println("ITEM: "+ key + " QUANTITY: " + cart.get(key));
            }


        }



    }
}

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Scanner; 

public class arraylist {
    public static void main(String args[]){
        //A resizable array that stores objects (autoboxing)
        // Arrays are fixed in size, ut arraylists can change

        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        ArrayList<String> fruits= new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("mango");
        fruits.add("pineapple");

        //fruits.remove(1);
        fruits.set(3,"coconut");

        //System.out.println(list);
        System.out.println(fruits);
        //System.out.println(fruits.size());
        System.out.println(fruits.get(2));

        Collections.sort(fruits);
        System.out.println(fruits);
        

        Scanner scanner= new Scanner(System.in);
        ArrayList<String> foods= new ArrayList<>();

        System.out.println("Enter the no. of foods you would like to store:");
        int num=scanner.nextInt();
        scanner.nextLine();
        for(int i=1;i<=num;i++)
        {
            System.out.println("Enter a food item:");
            String food= scanner.nextLine();
            foods.add(food);
        }
        System.out.println(foods);
        scanner.close();
    }
}

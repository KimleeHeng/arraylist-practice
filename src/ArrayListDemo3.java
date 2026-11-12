import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args){
        // create an ArrayList to store names

        ArrayList<String> newNames = new ArrayList<String>();

        newNames.add("Bryson");
        newNames.add("Kenneth");
        newNames.add("Xander");

        System.out.printf("%-5s%-5s%n", "Index", "Name");

        for(int counter = 0; counter < newNames.size(); counter++){
            System.out.printf("%-5s%-5s%n", counter, newNames.get(counter));
        }

    }
}

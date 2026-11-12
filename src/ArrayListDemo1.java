import java.util.ArrayList;
public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList<String> nameList;
        nameList = new ArrayList<String>();

        nameList.add("Kimlee");
        nameList.add("Cynthia");
        nameList.add("Jr");

        System.out.println("The ArrayList has " + nameList.size() + " objects stored in it");

        // Using for loop to display names within Array List
        for(int counter = 0; counter < nameList.size(); counter++){
            System.out.print(nameList.get(counter) + " ");
        }
        System.out.println();

        // Using an enhanced for loop to display contents of ArrayList
        for(String names : nameList)
            System.out.print(names +" ");
    }
}

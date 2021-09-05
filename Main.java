
import java.util.*;

public class Main {
    
    static List createListOfDivizorsForNumber(int num) {
        List<Integer> listOfDivz = new ArrayList<>();
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                listOfDivz.add(i);
            }
        }
        return listOfDivz;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = scn.nextInt();

        List<Integer> listOfDivz = createListOfDivizorsForNumber(num) ;
        int total = 0;
        
        for (int i = 0; i < listOfDivz.size(); i++){
            for (int j = i; j < listOfDivz.size(); j++){
                
                if(i == j){
                    j++;
                    if(j == listOfDivz.size()){
                        break;
                    }
                }
                
                total += listOfDivz.get(i) * listOfDivz.get(j);
                
            }
        }
        
        System.out.println("Divizors: ");
        listOfDivz.forEach(x -> System.out.print(x + ", "));
        
        System.out.println("\nTotal summ: \n" + total);
    }
}

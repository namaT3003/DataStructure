import java.util.Scanner;
import java.util.ArrayList;
public class RemoveEven {
    //SEE THIS AGAIN

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // System.out.println("Enter a number:");
        int n = scanner.nextInt();
        ArrayList<Integer>list= new ArrayList<>();
        for(int i=0;i<n;i++){
            int num=scanner.nextInt();
            list.add(num);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)%2==0){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

        scanner.close();
    }
}

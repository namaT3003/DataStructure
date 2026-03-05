package ClassCodes.Lecture29;

public class TrapRain {
    int trap(vector<int>& height) {
        import java.util.Scanner;
        
        public class TrapRain {
        
            public static void main(String[] args) {
        
                Scanner scanner = new Scanner(System.in);
        
                // System.out.println("Enter a number:");
                int n = scanner.nextInt();
                int left=0;
                int right=n-1;
                int answer=0;
                int rightmax=0;leftmax=0;
                while(left<right){
                    if(height[left]<=height[right]){
                        if(leftmax>=height[left]){
                            answer+=leftmax-height[left];
                        }
                        else{
                            leftmax=height[left]
                        }

                        
                    }
                }
        
        
                scanner.close();
            }
        }
    }
}

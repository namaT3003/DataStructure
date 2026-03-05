import java.util.Array;
package ClassCodes.Lecture27;

public class ProOfArray {
    import java.util.Scanner;
   public int[] productExceptSelf(int[] nums) {

    int n=nums.size();
    vector<Integer> leftproduct(n,1);
    vector<Integer> rightproduct(n,1);
    vector<Integer> ans(n);
    for(int i=1;i<n;i++){
        leftproduct[i]=leftproduct[i-1]*nums[i-1];
        
    }
    for(int i=m-2;i>=0;i--){
        rightproduct[i]=rightproduct[i+1]*nums[i+1];
    }
    for(int i=0;i<n;i++){
        ans[i]=leftproduct[i]*rigthproduct[i];
    }
    return ans;
   }
}

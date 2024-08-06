import java.util.HashMap;

public class duplicateValues {
    
    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hp = new HashMap<>();
        for(int i: nums){
            if(hp.containsKey(i)){
                return true;
            }
                hp.put(i,1);
        }
        return false;
    }    
    public static void main(String[] args) {
        int num[]= {1,2,3,1};
        
        Boolean val = containsDuplicate(num);

        System.out.println(val);
        
}
}
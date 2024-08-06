public class maxSubArray {
    public static int maxArray(int num[]) {
        int sum = num[0];
        int temp =0;
        for(int i=0;i<num.length;i++){
            temp += num[i];
            sum = Math.max(sum, temp);
            if(temp <0) temp =0;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int num[]= {-2,1,-3,4,-1,2,1,-5,4};
        int maxNumber = maxArray(num);
        System.out.println("Max subArray number: "+maxNumber);
}
}
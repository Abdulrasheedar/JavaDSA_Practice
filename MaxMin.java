public class maxMin {
    public static int min(int num[]){
        int minVal = Integer.MAX_VALUE;

        for(int i =0;i<num.length;i++){

            if(num[i]<minVal){
                minVal = num[i];
            }
        }
        return minVal;
    }
    public static int max(int num[]){
        int maxVal = Integer.MIN_VALUE;

        for(int i =0;i<num.length;i++){

            if(num[i]>maxVal){
                maxVal = num[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int num[]= {4,5,2,3,6,9};

        int min = min(num);
        int max = max(num);

        System.out.println("Min value: "+min+" , Max value: "+max);
    
}
}
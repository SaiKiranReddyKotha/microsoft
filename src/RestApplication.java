import easy.runningSum1dArray;

public class RestApplication {
    public static void main(String[] args){

        int[] nums = new int[]{1, 2, 3, 4};
        runningSum1dArray array = new runningSum1dArray();
        array.runningSum(nums);

    }
}

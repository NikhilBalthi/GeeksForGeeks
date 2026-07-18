public class FindCeil {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,8,10,11,12,19};
        int x = 5;
        int result = findCeil(arr,x);
        System.out.println("result " +result);
    }

    public static int findCeil(int[] arr, int x) {
        // code here
        int low = 0;
        int high = arr.length-1;
        int ans = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;
    }
}

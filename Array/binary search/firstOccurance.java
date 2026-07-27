public class firstOccurance {
    public static void main(String [] args) {
        int [] arr={12,56,987,987,987,1234};
        int target=987;
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else{
                index=mid;
                right=mid-1;
            }
        }
        System.out.println(index);
    }
}
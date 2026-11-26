public class eg {
  public static void main(String[] args) {
    int[] arr = { 5, 7, 9, 18, 19 };
    int target=5;
    int left=0;
    int right=arr.length-1;
    while(left<=right){
      int mid=(left+right)/2;
      if(arr[mid]<target){
        left=mid+1;
      }
      else if(arr[mid]>target){
        right=mid-1;
      }
      else{
        System.out.println("found");
        break;
      }
    }
  }
}

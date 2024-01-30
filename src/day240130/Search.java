package day240130;

public class Search {
    //二分发求值，折半
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};
        int low = 0;
        int high = arr.length-1;
        boolean find=false;
        int target = 4;
        while (low <= high) {
            int middle=(low+high)/2;
            if(target==arr[middle]) {
                System.out.println("在index="+middle+"找到了"+target);
                find=true;
                break;
             } else if (arr[middle]<target) {
                low=middle+1;
            }else{
                high=middle-1;
        }
        }
        if(!find){
            System.out.println("没找到");
        }
    }
}
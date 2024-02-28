1  C 2.B 3.A 4.没有定义score把level改成score且第二个String可以改为char

5.char类型字节少，在储存时节省空间  6.C 7.B

8.我家养了12只动物 9.两个变量增加括号(dogCount + catCount)

10.path 11.0  1  2    3   4

12.10换行8换行6换行4换行
13.9换行7换行5

14.措 "Tom", "John", "Done"不属于int型

15.没有数组对应符号无法储存

16.6

17"i", "a", "e", "7", "6", "6"

18 C

19地址

20. 111555999

21.159159159

22.public class Table99 {
public static void main(String[] args) {

    for(int i=1;i<=9;i++){
     System.out.println();
     for(int j=1;j<=i;j++){
        System.out.print(i+"*"+j+"="+(i*j)+"\t")
        }
        }





    }
}


23.public class BinarySearch {
    public static void main(String[] args) {
    int[] arr = new int[]{3, 4, 5, 6, 7, 8, 9};

    int target = 8;
    int left=0;
    int right=arr.length-1;
    boolean Found=false;
    while(left<=right){
        int middle=(left+right)/2;
        if(target<arr[middle]){
            right=middle-1;
        }
        if(target>arr[middle]){
            left=middle+1;
        }
        if(target==arr[middle]){
            Found=true;
            System.out.println(“在index="+middle+"找到了"+target);
        }
        
    }
        if(!Found){
        System.out.println(“没有找到");
        }
    }
}

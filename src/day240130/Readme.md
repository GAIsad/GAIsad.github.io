## 一：利用数组寻找某个值（优化前）
1.将这个数与数组1中的每个值进行比对，若相同则为找到。核心

int a1=arr[0];

if(traget==arr[0])

将这个核心要多次循环，则想到了要使用循环来遍历整个数组，最终判断加循环完成

## 二 利用二分法来优化寻值过程
优点：二分法速度快，效率高，循环次数较；

二方法的思路过程；![img.png](img.png)
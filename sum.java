class sum{
 public static void main(String[] args){
    int[] arr=new int[]{23,43,67,89,76,23,43,66,89};
    int sum=0;
    for(int i=0;i<arr.length;i++){
         sum=sum+arr[i];
    }
           System.out.println("the sum of element in an array"+sum);
 
}
}
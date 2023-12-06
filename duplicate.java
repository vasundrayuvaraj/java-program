class duplicate{
 public static void main(String[] args){
    int[] arr=new int[]{23,43,67,89,76,23,43,66,89};
    System.out.println(" duplicate elements of given array");
    for(int i=0;i<arr.length;i++){
         for(int j=i+1;j<arr.length;j++){
        if(arr[i]==arr[j])
           System.out.println(arr[i]+"");
    }
 }
}
}
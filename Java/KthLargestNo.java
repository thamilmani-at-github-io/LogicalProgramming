import java.util.Scanner;
class KthLargestNo{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Entering Array Size : ");
        int n = input.nextInt();
        int[] a = new int[n];
        System.out.print("Entering Array Values : ");
        for(int i=0;i<n;i++){
            a[i] = input.nextInt(); 
        }
        System.out.println("Enter the Kth Largest Position : ");
        int finding = input.nextInt();
        int temp = 0;
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(a[j]<a[i]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
        System.out.println("The Kth Element is : "+a[finding-1]);
    }
}
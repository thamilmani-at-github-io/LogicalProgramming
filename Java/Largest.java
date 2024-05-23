import java.util.Scanner;
class Largest{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Array Limit : ");
        int limit = input.nextInt();
        System.out.println("Enter Array Element Size "+limit);
        int[] a = new int[limit];
        for(int i = 0;i < limit;i++){
            a[i] = input.nextInt();
        }
        for(int i = 0;i < limit;i++){
            System.out.println(a[i]);
        }
        int Large = a[0],small = a[0];
        for(int i = 1; i < limit; i++){
            if(a[i] > Large){
                Large = a[i];
            }
            if(a[i] < small){
                small = a[i];
            }
        }
        System.out.println("Large : "+Large);
        System.out.println("Small : "+small);
    }
}
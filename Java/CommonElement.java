import java.util.*;
class CommonElement{
    public static void main(String args[]){
        ArrayList<Integer> d = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        int[] a = new int[]{1, 5, 10, 20, 40, 80,1000};
        int[] b = new int[]{6, 7,1000, 20, 80, 100};
        int[] c = new int[]{3,1000, 4, 15, 20, 30, 70,80, 120};
        int n1 = a.length , n2 = b.length , n3 = c.length;
        int count = 0;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i]==b[j]){
                    d.add(a[i]);
                }
            }
        }
        for(int k = 0;k<n3;k++){
            for(int i : d){
                if(c[k] == i){
                    result.add(c[k]);
                }
            }
        }
        System.out.println("The Given Common elements Are : ");
       for(int i : result){
        System.out.println(i+" ");
       }
    }
}
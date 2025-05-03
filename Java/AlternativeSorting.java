import java.util.ArrayList;

public class AlternativeSorting
{
	public static void main(String[] args) {
		int arr[] = new int[]{7, 1, 2, 3, 4, 5, 6};
		ArrayList<Integer> newarr = new ArrayList<Integer>();
		int n = arr.length;
		int arr2[] = new int[n];
		int temp;
		boolean IsEven = n % 2 == 0 ? true : false;
		
		for(int j=0;j<n-1;j++){
    		   for(int i=0;i<n-1;i++){
    		    if(arr[i] > arr[i+1]){
    		        temp     = arr[i];
    		        arr[i]   = arr[i+1];
    		        arr[i+1] = temp;
    		    }
    		}
		}
		int j=0,a=0;
		for(int i=n-1;i>(n/2)-1;i--){
		    if(IsEven==false && i==(n/2)){
		        newarr.add(arr[i]);
		        break;
		    }
		     newarr.add(arr[i]);
		     newarr.add(arr[j++]);
		}
		for(int i=0;i<n;i++){
		    System.out.print(newarr.get(i)+" ");
		}
		
	}
}
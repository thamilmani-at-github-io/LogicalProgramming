class PalindromicArray{
    public static void main(String args[]){
        int[] a = new int[]{1111,2222,3333,4444,5555};
        int n = a.length;
        if(palinArray(a,n)==1){
            System.out.println("The Given Array Is Palindrome ");
        }
        else{
            System.out.println("The Given Array Is Not Palindrome ");
        }
    }

   	public static int palinArray(int[] a, int n){
        for(int i = 0; i < n ;i++)
        {
            int count = 0;
            int val = a[i];
            int val2 = a[i];
            while( val > 0){
                if(val % 10 != 0)
                    count++;
                val = val/10;
            }
            if(count%2 == 0){
                String str = String.valueOf(val2);;
                str = str.toLowerCase();
                int n1 = str.length();
                int k = 0,l = n1-1;
                while (i<n1-1) {
                    if (str.charAt(k) != str.charAt(l)){
                        return 0;
                    }
                    k++;
                    l--;
                    i++;
                }
            }
        }
        return 1;
    }

}

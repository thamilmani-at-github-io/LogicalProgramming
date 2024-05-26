class TransitionPoints{
    public static void main(String args[]){
        int[] a = new int[]{1,1,1,1};
        int n = a.length;
        int count0 = 0;
        int count1 = 0;
        int result = 0,c=0;
        for(int i=n-1;i>=0;i--){
            if(a[i]==0){
                count0++;
            }
            if(a[i]==1){
                count1++;
            }
            if(a[i]==1 && i == 0)
            {
                result = i;
                c = 1;
                break;
            }
            if(a[i]==1 && i != 0)
            {
                result = i;
                c = 1;
                break;
            }
        }
        if(count0 == n){
            System.out.println("Result : -1");
        }
        else if(count1 == n){
            System.out.println("Result : 1");
        }
        else if(c==1){
            System.out.println("Result : "+result);
        }
    }
}
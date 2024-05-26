class TransitionPoint{
    public static void main(String args[]){
        int[] a = new int[]{1,1,1,1};
        int n = a.length;
        int result = 0;
        for(int i=n-1;i>=0;i--){
            if(a[n-1]==0){
                result = -1;
                break;
            }
            if(a[0]==1){
                result = 1;
                break;
            }
            if(a[i]==1)
            {
                result = i;
            }
        }
        System.out.println("Result : "+result);
    }
}
class LargestSmallestNo{
    public static void main(String args[]){
        int[] a = new int[]{5,6,7,1,3,9};
        int n = a.length,temp = 0;
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
    }
}
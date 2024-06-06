class WaveArray{
    public static void main(String[] args) {
        int a[] = new int[]{1,2,3,4,5};
        int n = a.length;
        System.out.println("Before Sorted : ");
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
        }
        int i=0,j=1;
        while(i<n-1){
            if(i%2==0){ //Even pass
                if(a[i]<a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
            else{
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    i++;
                    j++;
                }
                else{
                    i++;
                    j++;
                }
            }
        }
        System.out.println("After Sorted : ");
        for(int k=0;k<n;k++){
            System.out.print(a[k]+" ");
        }        
    }
}
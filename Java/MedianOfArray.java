class MedianOfArray{
    public static void main(String[] args) {
        int a[] = new int[]{4,6};
        int b[] = new int[]{1,2,3,5};
        int m = a.length , n = b.length;
        int p = m+n;
        int c[] = new int[p];
        for(int i = 0;i < p;i++){
            if(i<m){
                c[i] = a[i];
            }
            else{
                c[i] = b[i-m];
            }
        }
        System.out.println("Before Sorting : ");
        for(int i = 0;i<p;i++){
            System.out.print(c[i]+" ");
        }
        for(int i = 0;i<p;i++){
            for(int j = i+1;j<p;j++){
                if(c[i]>c[j]){
                    int temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        System.out.println("\nAfter Sorted : ");
        for(int i = 0;i<p;i++){
            System.out.print(c[i]+" ");
        }
        for(int i = 0;i<p;i++){
            if(p%2==1){
                int div = p/2;
                int val = c[div];
                System.out.println("\nMedian Of The Array : "+val);
                break;
            }
            else{
                int second = p/2;
                int first = second-1;
                float div = (float)(c[first]+c[second])/2;
                System.out.println("\nMedian Of The Array : "+div);
                break;
            }
        }
    }
}
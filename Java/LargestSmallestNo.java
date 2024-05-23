class LargestSmallestNo{
    public static void main(String args[]){
        int a[] = new int[]{7,8,9,4,2,8,5};
        int n = a.length;
        int s = 0 , l = 0;
        for(int i = 0; i < n ; i++){
            for(int j = i + 1; j < n ; j++){
                if(a[i]<a[j]){
                    s = a[i];
                    l = a[j];
                }
                else{
                    s = a[j];
                    l = a[i];
                }
            }
        }
        System.out.println("The Smallest Value Of the Array is : " + s);
        System.out.println("The Largest Value Of the Array is : " + l);
    }
}
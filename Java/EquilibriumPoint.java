class EquilibriumPoint{
    public static void main(String[] args) {
        int a[] = new int[]{1,5,10,25,20};
        int n = a.length-1;
        int small = a[n] , large = a[n-1];
        for(int i = n ; i>=0;i--){
            if(i>=1){
                if(small<=large){
                    small = a[i];
                    large = a[i-1];
                }
                else{
                    System.out.println(large);
                    small = a[i];
                    large = a[i-1];
                }
            }
        }
    }
}

class leftsideSmaller{
    public static void main(String[] args) {
        int[] a = new int[]{4,2,5,7};
        int n = a.length-1;
        int temp = a[0];
        for(int i = 1;i<n;i++){
            if(a[i]>temp){
                System.out.println(a[i]);
                temp = a[i];
            }
            else{
                temp = a[i];
            }
        }
    }
}
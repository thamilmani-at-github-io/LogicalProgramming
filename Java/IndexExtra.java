class IndexExtra{
    public static void main(String[] args) {
        int[] a = new int[]{3,5,7,8,11,13};
        int[] b = new int[]{3,5,7,11,13};
        int n = a.length;
        for(int i = 0;i<n-1;i++){
            if(a[i]!=b[i]){
                System.out.println(i);
                break;
            }
        }
    }
}
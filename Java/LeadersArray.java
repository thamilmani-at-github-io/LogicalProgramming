class LeadersArray{
    public static void main(String[] args) {
        int a[] = new int[]{10,4,2,4,1};
        int n = a.length;
        int temp = a[n-1];
        for(int i = n-1;i>=0;i--){
            if(temp<=a[i]){
                temp = a[i];
                System.out.println(temp);
            }
            else{
            }
        }
    }
}

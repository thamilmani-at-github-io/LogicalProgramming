class MaxcircularSubarr{
    public static void main(String[] args) {
        int[] a = new int[]{-1,40,-14,7,6,5,-4-1};
        //int[] a = new int[]{8, -8, 9, -9, 10, -11, 12};
        //int[] a = new int[]{10, -3, -4, 7, 6, 5, -4, -1};
        int n = a.length,pos=0;
        for(int i = n-1 ; i>=0;i--){
            if(a[i]<0){         //Finding Negative Number Position
                if(i == n-1){
                }
                else if(a[i]<0){
                    int temp = a[i+1];
                    if(temp<0){

                    }
                    else{
                        pos = i;
                        break;
                    }
                }
            }
        }
        
        int sum = 0;    //Right SubArray
        for(int i=pos+1;i<n;i++){
            sum  =sum + a[i];
        }

        int val = 0;    //Finding Left SubArray
        for(int i=pos-1;i>=0;i--){
            if(a[i]<0){
            }
            else{
                val = i;
                break;
            }
        }

        for(int i = 0;i<=val;i++){  //Adding Left SubArray
            sum = sum + a[i];

        }
        System.out.println("Sum : "+sum);
    }
}

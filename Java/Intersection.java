class Intersection{
    public static void main(String args[]){
        int[] a = new int[]{89, 24, 75, 11, 23};
        int[] b = new int[]{89, 2, 4 , 75};
        int m = a.length,count=0;
        int n = b.length;
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(a[i]==b[j]){
                    count++;
                    System.out.println("The Intersection Value Is : "+a[i]);
                }
            }
        }
        if(count>0)
            System.out.println("The Intersection Count Is : "+count);
        else
            System.out.println("The Intersection Count Is : "+count); 
    }
}
class CommonPrefix{
    public static void main(String[] args){
        String[] a = new String[]{"Hello","Worlds"};
        int n = a.length;
        int r=0;
        for(int i=0;i<n-1;i++){
            if(a[i].charAt(0) == a[i+1].charAt(0)){
                r = 1;
            }
            else{
                r = 0;
            }
        }
        if(r==1){
            int size = a[0].length();
            int count = 0;
            for(int i = 0;i<size;i++){
                
            }
        }
        else{
            System.out.println("Not Common");
        }
    }
}
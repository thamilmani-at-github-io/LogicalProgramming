class LengthEncoding{
    public static void main(String args[]){
        String s = "aaaabbccc";
        String a = "";
        int n = s.length(),count = 1;
        for(int i = 0;i<n;i++){
            if(i<n-1){
                if(s.charAt(i)==s.charAt(i+1)){
                    count++;
                }
                else{
                    System.out.print(count+" "+s.charAt(i));
                    count=1;
                }
            }
            else{
                System.out.print(count+" "+s.charAt(i));
            }
        }
    }
}

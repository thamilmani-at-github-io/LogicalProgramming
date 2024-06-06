class RepeatingCharacter{
    public static void main(String args[]){
        String s = "Kavin";
        int n = s.length(),rep = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.charAt(i)==s.charAt(j)){
                    System.out.println(s.charAt(i));
                    rep = 1;
                    break;
                }
            }
        }
        if(rep==0){
            System.out.println("No repeated Value "); 
        }
    }
}
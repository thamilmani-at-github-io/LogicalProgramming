class NonRepeatingCharacter{
    public static void main(String args[]){
        String Name = "Hello";
        int n = Name.length(),rep = 0;
        char a;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(s.indexOf(i)==s.indexOf(j)){
                    a=s.indexOf(i);
                    rep = 1;
                    break;
                }
            }
        }
        if(rep==1){
            System.out.println(a);
        }
        else{
            System.out.println("No repeated Value ");;
        }
    }
}
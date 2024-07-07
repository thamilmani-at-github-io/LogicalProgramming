class Palindrome{
    public static void main(String[] args) {
        String str = "Appa";
        str = str.toLowerCase();
        int n = str.length();
        int i = 0,j = n-1;
        int c = 0;
        while (i<n) {
            if (str.charAt(i) != str.charAt(j)){
                c = 0;
                break;
            }
            else
                c = 1;
            i++;
            j--;
        }
        if(c==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome ");
        }
    }
}
class RomanNumberInteger{
    public static void main(String args[]){
        String str = "III";
        System.out.println(ConvertRomans(str));
    }
    public static int ConvertRomans(String str){
        int count = 0;
        for(int i=0;i<str.length();i++){
            char str2 = str.charAt(i);
            switch(str2){
                case 'I':
                    count = count + 1;
                    break;
                case 'V':
                    count = count + 5;
                    break;
                case 'X':
                    count = count + 10;
                    break;
                case 'L':
                    count = count + 50;
                    break;
                case 'C':
                    count = count + 100;
                    break;
                case 'D':
                    count = count + 500;
                    break;
                case 'M':
                    count = count + 1000;
                    break;
                default:
                    System.out.println("Invalid Input is : "+str.charAt(i));
                    break;   
            }
        }
        return count;
    }
}
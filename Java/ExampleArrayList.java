import java.util.*;
class ExampleArrayList{
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        int size = list.size();
        System.out.println(size);
        //System.out.println(list.get(0));
        for(int i : list){
            System.out.println(i);
        }
    }
}
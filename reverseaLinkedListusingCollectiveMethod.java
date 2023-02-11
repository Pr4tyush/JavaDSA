import  java.util.*;

public class reverseaLinkedListusingCollectiveMethod {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        Collections.reverse(list);
        System.out.println(list);
        list.size();
        for(int i = 0;i< list.size();i++){
            System.out.print(list.get(i)+"<--");

        }
        System.out.print("null");
    }

    
}

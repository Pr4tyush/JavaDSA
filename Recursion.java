// public class Recursion {
//     public static void Rev(String str,int index){
//         if(index==0){
//             System.out.print(str.charAt(index));
//             return;
//         }
//         System.out.print(str.charAt(index));
//         Rev(str, index-1);

//     }
//     public static void main(String[] args) {
        
//         String str = "a b c d";
//         Rev(str, str.length()-1);
//     }
// }

// //Strictly Sorted array
// public class Recursion{
//     public static boolean sortedArray(int index,int arr[]){
//         if(index ==arr.length-1){
//             return true;
//         }

//         if(arr[index]< arr[index+1]){
//             return sortedArray(index+1, arr);
//         }else{
//             return false;
//         }

//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,3};
//         System.out.println(sortedArray(0, arr));
//     }
// }

// //Remove All the X of the String
// public class Recursion{
//     public static void moveAllX(int index,String str,int count,String newString){
//         if(index==str.length()){

//             System.out.println(newString);
//             return;
//         }
//         char currentchar = str.charAt(index);
//         if(currentchar == 'x'){
//             count =  count+1;
//             moveAllX(index+1, str, count, newString);
//         }else{
//             newString = newString+ currentchar;
//             moveAllX(index + 1, str, count, newString);
//         }

//     }
//     public static void main(String[] args) {
//         String str = "axbcxxxd";
//         moveAllX(0, str, 0, "");
//     }
// }


// //Print all The subsequences of the String //important CODE every node of a tree says that hwow many times function calls
// public class Recursion{
//     public static void printSubS(String str,int index,String newString){
//         if(index == str.length()){
//             System.out.println(newString);
//             return;
//         }
//         char currentchar = str.charAt(index);
//         //to be go
//         printSubS(str, index+1, newString+currentchar);

//         printSubS(str, index+1, newString);

//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         printSubS(str, 0, "");
//     }
// }

//Print the Combinations of keypad String of  a keypad phone

import java.util.HashSet;
public class Recursion {
public static String keypad[] = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs","tu", "vwx", "yz"};

public static void printKeypadCombination(String number, int idx, String res) {
    if(idx == number.length()) {
        System.out.println(res);
        return;
    }
    for(int i=0; i<keypad[number.charAt(idx)-'0'].length(); i++) {
        char curr = keypad[number.charAt(idx)-'0'].charAt(i);
        printKeypadCombination(number, idx+1, res+curr);
    }
}
    public static void main(String args[]) {
        String number = "4";
        printKeypadCombination(number, 0, "");
    }
}
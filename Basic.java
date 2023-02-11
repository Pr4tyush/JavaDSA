// import java.util.*;
// class Basic{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int button = sc.nextInt();
//         switch(button){
//             case 1:
//             System.out.println("hello");
//             break;
//             case 2:
//             System.out.println("Welcome");
//             break;
//             case 3:
//             System.out.println("Namaste");
//             break;
//             default:
//             System.out.println("sorry");
//         }
        
//     }
// }
import java.util.*;
class Basic{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=11;i++){
            System.out.println(n*i);
        }
    }
}
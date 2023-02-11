// import java.util.*;
// public class Pattern1 {

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }

//             for(int j=1; j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
// //lower
// for(int i=n; i>=1; i--){
//     for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//     }

//     for(int j=1; j<=2*i-1;j++){
//         System.out.print("*");
//     }
//     System.out.println();
// }
        
//     }
// }



// 

// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int n = sc .nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         for (int i=n ; i>=1; i--){
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// public class Pattern1 {
//     public static void main(String args[]){
//         int n = 4;
//         for(int i = n; i>=1; i--){
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1; j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }




// //#pattern problem

// public class Pattern1{
//     public static void main(String args[]){
//         int n = 4;
//         int m = 5;
//         for(int i=1;i<=n;i++){
//             for(int j=1 ; j<=m ; j++){
//                 if(i==1 || j==1 || i==n || j==m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }

// }




// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc .nextInt();
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// import java.util.*;
// class Pattern1 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc .nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Pattern1{
//     public static void main(String args[]){
//         int n = 10;
//         for(int i =1; i<=n; i++ ){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// public class Pattern1{
//     public static void main(String args[]){
//         int n = 5;
//         for(int i = 1; i <=n; i++){
//             for(int j =1; j<=i;j++){
//                 System.out.print(j+ " ");
//             }
//             System.out.println();
//         }
//     }
// }


// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc .nextInt();
//         int number=1;
//         for(int i=1; i<=n;i++){
//             for(int j=1; j<=i;j++){
//                 System.out.print(number+" ");
//                 number++;
//             }
//             System.out.println();
//         } 
//     }
// }


// import java.util.*;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space=2*(n-i);
//             for(int j=1; j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             int space=2*(n-i);
//             for(int j=1; j<=space;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// //#Hollow Rectangle
// import java.util.*;
// import java.util.function.DoubleToIntFunction;
// class Pattern1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int m = sc.nextInt();
//         for(int i=1; i<= n; i++){
//             for(int j=1;j<=m; j++){
//                 if(i==1 || j==1 || i==n || j==m){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//              }
//             System.out.println();
            

//         }
//     }
// }
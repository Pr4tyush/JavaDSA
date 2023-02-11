// class Pen{
//     String color;
//     String type ;
//     String Brand;
//     public void Write(){
//         System.out.println("Writing...");
//     }
//     public void printColor(){
//         System.out.println(this.color);  //"this." function helps to call the current function of a particular object
//     }
// }

// class Student{
//     String name;
//     String surname;
//     int rollno ;
//     public void printInfo(){
//         System.out.print(this.name);
//         System.out.println(this.surname);
//         System.out.println(this.rollno);
//     }
    // Student(){
    //     System.out.println("Constructor is Called....");  //this is Constructor
    // }

//     Student(String name , String surname,int rollno){  //Now this is Pearmetrized constructor
//         this.name = name;
//         this.surname = surname;
//         this.rollno = rollno;

//     }
    // public void printinformation(String name){  //When a same Function is working several times then it is known as FunctionOverloading
    //     System.out.println(name);
    // }
    // public void printinformation(int Age){
    //     System.out.println(Age);

    // }
    // public void printinformation(boolean working){
    //     System.out.println(working);
    // }
// }

// public class Oops {
//     public static void main(String[] args) {
//         Student s1 = new Student("Pratyush","Kumar",103);
//         Student s2 = new Student("Chirag","Choudhary",111);

//         s1.name = "Pratyush";
//         s1.surname = "Kumar";
//         s1.rollno = 103 ;
//         s2.name = "Chirag";
//         s2.surname = "Choudhary";
//         s2.rollno = 55;
//         s1.printInfo();
//         s2.printInfo();



        // Pen pen1 = new Pen();
        // pen1.color = "Black";
        // pen1.type = "Ballpen";
        // pen1.Brand= "Cello";
        // pen1.Write();

        // Pen pen2 = new Pen();
        // pen2.color = "Blue";
        
        // pen2.printColor();
        // pen1.printColor();

//     }
    
// }


//************************************Inheritance *********************************/
//It is Property that Helps to used some others Function Property By using "extend" keyword and many more 

import bank.*;

class Shape{
    String color;
    int sides;
    public void printData(){
        System.out.println(this.color);
        System.out.println(this.sides);
    }
}
 
class trinagle extends Shape{

}

class Oops{
    public static void main(String[] args) {
        bank.Account bank1 = new bank.Account();

        trinagle t1 = new trinagle();
        t1.color = "black";
        t1.sides = 3;
        t1.printData();
    }

}



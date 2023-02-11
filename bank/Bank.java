package bank;
class Account{
    public String name;   //this can acces from same class or any where
    protected String email; //"proctected" can visible within in the file it will not imported through pakcakges
    private String Password;
     //"private" can only visible within their own class it cant visible through even the driver class // to set this password we have to use the function setters and getter 
    public String getPassword(){
        return this.Password;
    }
    public void setPassword(String pass){
        this.Password = pass;

    }
}                            


public class Bank {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Pratyush kumar";
        account1.email = "kumarpratyushdss1999@gmail.com";
        account1.setPassword("123@4");
        account1.getPassword();
        
    }
    
}

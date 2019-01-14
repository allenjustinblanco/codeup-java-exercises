import java.util.Scanner;

public class User{
  Scanner scan = new Scanner(System.in).useDelimitter("\n");

  private String username(){
    System.out.println("Enter username?");
    String username = scan.next()
    return username;
  }
  private String password(){
    System.out.println("Enter password?");
    String password = scan.next();
    return password;
  }
  private int numberOfSuccessfulLogins(){

  }
  private int numberOfFailedLogins;
  private boolean isLoggedIn = false;
  private static int numberOfUsers;
  public login(username, password){
    if((this.username.equals(username)) && this.password.equals(password)){

    }
  }
  public logout(){

  }
  }
}

import java.util.Scanner;

public class User{
  Scanner scan = new Scanner(System.in).useDelimitter("\n");

  private int numberOfFailedLogins;
  private int numberOfSuccessfulLogins;
  private boolean isLoggedIn = false;
  private static int numberOfUsers;
  private String username;
  private String password;
  public User(String username, String password){
    this.username = username;
    this.password = password;
    numberOfSuccessfulLogins = 0;
    numberOfFailedLogins = 0;
    numberOfUsers++;
  }

  public login(username, password){
    if((this.username.equals(username)) && this.password.equals(password)){
      isLoggedIn = true;
    }
  }
  public logout(){
    isLoggedIn = false;
  }
  public void wait5minutes(){
    numberOfFailedLogins = 0;
  }
  public void changePassword(password){
    if(this.password.equalsIgnoreCase(password)){
      String newPassword = scan.next();
      this.password = newPassword;
      System.out.println("The account is now logged out.")
      isLoggedIn = false;
    }
  }
  }
}

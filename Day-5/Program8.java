/* 
   Q8. The Login System
   Check login with stored credentials ("admin","password123"). - Correct: Login successful. - Wrong username: Username not found. - Wrong password: Incorrect password.
   Sample Input: username="admin", password="wrongpassword" Sample Output: Incorrect password
*/
public class Program8 {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";
        if (username.equals("admin") && password.equals("password123")) {
            System.out.println("Login Successful");
        }else if(username.equals("admin")){
            System.out.println("Incorrect password");
        }else{
            System.out.println("Username not found");
        }
    }
}

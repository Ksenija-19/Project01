package NextPage;
//Create Registration Class in which you would have variables such as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class, the user should be able to call methods
//and in each method separately pass values to set users email, username and
//password.
//Requirements:
//● Valid email consider to be only yahoo
//● Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid passwords cannot contain
//userName
public class Registration {
    private String email;
    private String username;
    private String password;

    public void setEmail(String email) {
        if (email.toLowerCase().endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Set email successfully");
        } else {
            System.out.println("Wrong email");
        }
    }

    public void setUsername(String username) {
        if (!username.isEmpty() && username.length() > 6) {
            this.username = username;
            System.out.println("Username is set successfully");
        } else {
            System.out.println("Username is NOT set successfully");
        }
    }

    public void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 &&!password.contains(username)) {
            this.password = password;
            System.out.println("Password is set successfully");
        } else {
            System.out.println("Password is NOT set successfully");
        }
    }

    public void displayUserInfo() {
        System.out.println("Email" + email);
        System.out.println("username" + username);
        System.out.println("password" + password);
    }


    public static void main(String[] args) {
        Registration r= new Registration();
        r.setEmail("@Yahoo.com");
        r.setUsername("myUsername");
        r.setPassword(("MyPass123"));
        r.displayUserInfo();

    }
}
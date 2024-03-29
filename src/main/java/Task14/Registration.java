package Task14;
//Create Registration Class in which you would have variables such as email,
//userName and password that have an access scope only within its own class.
//After creating an object of the class, the user should be able to call methods
//and in each method separately pass values to set users email, username and
//password.
//Requirements:
//● Valid email consider to be only yahoo
//● Valid userName and password cannot be empty and should be of
//length larger than 6 characters. Also valid passwords cannot contain
//userName.
public class Registration {
    private String email;
    private String userName;
    private String password;



    public void setEmail(String email) {
        if (email.endsWith("@yahoo.com")) {
            this.email = email;
        } else throw new IllegalArgumentException();
    }

    public void setPassword(String password) {
        if (password.isEmpty()) throw new IllegalArgumentException();
        else if (password.length() < 7) throw new IllegalArgumentException();
        else if (password.contains(userName))throw new IllegalArgumentException();
        else {
            this.password = password;
        }
    }

    public void setUserName(String userName) {
        if (userName.isEmpty()) throw new IllegalArgumentException();
        else if (userName.length() < 7) throw new IllegalArgumentException();
        else {
            this.userName = userName;
        }
    }
    public void PrintInfo(){
        System.out.println("Email is "+"'"+email+"'"+" UserName is "+"'"+userName+"'"+" Password is "+"'"+password+"'");
    }
}

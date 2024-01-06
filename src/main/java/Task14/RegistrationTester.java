package Task14;

public class RegistrationTester {
    public static void main(String[] args) {
        Registration reg1=new Registration();
        System.out.println("First Registration");
        reg1.PrintInfo();
        System.out.println("Second Registration");
        reg1.setEmail("john@yahoo.com");
        reg1.setUserName("john1990");
        reg1.setPassword("987654321");
        reg1.PrintInfo();
        System.out.println("Third Registration");
        reg1.setEmail("john@gmail.com");
        reg1.setUserName("john1990");
        reg1.setPassword("987654321");
        reg1.PrintInfo();
    }
}

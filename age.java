 public class Main {

    static void checkAge(int age) throws Exception {

        if (age < 18) {
            throw new Exception("Age must be 18 or above");
        }

        System.out.println("Eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
 public class Main {

    static void checkAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above");
        }

        System.out.println("You are eligible");
    }

    public static void main(String[] args) {

        try {
            checkAge(15);
        }
        catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
Output
Age must be 18 or above

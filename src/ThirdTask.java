import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String login = in.nextLine();
        String password = in.nextLine();
        String confirmPassword = in.nextLine();
        boolean check_result = Check.Checking(login, password, confirmPassword);
        if (check_result){
            System.out.print("Введенные данные корректны");
        }
        else {
            System.out.print("Неправильные данные");
        }
    }
}

class Check {
    public static boolean Checking(String login, String password, String confirmPassword) {
        try {
            if (!correctLogin(login)) {
                throw new WrongLoginException("Неверный логин");
            }
            if (!correctPassword(password, confirmPassword)) {
                throw new WrongPasswordException("Неверный пароль");
            }
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    private static boolean correctLogin(String login) {
        return login.length() < 20 && login.matches("^[a-zA-Z0-9_]+$");
    }

    private static boolean correctPassword(String password, String confirmPassword) {
        return password.length() < 20 && password.matches("^[a-zA-Z0-9_]+$") && password.equals(confirmPassword);
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException(String mess) {
        super(mess);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String mess) {
        super(mess);
    }
}
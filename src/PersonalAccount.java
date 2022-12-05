import java.util.regex.Pattern;

public class PersonalAccount {

    static String login;
    static String password;
    static String confirmPassword;


//    PersonalAccount (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
//        this.login = validateLogin(login);
//        this.password = validatePassword(password);
//        this.confirmPassword = confirmPassword;
//    }

    public static void check (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!validateLogin(login)) {
            throw new WrongLoginException("Введите логин еще раз");
        }
        if (validatePassword(password) && password.equals(confirmPassword)) {
            System.out.println("Логин и пароль указаны корректно");
            System.out.println("Вы вошли в личный кабинет!");

        } else {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    public static boolean validateLogin (String login) throws WrongLoginException {
        int x = login.length();
        if ((x >0 && x < 20) && Pattern.matches("[a-zA-Z0-9_]*$", login)) {
            System.out.println("Логин корректен");

        } else {
            throw new WrongLoginException("Логин указан не верно");

        }
        return true;
    }

    public static boolean validatePassword (String password) throws WrongPasswordException {
        int x = password.length();
        if ((x > 0 && x < 20) && Pattern.matches("[a-zA-Z0-9_]*$", password)) {
            System.out.println("Пароль корректен");

        } else {
            throw new WrongPasswordException("Пароль указан некорректно");
        }
        return true;
    }


}




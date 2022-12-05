public class Main {
    public static void main(String[] args){
        try {
            PersonalAccount.check("12143", "123", "121444553");
        } catch (WrongPasswordException | WrongLoginException e) {
            System.out.println("Введенные данные не корректны");
            e.printStackTrace();
        }
    }
}
public class Conditionals {

    public static void main(String[] args) {
        int speed = 70;
        String message;

        if (speed > 60) {
            message = "You are speeding!";
        } else {
            message = "You are within the speed limit.";
        }

        System.out.println(message);
    }
}
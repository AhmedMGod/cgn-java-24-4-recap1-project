package org.example;

public class Main {
    public static void main(String[] args) {

        isThePassword8CharacterLong("12345678");
        isANumberInThePassword("ASD5AHKL6");
        isThePasswordinUpperCase("dKLKL");
        commonlyUsedPassword("Password");

    }

    public static void isThePassword8CharacterLong(String longPassword) {

        if (longPassword.length() >= 8) {

            System.out.println("The password is 8 characters long");

        } else {

            System.out.println("The password is to short");

        }
    }


        public static void isANumberInThePassword(String numberPassword) {

            if (numberPassword.contains("6")) {

                System.out.println("The password contains a digit.");

            } else {

                System.out.println("The password contains no digit.");

            }
        }

    public static void isThePasswordinUpperCase(String longPassword) {

        if (longPassword != longPassword.toUpperCase() && longPassword != longPassword.toLowerCase()) {

            System.out.println("The password has an upper and a lower case letter");

        } else {
            System.out.println("The password has no upper and lower case letter");
        }
    }

    public static void commonlyUsedPassword(String commonPassword) {

        String[] invalidPassword = {"12345678", "Password", "HAHA"};

        for (String passwords : invalidPassword) {
            if (passwords.equals(commonPassword)) {

                System.out.println("You used " + passwords + " a wrong password");

            }
        }

    }

}

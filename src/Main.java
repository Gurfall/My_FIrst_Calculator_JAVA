import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static String calc(String input) throws IOException
    {
        int result=0;
        String[] userInput;
        userInput = input.split(" ");
        if(userInput.length>3)
        {
            throw new IOException();
        }
        int num1 = Integer.decode(userInput[0]);
        int num2 = Integer.decode(userInput[2]);

        if(num1>10 || num2 >10 || num1 < 1 || num2 <1 )
        {
            throw new IOException();
        }

        char operation = userInput[1].charAt(0);
        switch (operation) {
            case ('+'):
                result = num1+num2;
                break;

            case ('-'):
                result = num1-num2;
                break;

            case ('/'):
                result = num1/num2;
                break;

            case ('*'):
                result = num1*num2;
                break;

            default:
                throw new IOException();

        }

        return String.valueOf(result);
    }

     public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        try {

            System.out.println("Result : "+calc(scan));
        }
        catch (IOException a) {
            System.out.println("Ошибка Ввода (Не соответствует начальным условиям)");
        }
    }
}

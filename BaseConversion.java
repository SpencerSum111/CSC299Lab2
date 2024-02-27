import java.util.Scanner;
class convertingBase
{
    static char returnCharacter(int number){
        if (number >= 0 && number <= 9)
            return (char)(number + 48);
        else
            return (char)(number - 10 + 65);
    }
    static String decimalConvert(int base, int inputNum){
        String numToConvert = "";
        while (inputNum > 0){
            numToConvert += returnCharacter(inputNum % base);
            inputNum /= base;
        }
        StringBuilder convertNum = new StringBuilder();
        convertNum.append(numToConvert);
        return new String(convertNum.reverse());
    }
    public static void main (String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please input a decimal number.");
        int inputNum = userInput.nextInt();
        while (inputNum < 0){
            System.out.println("Error: Number to convert can not be negative. Please try again");
            inputNum = userInput.nextInt();
        }
        System.out.println("Please input the base to convert.");
        int base = userInput.nextInt();
        while (base < 2 || base > 16){
            System.out.println("Error: Base must be greater than 2 and less than 16. Please try again.");
            base = userInput.nextInt();
        }
        System.out.println("Equivalent of " + inputNum + " in base "+base+" is " + decimalConvert(base, inputNum));
    }
}
package old;
import java.util.Scanner;

class initials
{
    public static void main(String[] a)
    {
        //matematika();
        //Int_To_Binary();
        Binary_To_Int();
    }

    public static void matematika(){
        long x = 1;
        int i = 0;
        int n = 2;

        for (i=0; i <= 50; i++){
            print(n + " to the power of " + i + " is " + x);
            x = x*2;
    }}

    public static void Int_To_Binary(){
        Scanner scanner = new Scanner(System.in);

        print("Input a number to convert to binary: ");
        long InputNumber = Integer.parseInt(scanner.nextLine());
        scanner.close();
        String numberInBinary = Long.toBinaryString(InputNumber);
        print("You inputed number: " + InputNumber + ". And this value in binary is: " + numberInBinary);
        return;
    }

    public static void Binary_To_Int(){
        Scanner scanner = new Scanner(System.in);

        print("Input a binary you want to convert to integer: ");
        String inputBinary = scanner.nextLine();
        scanner.close();
        long Binary = Long.parseLong(inputBinary, 2);
        print("You inputed binary number " + inputBinary + ". And the converted number is " + Binary);

    }


    public static String print(String message){
        System.out.println(message);
        return message;
    }
}
import java.util.Scanner;

class tests{
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        test8();

        scanner.close();
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void test1(Scanner scanner){
        int input1 = intInput("Input first number: ", scanner);
        int input2 = intInput("Input second number: ", scanner);
        print("The answer is " + intAverage(input1, input2));
    }

    public static int intInput(String message, Scanner scanner)
    {
        print(message);
        int inputNumber = Integer.parseInt(scanner.nextLine());
        return inputNumber;
    }

    public static int intAverage(int number1, int number2)
    {
        int average = (number1 + number2)/2;
        return average;
    }

    public static void test2(){ // idk what this is 
        int n = 3;
        int x = 1;
        int i = n;
        while (i>0) {
            print(Integer.toString(x));
            x = 2*x;
            i--;
            return;
        }
    }

    public static String minutesToHour(int minutes){
        int hours = minutes/60;
        int minutesLeft = minutes - (hours * 60);
        return ("Hours: " + Tostring(hours) + ". Minutes: " + Tostring(minutesLeft));
    }

    public static void printMessage(){
        System.out.println("Osduran kukla");
    }

    public static String Tostring(int integer){
        String string = Integer.toString(integer);
        return string;
    }

    public static void test3(){
        String plural = "";
        for(int i = 1; i <= 4; i++)
        {
            if (i!=1){
                plural = "s";
            }
            print(i + " green bottle" + plural + " hanging on a wall");
        }
    }

    public static void test4(){
        for (int i = 0; i <= 5; i++)
        {
            print(i + " squared is " + i*i);
        }
        print("Done! :D");
    }

    public static void test5(Scanner scanner){
        String[] vegetables = new String[5];
        for (int i = 0; i <= 4; i++){
            print((i+1) + ": Input a vegetable: ");
            String item = scanner.nextLine();
            vegetables[i] = item;
        }
        for (int i = 0; i <= 4; i++){
            print("What do you want to delete?");
            for (int x = 0; x <= vegetables.length; x++){
                print(x + ": is " + (vegetables[x]));
            }
            int indexToDelete = Integer.parseInt(scanner.nextLine());
            if (indexToDelete >= 0 && indexToDelete < vegetables.length) {
                for (int y = indexToDelete; y < vegetables.length - 1; y++) {
                    vegetables[y] = vegetables[i + y];
                }
                vegetables[vegetables.length - 1] = null; // Set the last element to null (optional)
            }
        }
    }

    public static void test6(Scanner scanner){
        final int students = 200;
        int AllMarks = 0;
        int[] marks = new int[students];
        for (int i = 0; i <= marks.length; i++){
            print("Stunde number " + i + ": Input your mark: ");
            marks[i] = Integer.parseInt(scanner.nextLine());
            AllMarks += marks[i];
        } 
        for (int x = 0; x <= marks.length; x++){
            print("Student "+ x + " got " + marks[x]);
        }
    }

    public static String inputString(String message,  Scanner scanner){
        System.out.println(message);
        String ans = scanner.nextLine();
        return ans;
    }

    public static void test7(Scanner scanner){
        String ans = "y";
        while (ans.equals("y")){
            ans = inputString("Another? (y/n)", scanner);
        }
    }

    public static void test8(){
        int[] a = { 1 };
        int[] b = { 2 };
        b = a;
        System.out.println(a[0]);
        System.out.println(b[0]);
        a[0] = 5;
        System.out.println(a[0]);
        System.out.println(b[0]);
    }
}
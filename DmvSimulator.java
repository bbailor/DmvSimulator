public class DmvSimulator
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the DMV!");

        int randomNum = (int)Math.ceil((Math.random() * 200) + 1);

        System.out.println("Your number in line is " + randomNum + ". Please wait until your number is called.");

        for (int i = randomNum; i < randomNum + 200; i++)
        {
            System.out.println("Calling number " + ((i % 200) + 1));
        }

        System.out.println("\nYour number, " + randomNum + ", was called. Unfortunately, we are not accepting your paperwork.");
        System.out.println("Please don't come back. Thank you!");
    }
}

public class DmvSimulator
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the DMV!");

        int randomNum = (int)Math.ceil((Math.random() * 100) + 1);

        System.out.println("Your number in line is " + randomNum + ". Please wait until your number is called.");

        for (int i = randomNum; i < randomNum + 100; i++)
        {
            System.out.println("Calling number " + ((i % 100) + 1));
        }

        System.out.println("Your number was called. Unfortunately, we are not accepting your paperwork.");
        System.out.println("Please don't come back. Thank you!");

        

    }
}

public class DmvSimulator
{
    public static void main(String[] args) 
    {
        System.out.println("Welcome to the DMV!");

        int randomNum = (int)Math.ceil((Math.random() * 200) + 1);
        boolean miracle = ((int)Math.ceil((Math.random() * 100) + 1)) == 100;

        System.out.println("Your number in line is " + randomNum + ". Please wait until your number is called.");

        for (int i = randomNum; i < randomNum + 200; i++)
        {
            System.out.println("Calling number " + ((i % 200) + 1));
        }

        if(!miracle)
        {
            System.out.println("\nYour number was called. Unfortunately, we are not accepting your paperwork.");
            System.out.println("Please don't come back until you obtain the skill of using common sense. Like using the internet and seeing what you should need and not waste my time in my line standing around like an idiot. Even my grandman could do that and she's 98!  Muah hah hah haaaaaaa");

        }
        else
        {
            System.out.println("\nYour number was called. Your paperwork is all good. You are all set!");
        }
    }
}

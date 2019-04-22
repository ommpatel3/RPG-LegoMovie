
/**
 * class - guard, at the duplo headquarters - 3 methods
 *
 * om patel
 *
 */
public class guard
{
    //method entails conversation with guard
    static int guard(int point)
    {
        System.out.println("Guard\"Hello everyone, what are you all here for?\"");
        //initialising loop variable
        char continu= 'y';
        //keeps looping until user user quits
        while (continu=='y'||continu=='Y')
        {
            char answer=IBIO.inputChar("\na) to meet president business\nb) to destroy the kragle\nc) to make final preparations for the project\nd) to admire the view");
            if (answer=='c'||answer=='C')
            {
                break;
            }
            if (answer!='c'&&answer!='C')
            {
                if(answer=='a')
                {
                    System.out.println("\nGuard:\"Hey! Who's president business?\n Security!!\"");
                }
                else if(answer=='b')
                {
                    System.out.println("\nGuard:\"The Kragle? Wait, what? Security!!\"");
                }
                else if(answer=='d')
                {
                    System.out.println("\nGuard:\"Huh? What view? Security!!\"");
                }
                else 
                {
                    System.out.println("\nInvalid input");
                }
                //gameover ascii art
                art.gameover();
                continu=IBIO.inputChar("Would you like to restart from the checkpoint?(y/n - pressing n will end the game)");
                if (continu!='y')
                {
                    System.exit(0);
                }
                else
                {
                    System.out.println("Let's try that again");
                }
            }
        }
        System.out.println("\"Ok, very well, I'm sure that you must be very important then,\"");
        System.out.println("\"Let's see if that's true using my patanted fool-proof method.\"");
        IBIO.inputChar("Press any key to proceed\n");
        //calling daisy chain class
        boolean daisy=daisy();
        if (daisy==true)
        {
            return point;
        }
        else 
        {
            System.out.println("\n\"Tough luck, you're not getting in, sorry!\nor... you could pay a small fee to get in, but don't tell anyone? okay?\"");
            //calls paying methd, only if user isn't allowed in by the guard's daisy chain 
            point=pay(point);
            return point;
        }
    }

    //daisy chain method
    static boolean daisy()
    {
        art.door();
        int num=(int)((Math.random()*15)+5);
        for (int i=1;i<=num;i++)
        {
            if (i%2==0){
                System.out.println("You may enter");
            }
            else {
                System.out.println("You may not enter");
            }
            try
            {
                Thread.sleep(i*10+100);
            }
            catch (InterruptedException m)
            {
                ;
            }
        }
        if (num%2==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    //paying method, triggered only if daisy chain returns no
    static int pay(int point)
    {
        int num=IBIO.inputInt("So, how many of them diamonds are you gonna give me? ");
        char continu='n';
        do{
            if (num>=10&&num<point)
            {
                System.out.println("Ok, sounds good, go on");
                continu='y';
                point-=num;
                System.out.println("\n*Lost "+num+" diamonds*");
                System.out.println("*You have "+point+" diamonds*");
            }
            else if(num<10)
            {
                num=IBIO.inputInt("That's not going to be enough, how many: ");
            }
            else 
            {
                num=IBIO.inputInt("You don't have that many, how many will you give: ");
            }
        }while(continu=='n');
        return point;
    }
    
}
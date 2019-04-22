/**
 * location class- vent - 4 methods
 *
 * om patel
 * 
 */
public class vent
{
    static int vent(int point)
    {
        System.out.println("\nIt appears as though there are three possible paths ");
        char direction=IBIO.inputChar("\nWhich way do you go? \nleft(l)\nright(r)\nstraight(any other letter) ");
        if (direction=='l'||direction=='L')
        {
            //user finds 5 diamonds
            point+=5;
            pointprint(point, 5);
            quickevent();
            System.out.println("You see yet another split in the path, ");
            char direction2='l';
            do{
                direction2=IBIO.inputChar("Which way do you go? \nleft(l)\nright(r)");
                if (direction2=='l'||direction2=='L')
                {
                    System.out.println("It's a dead end, so you go back");
                    // the dead end forces the user to go back and try going the other way, which is why there's a do/while loop
                }
                else if (direction2=='r'||direction2=='R')
                {
                    point+=5;
                    pointprint(point,5);
                    System.out.println("You made it out of the vent, and found the Kragle room!");
                }
            }while(direction2=='l'||direction2=='L');
        }
        else if (direction=='r'||direction=='R')
        {
            point+=15;
            pointprint(point, 15);
            quickevent();
            System.out.println("You see yet another split in the path, ");
            char direction2='r';
            do{
                direction2=IBIO.inputChar("Which way do you go? \nleft(l)\nright(r)");
                if (direction2=='r'||direction2=='R')
                {
                    System.out.println("It's a dead end, so you go back");
                    // the dead end forces the user to go back and try going the other way, which is why there's a do/while loop
                }
                else if (direction2=='l'||direction2=='L')
                {
                    System.out.println("You made it out of the vent, and found the Kragle room!");
                }
            }while(direction2=='r'||direction2=='R');
        }
        else 
        {
            quickevent();
            System.out.println("You see yet another split in the path, ");
            char direction2='r';
            do{
                direction2=IBIO.inputChar("Which way do you go? \nleft(l)\nright(r)");
                if (direction2=='l'||direction2=='L')
                {
                    point+=20;
                    pointprint(point,5);
                    System.out.println("You made it out of the vent, and found the Kragle room!");
                }
                else if (direction2=='r'||direction2=='R')
                {
                    point+=5;
                    pointprint(point,5);
                    System.out.print("It's a dead end, so you go back");
                    // the dead end forces the user to go back and try going the other way, which is why there's a do/while loop
                }
            }while(direction2=='r'||direction2=='R');
        }
        return point;
    }
    

    static void quickevent()
    {
        //initialize loop variable
        long timeElapsed;
        do
        {
            String letters= "asdfghjklzxcvbnmqwertyuiop";
            //finds random number to represent a letter of the alphabet
            int num=(int)(Math.random()*25)+1;
            //the random number is assigned to a letter
            char letter = (char) (letters.charAt(num-1));
            System.out.println("Quick! camera robots are driving down the vents towards you!");
            //finds the time before answering
            long start = System.currentTimeMillis();
            char input=IBIO.inputChar("Hurry, press "+letter+" to duck, so it can't see you!");
            //finds time after answering
            long finish = System.currentTimeMillis();
            //finds elapsed time
            timeElapsed = finish - start;
            if (timeElapsed<=2000)
            {
                System.out.println("\nYou avoided the robot! Good Job");
                System.out.println("Your time: "+timeElapsed+" miliseconds\n");
                break;
            }
            else 
            {
                //user fails and retries
                System.out.println("You Failed! Try Again!");
            }
        } while (!(timeElapsed<=2000));
    }

    
    
    static void kragleroom()
    {
        System.out.println("The room is filled with as many Kragles as the eye can see!");
        System.out.println("but, out of the corner of your eye, you spot one computer, which controls the whole system");
        System.out.println("\nBenny:\"I dont know how to use these kind of computers\"");
        System.out.println("\nVitruvius:\"Uhhh... I have no idea\"");
        System.out.println("\nWyldstyle:\"Emmet, this is all up to you!\"");
        System.out.println("\"Ok then, let me try\", you say");
        System.out.println("As the countdown is getting ever closer to the inevetable doom that would fall on the residents of Bricksburg\n");
        IBIO.inputChar("Press enter to try");
        //computer ascii art
        art.computer1();
        time.wait(1000);
        System.out.println("\n As you start to sweat, you press the enter key and another message pops up:");
        time.wait(1000);
        //computer ascii art
        art.computer2();
        //initialise loop variable
        String answer="";
        do
        {
            answer=IBIO.inputString(">> ");
            if ((answer.toLowerCase()).equals("lego duplo"))
            {
                System.out.println("SELF DESTRUCT INITIATED");
            }
            else 
            {
                System.out.println("INCORRECT PASSWORD, TRY AGAIN");
            }
        }while(!(answer.toLowerCase()).equals("lego duplo"));
    }
    /**
     * 
     */
    static void pointprint(int point, int gain)
    {
        /* prints out how many points the player has*/
        System.out.println("\n*You collected "+ gain + " diamonds*");
        System.out.println("*You have " + point + " diamonds*\n");
    }
}

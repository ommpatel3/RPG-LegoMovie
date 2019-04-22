/**
 * Compsci RPG assignment - 11 methods
 * Criterion C Om Patel (P1) 
 * April 12, 2019 
 * Based on: The Lego Movie (Emmet Brickowski) 
 * The objective is to save Bricksburg from the kragle, once again as it has emerged in the hands of the lego duplos who plan to use it on bricksburg
 * The password is "password"
 */
public class RPG_ompatel
{

    static public void main(String[] args)
    {
        new  RPG_ompatel();
    }

    //password method, asks user for password until they get it right then assigns a username
    public RPG_ompatel()
    {
        //initializing password input variable
        String password="";
        //asks user for password once, if they get it wrong, it will keep asking until they get it right
        do
        {
            password = IBIO.inputString("Password>>");
            if (password.equals("password")) {
                int usernum=(int)(Math.random() * 10) + 1;
                String username="";
                //finds a username for the user based on the random number
                switch(usernum)
                {
                    case 1:username="Emmet1"; break;
                    case 2:username="Emmet2"; break;
                    case 3:username="Emmet3"; break;
                    case 4:username="Emmet4"; break;
                    case 5:username="Emmet5"; break;
                    case 6:username="Emmet6"; break;
                    case 7:username="Emmet7"; break;
                    case 8:username="Emmet8"; break;
                    case 9:username="Emmet9"; break;
                    case 10:username="Emmet0"; break;
                }
                System.out.println("Your username is: "+username);
                intro();
            }
            else {
                System.out.println("incorrect password");
            }
        }while (!(password.equals("password")));
    }

    //introduction to storyline
    public void intro()
    {
        // introduces game backstory and setting but leaves user in the dark about the objective,which is revealed soon 
        //prints out the bricksburg ASCII art
        art.bricksburg();
        System.out.println("Welcome to Bricksburg!");
        System.out.println("You, Emmet Brickowski are asleep in your small residential apartment");
        System.out.println("After the events of the first Lego Movie,");
        System.out.println("The Lego Duplos now live alongside the other Legos.");
        System.out.println("However, it is little known to the residents of bricksburg that...\n");
        System.out.println("*Ring* *Ring* - your phone starts ringing and your ringtone starts playing...");
        // prints out music sign ASCII art
        art.music();
        System.out.println("*Everything is awesome, everything is cool when youre part of a team...\n");
        //initializing loop variable
        char pickup = 'b';
        //loop runs until the user chooses to pick up the phone
        while (pickup != 'a') {
            //gives user option on whether or not they want top pick up, changing the pickup variable
            pickup = IBIO.inputChar("This seems to be an important phonecall, do you:\na) get up and answer it\nb) let it ring, its probably not important");
            if (pickup == 'b') {
                // if they choose not to pick up the phone, they will lose but will be given the oportunity to try again 
                //prints out gameover text
                art.gameover();
                System.out.println("Little did you know that the Lego Duplos had found the kragle, and this time even more");
                System.out.println("They used it on the citizens of Bricksburg and the world was glued into place, all while you were sleeping");
                System.out.println("\nLet's try that again, shall we?\n");
            }
            else if (pickup == 'a') {
                // if the player chooses to pickup the phone, the game will start
                game();
            }
            else {
                // if the player doesnt enter a or b, they will be given an opportunity to try again
                System.out.println("please enter a valid character");
            }
        }
    }

    static void game()
    {
        //initializing the variable that allows the okayer to play the whole game again(opportunity given at the end of the game)
        char playagain='y';
        //this loop goes around the whole game, allowing the user to play it again
        while (playagain=='y'||playagain=='Y')
        {
            System.out.println("\nYou get up quickly to check the phone:\n");
            // prints out the ASCII phone
            art.phone();
            System.out.println("\nWyldstyle: Hey Emmet, it's Wyldstyle, there's something very urgent I need to tell you about");
            System.out.println("Listen up, the master builders have gathered info that the lego duplos have found multiple kragles");
            System.out.println("There is also reason to believe that they are going to use it on the residents of Bricksburg!");
            System.out.println("Look, we need to stop them, so come meet up with Ghost Vitruvius, Benny and myself so we can work as a team!");
            System.out.println("You should be able to find me at cloud cukooland, Benny in Cape Space and Vitruvius in the Old West");
            System.out.println("And remember, try to collect as many diamond pieces as possible. Here, I'll send you 20 right now!");
            // initializing points variable for user
            int point = 20;
            pointprint(point, 20);
            //calling wear method, where user chooses what to wear, and based on their choice, they can earn diamonds
            point=wear(point);
            //fill in the blanks task
            System.out.println("While getting ready, you begin to sing your favorite song, but you forget the lyrics..\n");
            //points are awarded if user gets fill in the blank correctly
            point = fillblank(point);
            System.out.println("Ok, let's go, now where should I head out first?");
            //calling thread.sleep method, which creates a delay of (parameter) miliseconds
            time.wait(500);
            System.out.println("hmm...");
            time.wait(1000);
            System.out.println("I can't seem to decide, let me ask my magic 8 stud");
            //input is taken from the user, but not assigned to a variable, this is to allow a pause and let the user feel like they control the 8 ball
            IBIO.inputString("\npress enter to shake the stud ");
            //magic 8 ball game
            String place = magic8();
            if (place == "The Old West\n") {
                //input taken to create pause
                IBIO.inputChar("Press enter to go to the Old West");
                //calls oldwest class and changes the point valuse based on how many points the player earned/lost
                point = oldwest.oldwest(point);
                IBIO.inputChar("Press enter to go to Cloud Cukooland");
                point = cukoo.cukoo(point);
                IBIO.inputChar("Press enter to go to Cape Space");
                point=cape.cape(point);
            }
            else if (place == "Cloud Cukooland\n") {
                IBIO.inputChar("Press enter to go to Cloud Cukooland");
                point = cukoo.cukoo(point);
                IBIO.inputChar("Press enter to go to the Old West");
                point = oldwest.oldwest(point);
                IBIO.inputChar("Press enter to go to Cape Space");
                point=cape.cape(point);
            }
            else {
                IBIO.inputChar("Press enter to go to Cape Space");
                point=cape.cape(point);
                IBIO.inputChar("Press enter to go to Cloud Cukooland");
                point = cukoo.cukoo(point);
                IBIO.inputChar("Press enter to go to the Old West");
                point = oldwest.oldwest(point);
            }
            time.wait(2000);
            //input taken to add delay, and so the user has time to understand and comprehend the output
            IBIO.inputChar("Press enter to go back to Bricksburg\n");
            //prints out the bricksburg sign, calls it from the art class
            art.bricksburg();
            System.out.println("\nWith the whole team together, back in Bricksburg, Wyldstyle begins to brief everyone");
            time.wait(300);
            System.out.println("\"Ok everyone, listen up, today night, we will all sneak into the Duplo headquarters\"");
            System.out.println("\"We will all pose as Duplos by putting on pink facepaint\"");
            System.out.println("\"Here, we will find our way through the vents to the Kragle room, where we will destroy the kragle supply\"");
            System.out.println("\"The other master builders have information that this is where they store the Kragles\""); 
            System.out.println("\"And also, that they plan on using it tomorrow morning, while everyone is sleeping, so no one can stop them!\"");
            System.out.println("Emmet: \"Sure thing, lets do this!\"");
            time.wait(1000);
            System.out.print("\nLater that day\n");
            time.wait(1000);
            System.out.println("Ok everyone, let's go, there's the guard");
            guard.guard(point);
            System.out.println("After entering the building, the team sneaks into a vent when no one is looking");
            System.out.println("Ghost Vitruvius: \"Ok everybody, we're in the vents so let's get to work\"");
            //calling vent location class, points are changed based on points gained/lost in this class
            point=vent.vent(point);
            //after the vent is completed, and the user finds a way out, they find the kragleroom
            //calling kragleroom class
            vent.kragleroom();
            //ternary operator. if points are greater than 70, it returns true, if not it returns false
            boolean secretending=(point>=70)?true:false;
            if(secretending==true)
            {
                //calls ending and secret ending methods
                ending(point);
                secretending();
            }
            else
            {
                //calls ending method
                ending(point);
                System.out.println("But there still is one secret ending which you have not unlocked");
            }
            playagain=IBIO.inputChar("Would you like to play again?(y/n)");
        }
    }

    //prints out how many points the user has and how many they have collected
    static void pointprint(int point, int gain)
    {
        System.out.println("\n*You collected "+ gain + " diamonds*");
        System.out.println("*You have " + point + " diamonds*\n");
    }

    //asks user what they want to wear, decision task, gives the user points if the answer b
    static int wear(int point)
    {
        char wear = IBIO.inputChar("Emmet: Lets get ready first, what should I wear?\na) work clothes \nb) suit, pants and tie \nc) t-shirt and jeans");
        if (wear == 'a') {
            System.out.println("\nYou put on your orange construction clothes and hard hat and head out");
            return point;
        }
        else if (wear == 'b') {
            System.out.println("\nYou put on the best suit and pants you have and leave, \nwhats that? you found 5 diamonds in your pocket");
            point+=5;
            pointprint(point, 5);
            return point;
        }
        else if (wear == 'c') {
            System.out.println("\nYou put on a nice t shirt and head out");
            return point;
        }
        else {
            System.out.println("\nYou can't decide so you head out in your pajamas");
            return point;
        }
    }

    //fill in the blanks method, asks user to complete the song 
    static int fillblank(int point)
    {
        //taking input for fillblank
        String word = IBIO.inputString("Everything is >");
        //initialising the loopcount variable
        int i = 1;
        //asks the user 4 times for the word if they get it wrong
        while ( ! ((word.toLowerCase()).equals("awesome")) && (i < 4)) {
            word = IBIO.inputString("Everything is >");
            if (i == 3) {
                System.out.println("Oh yeah, I remember now, Everything is awesome!");
            }
            i ++;
        }
        if (word.equalsIgnoreCase("awesome")) {
            //if they get the question right, they gain 5 points
            point += 5;
            pointprint(point, 5);
            return (point);
        }
        else {
            return (point);
        }
    }

    //magic 8 ball method
    static String magic8()
    {
        //finds random number from 1-3
        int ballnum=(int)(Math.random() * 3) + 1;
        //prints out bagic 78 ball ascii art
        art.magic8();
        if (ballnum==1)
        {
            return"The Old West\n";
        } 
        else if (ballnum==2)
        { 
            return"Cloud Cukooland\n"; 
        }
        else
        { 
            return "Cape Space\n"; 
        }
    }

    //regular ending method
    static void ending(int point)
    {
        //ascii you win message
        art.youwin();
        System.out.println("After saving the world of Bricksburg, You and all of you Master builder friends gather to celebrate");
        System.out.println("You have a great time in Bricksburg and are hailed as a hero!");
        System.out.println("Total Diamonds: "+point);
        //ascii diamond art
        art.diamond(); 
    }

    //secret ending
    static void secretending()
    {
        System.out.print("\nA few days later, you recieve a letter from Wyldstyle, Ghost Vitruvius and Benny");
        System.out.println("It says: ");
        time.wait(100);
        System.out.println("Dear Emmet,");
        time.wait(100);
        System.out.println("We wanted to thank you for your help in saying Bricksburg by making a special present for you");
        time.wait(100);
        System.out.println("If you tell us what height you want it, we will be able to make a pyramid of stars to that height");
        //runs pyramid method
        pyramid();
    }

    //prints out pyramid
    static void pyramid()
    {
        int height=IBIO.inputInt("height");
        for (int row=0; row<height; row++) 
        {    
            for (int spaces=height-row; spaces>1; spaces--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
            for (int star=0; star<=row; star++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
            //goes to next line
            System.out.println();
        }
    }
}

/**
 *location class- cloud cukooland - 2 methods
 * 
 * 
 * 
 */
public class cukoo
{
    static int cukoo(int point)
    {
        //prints out cloud cukooland ascii art
        art.cukoosign();
        System.out.println("\n\"Welcome to Cloud Cukooland! Where there are rainbows and sparkles and everyone is happy!\", says a cheerful cat-unicorn creature");
        System.out.println("\"Oh hey, Unikitty!\", you say");
        System.out.println("\"Emmet since you're here and I'm super excited let me ask you some questions\" ");
        //calling multiplechoice method and changing points if they win any
        point+=multiplechoice();
        System.out.println("*You Have "+point+" Diamonds*");
        return point;
    }  

    //multiple choice question task
    static int multiplechoice()
    {
        //initialising counting variable
        int correct=0;
        //asking user 3 multiple choice qestions
        System.out.println("\nWhat is Emmet’s Last name?");
        char answer=IBIO.inputChar("a) Brickowski \nb) Smith \nc) Bricksman \nd) Blockowski \n ");
        if (answer=='a'||answer=='A')
        {
            System.out.println("Wow! correct");
            correct++;
        }

        System.out.println("\nWhat is Vitruvius always seen holding");
        answer=IBIO.inputChar("a) A sword \nb) A staff \nc) A pair of ninja stars \nd) A magic hat \n ");
        if (answer=='b'||answer=='B')
        {
            System.out.println("That's right! Amazing!");
            correct++;
        }

        System.out.println("\nBatman only works in black and,");
        answer=IBIO.inputChar("a) Orange \nb) Dark blue \nc) Green \nd) Dark grey\n ");
        if (answer=='d'||answer=='D')
        {
            System.out.println("Cool!That's Right!");
            correct++;
        }

        //printing out how many questions they got right and displaying a message based on how many correct answers they gave
        System.out.println("\nYou got "+correct+" out of 3");
        time.wait(1000);
        System.out.print("\nThat's ");
        if (correct==0)
        {
            System.out.println("still good, don't worry, you're a winner as long as you have fun\n");
        }
        else if (correct==3)
        {
            System.out.println("AMAZING! you got perfect!\n");
        }
        else
        {
            System.out.println("pretty good!\n");
        }
        //giving 5 points for each correct answer
        System.out.println("*Collected "+(correct*5)+" Diamonds*");
        System.out.println("After answering Unikitty's questions, you ask her where Wyldstyle is");
        System.out.println("Wyldstyle:\"Emmet! No time to talk, you already got my message! Let's go!\"");
        System.out.println("You leave Cloud Cukooland for the next location with Wyldstyle\n");
        return (correct*5);
    }

}
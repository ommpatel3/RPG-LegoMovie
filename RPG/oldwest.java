/**
 *location class - old west - 2 methods
 * 
 * 
 * 
 */
public class oldwest
{
    static int oldwest(int point)
    {
        //prints old west ascii art
        art.oldwestsign();
        System.out.println("\nWelcome to The Old West!");
        System.out.println("\nTask:\nFind Ghost Vitruvius\n");
        System.out.println("Emmet: Hey, What's that? ");
        time.wait(1500);
        System.out.println("A saloon?");
        System.out.println("Let's go inside, I remember Vitruvius used to be there all the time\n");
        //prints old door ascii art
        art.olddoor();
        IBIO.inputChar("\nPress enter to open the door and go inside ");
        System.out.println("\nInside, a lego man greets you,");
        System.out.println("\"Ey there you, you ain't from around these parts, are ye?\"");
        System.out.println("\nYou put on your best wild west accent and say:");
        System.out.println("\"uh, yeah-I mean howdy partner I'm from around here all right yeeeehaw eh?\"");
        System.out.println("\nHe grumbles: \"hmm ok sure now what about\"-he squints his eyes-\"Backjack\"");
        char play=IBIO.inputChar("Do you want to play? (y/n)");
        if (play=='y'||play=='Y')
        {
            System.out.println("Ok then, let's go");
            time.wait(1500);
            //calls blackjack method
            point+=blackjack();
        }
        else
        {
            System.out.println("\nHe puts his hand on his revolver and looks like he's getting angry");
            System.out.println("Hey, the poster on the wall kind of looks like him too, \nHe is none other than Buckeye Bill, the Sharpest shooting bandit of the old west!");
            System.out.println("\nIt's probably your best interest to say yes");
            while (play!='y'&&play!='y')
            {
                play=IBIO.inputChar("\nHe asks again grabbing tighter onto his shiny new revolver, \"do you want to play or what, kid?\" (y/n)");
                if (play=='y'||play=='Y')
                {
                    //calls blackjack method
                    point+=blackjack();
                }
                else
                {
                    System.out.println("\n*BANG BANG BANG*\nEmmet Brickowski\n2019-2019\n\nhis shooting skills were so quick that you didnt even have a chance to understand what was going on");
                    //prints gameover ascii text
                    art.gameover();
                    char end=IBIO.inputChar("Would you like to restart from the checkpoint?(y/n - pressing n will end the game)");
                    if (end!='y')
                    {
                        //terminates code
                        System.exit(0);
                    }
                    else
                    {
                        System.out.println("Let's try that again");
                    }
                }
            }
        }
        System.out.println("*You have "+point+" diamonds*\n");
        System.out.println("After a nice game of blackjack, you decide to head upstairs, to meet Vitruvius");
        System.out.println("You head up the stairs and there he is! your old friend Ghost Vitruvius himself!");
        System.out.println("\n\"oOoOOooOOo\", he says, \"Hey Emmet!\"");
        System.out.println("Good thing you came here quickly, I believe Wyldstyle must have told you how important the situation is?");
        System.out.println("Emmet: Yeah, she sure did, so we better get going");
        System.out.println("\nYou leave the saloon, with your friend Ghost Vitruvius and go to the next location...");
        time.wait(5000);
        return(point);
    }

    static int blackjack()
    {
        //blackjack game
        int dealer=0;
        int player=0;
        char yes='y';
        int i=1;
        System.out.println("\nBLACKJACK");
        System.out.println("+++++++++++");
        System.out.println("\nThe objective of Blackjack is to get your hand total closer to 21 than the dealer without going over 21");
        System.out.println("Every turn, you can take up to 5 cards, during which you can end at any point");
        System.out.println("If you go over 21, you lose immediately, but if you get exactly 21, you win instantly");
        System.out.println("\"There is one twist, since I want to finish beating you real quick, the two of us only get one turn\"");
        art.blackjack();
        System.out.println("\nHe says, \"But first, lets spice this game up a bit\"");
        System.out.println("If I win, you give me 10 of them diamonds. If you win, I'll give you 20");
        System.out.println("Or if you're a real cowboy, if I win, you give me 20, but if you win, I'll give 40");
        //gets user input on which of the two option they choose, this variable is used later after winning/losing the game
        char bet=IBIO.inputChar("\nWhat do you say partner? are you a cowboy(y/n) ");
        System.out.println("\nOk, lets go\n");
        while ((yes=='y'||yes=='Y')&&i<=5)
        {   
            int card=(int)(Math.random()*11+1);
            player=player+card;
            System.out.println("You got a: "+card);
            System.out.println("Your Score: "+player);
            i++;
            if (player==21)
            {
                System.out.println("You Win!");
                if (bet=='y'||bet=='Y')
                {
                    System.out.println("Here's your 40 diamonds");
                    System.out.println("\n*Collected 40 diamonds*");
                    return(40);
                }
                else 
                {
                    System.out.println("Here's your 20 diamonds");
                    System.out.println("\n*Collected 20 diamonds*");
                    return(20);
                }
            }
            if (player>21)
            {
                System.out.println("You Lose!");
                if (bet=='y'||bet=='Y')
                {
                    System.out.println("Listen up, where's my 20?");
                    System.out.println("\n*Lost 20 diamonds*");
                    return(-20);
                }
                else 
                {
                    System.out.println("And I'll be taking my 10");
                    System.out.println("\n*Lost 10 diamonds*");
                    return(-10);
                }
            }
            yes=IBIO.inputChar("Take another card? (y/n) ");
        }
        System.out.println("\nDealer's Turn");
        time.wait(1000);
        char end='n';
        int i_deal=1;
        while((i_deal<=5)&&(end=='n'))
        {
            int card=(int)(Math.random()*11+1);
            dealer=dealer+card;
            //System.out.println("Dealer got a: "+card);
            //System.out.println("    Dealer's score: "+dealer);
            i++;
            if ((dealer>=16)&&(dealer<21))
            {
                System.out.println("Dealer ends turn\n");
                end='y';
            }
            if (dealer>21)
            {
                System.out.println("Dealer went over 21! You win!");
                if (bet=='y'||bet=='Y')
                {
                    System.out.println("Here's your 40 diamonds");
                    return(40);
                }
                else 
                {
                    System.out.println("Here's your 20 diamonds");
                    return(20);
                }
            }
        }

        System.out.println("Let's Compare\n-----------------");
        System.out.println("You had: "+player);
        System.out.println("Dealer had: "+dealer);
        if (player>dealer)
        {
            System.out.println("Looks like you won fair and square!");
            if (bet=='y'||bet=='Y')
            {
                System.out.println("Here's your 40 diamonds");
                System.out.println("\n*Collected 40 diamonds*");
                return(40);
            }
            else 
            {
                System.out.println("Here's your 20 diamonds");
                System.out.println("\n*Collected 20 diamonds*");
                return(20);
            }
        }
        else if (player<dealer)
        {
            System.out.println("Tough luck, you lose!");
            if (bet=='y'||bet=='Y')
            {
                System.out.println("Listen up, where's my 20?");
                System.out.println("\n*Lost 20 diamonds*");
                return(-20);
            }
            else 
            {
                System.out.println("And I'll be taking my 10");
                System.out.println("\n*Lost 10 diamonds*");
                return(10);
            }
        }
        else
        {
            System.out.println("Tie!");
            return 0;
        }
    }

   
}
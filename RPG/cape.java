/**
 *Location class: Cape Space - 7 methods
 * 
 * 
 * 
 * 
 */
public class cape
{
    static int cape(int point)
    {
        //ascii art
        art.capesign();
        System.out.println("Welcome to Cape Space, a land filled with spaceships and planets!");
        System.out.println("Suddenly, a spaceman greets you, ");
        //ascii art
        art.benny();
        System.out.println("\"Spaceship! Spaceship! Spaceship!\", he says");
        System.out.println("\nIt's none other than your old spaceman friend Benny!");
        System.out.println("\"Can you help me fix my spaceship spaceship spaceship, it's showing weird symbols on the screen!\"");
        System.out.println("\"I never really paid attention in math class...\"");
        time.wait(1000);
        //calling mathgame class
        int correct=mathgame();
        System.out.println("You got "+correct+" right!, here's "+(correct*5)+" diamonds for your help!");
        point+=(correct*5);
        System.out.println("\n*Collected "+(correct*5)+" Diamonds*");
        System.out.println("*You Have "+point+" Diamonds*\n");
        System.out.println("Now that the spaceship is working, everyone gets in the spaceship and heads to the next destination...");
        return point;
    }  

    static int mathgame()
    {
        //variable correct counts the amount of question answered right
        int correct=0;
        correct+=add();
        correct+=subtract();
        correct+=divide();
        correct+=multiply();
        return correct;
    }

    //finds 2 random numbers and asks user to add them
    static int add()
    {
        int num1=(int)(Math.random()*20+10);
        int num2=(int)(Math.random()*20+10);
        screen(num1,num2,'+');
        int answer=IBIO.inputInt(">> ");
        if (answer==num1+num2)
        {
            System.out.println("C O R R E C T\n");
            return 1;
        }
        else
        {
            System.out.println("I N C O R R E C T\n");
            return 0;
        }
    }

    //finds 2 random number and asks user to subtract the smaller from the larger
    static int subtract()
    {
        int num1=(int)(Math.random()*20+10);
        int num2=(int)(Math.random()*20+10);
        screen(Math.max(num1,num2),Math.min(num1,num2),'-');
        int answer=IBIO.inputInt(">> ");
        if (answer==Math.max(num1,num2)-Math.min(num1,num2))
        {
            System.out.println("C O R R E C T\n");
            return 1;
        }
        else
        {
            System.out.println("I N C O R R E C T\n");
            return 0;
        }
    }

    //finds 2 numbers that are divible by eachother and asks user to divide
    static int divide()
    {
        int num1=(int)(Math.random()*20+10);
        int num2=(int)(Math.random()*20+10);
        while (Math.max(num1,num2)%Math.min(num1,num2)!=0)
        {
            num1=(int)(Math.random()*20+10);
            num2=(int)(Math.random()*20+10);
        }
        screen(Math.max(num1,num2),Math.min(num1,num2),'/');
        int answer=IBIO.inputInt(">> ");
        if (answer==Math.max(num1,num2)/Math.min(num1,num2))
        {
            System.out.println("C O R R E C T\n");
            return 1;
        }
        else
        {
            System.out.println("I N C O R R E C T\n");
            return 0;
        }
    }

    //asks user to multiply 2 one-digit numbers
    static int multiply()
    {
        int num1=(int)(Math.random()*10);
        int num2=(int)(Math.random()*10);
        screen(num1,num2,'*');
        int answer=IBIO.inputInt(">> ");
        if (answer==num1*num2)
        {
            System.out.println("C O R R E C T\n");
            return 1;
        }
        else
        {
            System.out.println("I N C O R R E C T\n");
            return 0;
        }
    }

    static void screen(int num1, int num2, char symbol)
    {
        System.out.println(" _____________________");
        System.out.println("|  _________________  |");
        System.out.print("| |"+num1+symbol+num2+"=           ");
        if (symbol=='*')
            System.out.print("  ");
        System.out.println("| |");
        System.out.println("| |_________________| |");
        System.out.println("|  __ __ __ __ __ __  |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("| |__|__|__|__|__|__| |");
        System.out.println("|  ___ ___ ___   ___  |");
        System.out.println("| | ζ | 8 | இ |    |   ж | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | Ǿ | ऋ  |   Ξ | | ૐ |    |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | Ψ | 2 | א | | x | |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("| | . | Ω | = | | த  |   |");
        System.out.println("| |___|___|___| |___| |");
        System.out.println("|_____________________|");
    }
}
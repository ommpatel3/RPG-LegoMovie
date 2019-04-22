/** 1 method
 *
 * 
 * 
 * om patel
 */
public class time
{
    //creates a delay of (parameter) miliseconds
    //is called throughout the code, from most classes, which is why it is created as a separate class
    static void wait(int time)
    {
        try 
        {
            Thread.sleep(time);
        }
        catch (InterruptedException m) 
        {
            ;
        }
    }
}


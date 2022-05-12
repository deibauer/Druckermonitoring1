package ConsoleClient;

public class Main {
    public static void main(String[] args)
    { ConsoleClient console;
        if(args[0].equals('a'))
        {
            console = new AdminConsoleClient();
            console.run();
        }
        else
        {
            console=new ConsoleClient();
            console.run();
        }



    }
}
package ConsoleClient;

public class Main {
    public static void main(String[] args)
    { ConsoleClient console;
        if(args[0]=="a")
        {
            console = new AdminConsoleClient();
        }
        else
        {
            console=new ConsoleClient();
        }



    }
}
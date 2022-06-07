package command.practica;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<ICommand> commands = new ArrayList<>();

    public Invoker(){
        System.out.println("Prendiendo el juego.....");
    }

    public void addCommand(ICommand command){
        commands.add(command);
    }

    public void runCommands(){
        for (ICommand command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
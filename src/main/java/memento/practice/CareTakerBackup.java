package memento.practice;

import java.util.List;
import java.util.Map;

public class CareTakerBackup {
    private List<Persona> state;

    public void setBackup(List<Persona> state){
        this.state = state;
    }

    public Memento createBackup(){
        return new Memento(state);
    }

    public List<Persona> restoreBackup(Memento m){
        System.out.println("**** Restaurando ****");
        this.state = m.getState();
        return this.state;
    }
}

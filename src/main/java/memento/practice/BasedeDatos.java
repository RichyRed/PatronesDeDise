package memento.practice;

import java.util.HashMap;
import java.util.Map;

public class BasedeDatos {
    private Map<String, Memento> personas = new HashMap<>();

    public void createBackup(String alias, Memento m){
        personas.put(alias, m);
    }

    public Memento getCommit(String alias){
        return personas.get(alias);
    }
}

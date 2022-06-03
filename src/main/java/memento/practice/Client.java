package memento.practice;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args){
        BasedeDatos db = new BasedeDatos();
        CareTakerBackup b = new CareTakerBackup();

        List<Persona> lista = new ArrayList<>();
        lista.add(new Persona("Tony", "111 0", 30));
        lista.add(new Persona("Steve", "222 0", 150));
        b.setBackup(lista);
        db.createBackup("Backupenero", b.createBackup());

        List<Persona> lista2 = new ArrayList<>();
        lista2.add(new Persona("Clint", "666 0", 35));
        lista2.add(new Persona("Groot", "222 0", 100));
        b.setBackup(lista2);
        db.createBackup("Backupfebrero", b.createBackup());

        List<Persona> lista3 = new ArrayList<>();
        lista3.add(new Persona("Natasha", "999 0", 28));
        lista3.add(new Persona("Steven", "555 0", 32));
        lista3.add(new Persona("Bruce", "888 0", 50));
        b.setBackup(lista3);
        db.createBackup("Backupmarzo", b.createBackup());

        List<Persona> lista4 = new ArrayList<>();
        lista4.add(new Persona("Wanda", "777 0", 26));
        lista4.add(new Persona("Kate", "444 0", 17));
        b.setBackup(lista4);
        db.createBackup("Backupabril", b.createBackup());

        List<Persona> lista5 = new ArrayList<>();
        lista5.add(new Persona("Wong", "555 0", 40));
        lista5.add(new Persona("Thor", "777 0", 200));
        lista5.add(new Persona("Drax", "000 0", 50));
        b.setBackup(lista5);
        db.createBackup("Backupmayo", b.createBackup());

        List<Persona> listaFinal = b.restoreBackup(db.getCommit("Backupfebrero"));
        for (Persona p : listaFinal) {
            System.out.println(p.getName());
        }
    }
}
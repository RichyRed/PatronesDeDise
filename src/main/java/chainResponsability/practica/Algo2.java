package chainResponsability.practica;

import java.util.Arrays;

public class Algo2 implements IHandler {
    private IHandler next;

    @Override
    public void setNext(IHandler handler) {
        next = handler;
    }

    @Override
    public void criteriaHandler(Persona[] personas) {
        if (personas.length > 20 && personas.length <= 50){
            selectionSort(personas);
        } else {
            next.criteriaHandler(personas);
        }
    }

    private void selectionSort(Persona[] personas) {
        for (int i = 0; i < personas.length - 1; i++) {
            int  x = i;
            for (int j = i + 1; j < personas.length; j++)
                if (personas[j].getEdad() < personas[x].getEdad()){
                     x = j;
                }
            Persona temp = personas[ x];
            personas[x] = personas[i];
            personas[i] = temp;
        }
        System.out.println("Usando Algoritmo 2:");
        for (int i = 0; i < personas.length; ++i) {
            System.out.println("Nombre: " + personas[i].getNombre() +
                    ", CI: " + personas[i].getCi() +
                    ", Edad: " + personas[i].getEdad());
        }
    }

    @Override
    public IHandler next() {
        return next;
    }
}

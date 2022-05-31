package iterator.practica;

import java.util.HashMap;
import java.util.Map;

public class Client {
    public static void main(String[] args){
        ConcreteImportadora1 importadora1 = new ConcreteImportadora1();
        importadora1.add(new Auto(24000, "Toyota Supra", 5, "Deportivo"));
        importadora1.add(new Auto(30000, "Lamborghini Huracan", 5, "Carro Deportivo"));

        ConcreteImportadora2 importadora2 = new ConcreteImportadora2();
        importadora2.add(new Auto(17000, "Subaru BRZ", 5, "Deportivo"));
        importadora2.add(new Auto(12000, "Toyota 86", 5, "Auto Deportivo"));

        ConcreteImportadora3 importadora3 = new ConcreteImportadora3();
        importadora3.add(new Auto(40000, "Ford Mustang", 5, "Deportivo"));
        importadora3.add(new Auto(35000, "Aston Martin DB11", 5, "Carro Deportivo"));

        ConcreteImportadora4 importadora4 = new ConcreteImportadora4();
        importadora4.add(new Auto(13000, "Porsche 911", 5, "Deportivo"));
        importadora4.add(new Auto(65000, "Alpine A110", 5, "Auto Deportivo"));

        Iterator iterator;
        Map<String, Auto> map = new HashMap<String, Auto>();

        iterator = importadora1.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora2.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora3.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        iterator = importadora4.createIterator();
        while (iterator.hasNext()){
            Auto auto = (Auto) iterator.next();
            map.put(auto.getModelo(), auto);
        }

        System.out.println("Lista de automoviles: ");
        for (String key : map.keySet()) {
            System.out.println("- " + key);
        }
    }
}
package abstractFactory.practice;

public class Client {

    public static void main (String[]args){


        FactoryPasaje.make(PasageType.INFANTE).showInfo();
        FactoryPasaje.make(PasageType.SOLIDARIO).showInfo();
        FactoryPasaje.make(PasageType.STANDART).showInfo();


    }
}

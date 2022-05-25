package abstractFactory.practice;

public class FactoryPasaje {

    public static IPasaje make(PasageType pasageType){
        IPasaje pasaje;
        switch (pasageType){
            case SOLIDARIO:
                pasaje=new Solidario();
                break;
            case STANDART:
                pasaje=new Standart();
                break;
            case INFANTE:
                pasaje=new Infantes();
                break;
            default:
                pasaje=new Infantes();
                break;
        }

        return pasaje;

    }
}

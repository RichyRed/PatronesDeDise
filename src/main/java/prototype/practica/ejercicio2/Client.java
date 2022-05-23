package prototype.practica.ejercicio2;

public class Client {
    public static void main(String[] args) {

        Estuche estucheCel = new Estuche();
        estucheCel.setColor("rojo");
        estucheCel.setNombre("portacelulares indestructible");

        Cargador cargadorCel = new Cargador();
        cargadorCel.setNombre("cargador Samsung");

        Audifonos sinCable = new Audifonos();
        sinCable.setSinCable(true);
        sinCable.setNombre("audifonos inalambricos Samsung");

        Audifonos conCable = new Audifonos();
        conCable.setNombre("audifonos de cable Samsung");
        conCable.setSinCable(false);

        SIM sim1 = new SIM();
        sim1.setNombreEmpresa("Entel");
        sim1.setNumeroTelefono(76548895);

        SIM sim2 = new SIM();
        sim2.setNumeroTelefono(71498354);
        sim2.setNombreEmpresa("Viva");

        SIM sim3 = new SIM();
        sim3.setNombreEmpresa("Tigo");
        sim3.setNumeroTelefono(68714297);

        Celular template = new Celular();
        template.setTamaño(18.5);
        template.setCpu("Octacore Qualcom");
        template.setMemory(128);
        template.setVersionAndroid(7.5);
        template.setCamara(17.9);
        template.setBluetooth(10);
        template.setCantidadDeMemoriasExternas(2);
        template.setTipoBateria("Litio de 2800mAh");

        Celular cellphone1 = (Celular) template.clone();
        cellphone1.setSim(sim1);
        cellphone1.setAudifonos(conCable);
        cellphone1.setCargador(cargadorCel);

        Celular cellphone2 = (Celular) template.clone();
        cellphone2.setSim(sim2);
        cellphone2.setAudifonos(conCable);
        cellphone2.setEstucheCel(estucheCel);

        Celular cellphone3 = (Celular) template.clone();
        cellphone3.setSim(sim3);
        cellphone3.setEstucheCel(estucheCel);
        cellphone3.setCargador(cargadorCel);

        cellphone1.showCellphoneInfo();
        cellphone2.showCellphoneInfo();
        cellphone3.showCellphoneInfo();

    }
}

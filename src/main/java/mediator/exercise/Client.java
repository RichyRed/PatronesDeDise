package mediator.exercise;

public class Client {
    public static void main(String[] args){
        Skype skypeEmpresa = new Skype();

        SM sm1 = new SM(skypeEmpresa);
        sm1.setCargo("SM");
        sm1.setName("Tony Stark");
        sm1.setCi("111 111");
        sm1.setCertificaciones("Project Management Professional");

        SM sm2 = new SM(skypeEmpresa);
        sm2.setCargo("SM");
        sm2.setName("Bruce Banner");
        sm2.setCi("222 222");
        sm2.setCertificaciones("Cisco");

        SM sm3 = new SM(skypeEmpresa);
        sm3.setCargo("SM");
        sm3.setName("Nick Fury");
        sm3.setCi("333 333");
        sm3.setCertificaciones("Miscorsoft Certified");



        DEV dev1 = new DEV(skypeEmpresa);
        dev1.setCargo("DEV");
        dev1.setName("Clint Barton");
        dev1.setCi("444 444");
        dev1.setLenguaje("Phyton");

        DEV dev2 = new DEV(skypeEmpresa);
        dev2.setCargo("DEV");
        dev2.setName("Natasha Romanoff");
        dev2.setCi("555 555");
        dev2.setLenguaje("C++");

        DEV dev3 = new DEV(skypeEmpresa);
        dev3.setCargo("DEV");
        dev3.setName("Kate Bishop");
        dev3.setCi("666 666");
        dev3.setLenguaje("JavaScript");



        QA qa1 = new QA(skypeEmpresa);
        qa1.setCargo("QA");
        qa1.setName("Steven Strange");
        qa1.setCi("777 777");
        qa1.setGrado("Analista");

        QA qa2 = new QA(skypeEmpresa);
        qa2.setCargo("QA");
        qa2.setName("Wanda Maximoff");
        qa2.setCi("888 888");
        qa2.setGrado("Tester");

        QA qa3 = new QA(skypeEmpresa);
        qa3.setCargo("QA");
        qa3.setName("Steve Rogers");
        qa3.setCi("999 999");
        qa3.setGrado("Soldier");

        skypeEmpresa.addToChat(sm1);
        skypeEmpresa.addToChat(sm2);
        skypeEmpresa.addToChat(sm3);
        skypeEmpresa.addToChat(dev1);
        skypeEmpresa.addToChat(dev2);
        skypeEmpresa.addToChat(dev3);
        skypeEmpresa.addToChat(qa1);
        skypeEmpresa.addToChat(qa2);
        skypeEmpresa.addToChat(qa3);

        sm1.send("Mensaje para todos");
        dev2.send("Mensaje para los DEV");
        qa1.send("Mensaje para los QA");
    }
}
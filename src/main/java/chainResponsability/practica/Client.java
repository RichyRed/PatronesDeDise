package chainResponsability.practica;

public class Client {
    public static void main(String[] args){
        Persona p1 = new Persona("111", "Jeff", 15);
        Persona p2 = new Persona("222", "Edge", 12);
        Persona p3 = new Persona("333", "Crhistian", 19);
        Persona p4 = new Persona("444", "Matt", 71);
        Persona p5 = new Persona("555", "Jhon", 20);
        Persona p6 = new Persona("666", "Cody", 53);
        Persona p7 = new Persona("777", "Seht", 60);
        Persona p8 = new Persona("888", "Dean", 7);
        Persona p9 = new Persona("999", "Roman", 31);
        Persona p10 = new Persona("111 0", "Randy", 3);
        Persona p11 = new Persona("111 1", "Sting", 13);
        Persona p12 = new Persona("111 2", "Carlitos", 23);
        Persona p13 = new Persona("111 3", "Rey", 28);
        Persona p14 = new Persona("111 4", "Taker", 5);
        Persona p15 = new Persona("111 5", "Batista", 45);
        Persona p16 = new Persona("111 6", "Eddie", 43);
        Persona p17 = new Persona("111 7", "Dolph", 16);
        Persona p18 = new Persona("111 8", "Shawn", 82);
        Persona p19 = new Persona("111 9", "Nakamura", 27);
        Persona p20 = new Persona("222 0", "Samy", 32);
        Persona p21 = new Persona("222 1", "Kevin", 63);
        Persona p22 = new Persona("222 2", "Finn", 8);
        Persona p23 = new Persona("222 3", "AJ", 51);
        Persona p24 = new Persona("222 4", "MVP", 59);
        Persona p25 = new Persona("222 5", "Bobby", 30);
        Persona p26 = new Persona("222 6", "Chris", 4);
        Persona p27 = new Persona("222 7", "Vince", 30);
        Persona p28 = new Persona("222 8", "Punk", 50);
        Persona p29 = new Persona("222 9", "Brock", 60);
        Persona p30 = new Persona("333 0", "Golberg", 3);
        Persona p31 = new Persona("333 1", "Hulk", 65);
        Persona p32 = new Persona("333 2", "Ryback", 33);
        Persona p33 = new Persona("333 3", "Mark", 41);
        Persona p34 = new Persona("333 4", "Dusty", 81);
        Persona p35 = new Persona("333 5", "Jimmy", 18);
        Persona p36 = new Persona("333 6", "Jay", 77);
        Persona p37 = new Persona("333 7", "Koffy", 72);
        Persona p38 = new Persona("333 8", "Daniel", 19);
        Persona p39 = new Persona("333 9", "Sheamus", 37);
        Persona p40 = new Persona("444 0", "Rock", 69);
        Persona p41 = new Persona("444 1", "Shane", 23);
        Persona p42 = new Persona("444 2", "Drew", 46);
        Persona p43 = new Persona("444 3", "Kane", 21);
        Persona p44 = new Persona("444 4", "Adam", 14);
        Persona p45 = new Persona("444 5", "Andrade", 47);
        Persona p46 = new Persona("444 6", "Ricochet", 15);
        Persona p47 = new Persona("444 7", "Titus", 38);
        Persona p48 = new Persona("444 8", "Ric", 40);
        Persona p49 = new Persona("444 9", "Stone Cold", 63);
        Persona p50 = new Persona("555 0", "Mike", 16);
        Persona p51 = new Persona("555 1", "Misterio", 66);

        Persona[] personas = {
                p1, p2, p3, p4, p5, p6, p7, p8, p9, p10,
                p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
                p21, p22, p23, p24, p25, p26, p27, p28, p29, p30,
                p31, p32, p33, p34, p35, p36, p37, p38, p39, p40,
                p41, p42, p43, p44, p45, p46, p47, p48, p49, p50, p51
        };

        ManagerHandler managerHandler = new ManagerHandler();
        managerHandler.criteriaHandler(personas);
    }
}

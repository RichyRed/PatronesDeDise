package observer.practice;

public class Client {
    public static void main(String[] args) {
        CanalTelefonia canalTelefonia=new CanalTelefonia();
        canalTelefonia.attach(new UserTelefonia("Premios y Promos",new Persona("111111","Tony")));
        canalTelefonia.attach(new UserTelefonia("Noticia",new Persona("2222222","Steve")));
        canalTelefonia.attach(new UserTelefonia("todos",new Persona("3333333","Clint")));

        canalTelefonia.noti(new Notificaciones("666",
                "Precios suculentos y 2x1",
                "Autos idoooos",
                "Hoy hay futbol (clima calido)",
                "todos"));
    }
}

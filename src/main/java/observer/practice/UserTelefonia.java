package observer.practice;

public class UserTelefonia implements IUser{
    String elementos;
    Persona persona;

    public UserTelefonia(String notificacion, Persona persona) {
        this.elementos = notificacion;
        this.persona = persona;
    }

    @Override
    public void update(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: "+msg+" *****");
        System.out.println("Persona: "+persona.getName());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.showInfo();
    }

    @Override
    public void update2(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: "+msg+" *****");
        System.out.println("Persona: "+persona.getName());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.showInfo2();
    }

    @Override
    public void update3(String msg, Notificaciones newNotificaciones) {
        System.out.println("***** Notificaciones: "+msg+" *****");
        System.out.println("Persona: "+persona.getName());
        System.out.println("Preferencia: "+ elementos);
        newNotificaciones.showInfo3();
    }

    @Override
    public String getPreferenciaNotificaciones() {
        return elementos;
    }

    public Persona getPersona() {
        return persona;
    }
}

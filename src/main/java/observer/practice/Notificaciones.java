package observer.practice;

public class Notificaciones {
    private String preciosLlamada;
    private String promociones;
    private String premios;
    private String noticia;
    private String elementos;

    public Notificaciones(String preciosLlamada, String promociones, String premios, String noticia, String elementos) {
        this.preciosLlamada = preciosLlamada;
        this.promociones = promociones;
        this.premios = premios;
        this.noticia = noticia;
        this.elementos = elementos;
    }

    public String getElementos() {
        return elementos;
    }

    public void setElementos(String elementos) {
        this.elementos = elementos;
    }

    public String getPreciosLlamada() {
        return preciosLlamada;
    }

    public void setPreciosLlamada(String preciosLlamada) {
        this.preciosLlamada = preciosLlamada;
    }

    public String getPremios() {
        return premios;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }
    public void showInfo(){
        System.out.println("***** Tiene una notificacion shiuuu *****");
        System.out.println("Precios llamadas: "+preciosLlamada);
        System.out.println("Promociones: "+promociones);
        System.out.println("Premios: "+premios);
        System.out.println("Noticia: "+noticia);
        System.out.println();
    }
    public void showInfo2(){
        System.out.println("***** Tiene una notificacion shiuuu *****");
        System.out.println("Promociones: "+promociones);
        System.out.println("Premios: "+premios);
        System.out.println();
    }
    public void showInfo3(){
        System.out.println("***** Tiene una notificacion shiuuu *****");
        System.out.println("Noticia: "+noticia);
        System.out.println();
    }
}
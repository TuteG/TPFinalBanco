package trabajofinal;

public class Persona {

    String cuilcli;
    String nombrecli;
    String telcli;
    String mailcli;
    String tseg;
    String dominio;
    String modelo;
    String marca;
    String confra;
    String ana;
    String box1;
    String box2;
    String box3;
    String box4;
    String box5;
    String incendio;
    String robo;
    String inundacion;
    String cobertura1;
    String cobertura2;
    String cobertura3;
    

    public Persona(String cuilcli, String nombrecli, String telcli, String mailcli, String tseg, String dominio, String modelo, String marca, String confra, String ana, String box1, String box2, String box3, String box4, String box5) {
        this.cuilcli = cuilcli;
        this.nombrecli = nombrecli;
        this.telcli = telcli;
        this.mailcli = mailcli;
        this.tseg = tseg;
        this.dominio = dominio;
        this.modelo = modelo;
        this.marca = marca;
        this.confra = confra;
        this.ana = ana;
        this.box1 = box1;
        this.box2 = box2;
        this.box3 = box3;
        this.box4 = box4;
        this.box5 = box5;
    }

    public Persona(String cuilcli, String nombrecli, String telcli, String mailcli, String tseg) {
        this.cuilcli = cuilcli;
        this.nombrecli = nombrecli;
        this.telcli = telcli;
        this.mailcli = mailcli;
        this.tseg = tseg;
    }

  
    
    public Persona(String cuilcli, String nombrecli, String telcli, String mailcli, String tseg, String incendio, String robo, String inundacion, String cobertura1, String cobertura2, String cobertura3) {
        this.cuilcli = cuilcli;
        this.nombrecli = nombrecli;
        this.telcli = telcli;
        this.mailcli = mailcli;
        this.tseg = tseg;
        this.incendio = incendio;
        this.robo = robo;
        this.inundacion = inundacion;
        this.cobertura1 = cobertura1;
        this.cobertura2 = cobertura2;
        this.cobertura3 = cobertura3;
    }

    public String getIncendio() {
        return incendio;
    }

    public String getRobo() {
        return robo;
    }

    public String getInundacion() {
        return inundacion;
    }

    public String getCobertura1() {
        return cobertura1;
    }

    public String getCobertura2() {
        return cobertura2;
    }

    public String getCobertura3() {
        return cobertura3;
    }

    
    

    public String getCuilcli() {
        return cuilcli;
    }

    public String getNombrecli() {
        return nombrecli;
    }

    public String getTelcli() {
        return telcli;
    }

    public String getMailcli() {
        return mailcli;
    }

    public String getTseg() {
        return tseg;
    }

    public String getDominio() {
        return dominio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getConfra() {
        return confra;
    }

    public String getAna() {
        return ana;
    }

    public String getBox1() {
        return box1;
    }

    public String getBox2() {
        return box2;
    }

    public String getBox3() {
        return box3;
    }

    public String getBox4() {
        return box4;
    }

    public String getBox5() {
        return box5;
    }

    



    String cuilcli() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
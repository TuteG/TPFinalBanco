package trabajofinal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class ArchivoProductos {

    File archivo;
    Seguros s = new Seguros();

    public void crearArchivo() {
        try {
            
            archivo = new File("Producto.txt");
            if (archivo.createNewFile()) {
                JOptionPane.showMessageDialog(null, "El archivo fue creado con exito");
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void escribirEnarchivo(Persona persona) {
        Seguros s = new Seguros();

        try {
            FileWriter escribir = new FileWriter(archivo, true);

            switch (persona.getTseg()) {
                case "Seguros Vehiculo":
                    escribir.write(persona.getTseg() + ";" + persona.getCuilcli() + ";" + persona.getNombrecli() + ";" + persona.getTelcli() + ";" + persona.getMailcli() + ";" + persona.getDominio() + ";" + persona.getMarca() + ";" + persona.getModelo() + ";" + persona.getConfra() + ";" + persona.getAna() + ";" + persona.getBox1() + ";" + persona.getBox2() + ";" + persona.getBox3() + ";" + persona.getBox4() + ";" + persona.getBox5() + "\r\n");
                    break;
                case "Seguros Hogar":
                    escribir.write(persona.getTseg() + ";" + persona.getCuilcli() + ";" + persona.getNombrecli() + ";" + persona.getTelcli() + ";" + persona.getMailcli() + ";" + persona.getIncendio() + ";" + persona.getInundacion() + ";" + persona.getRobo() + ";" + persona.getCobertura1() + ";" + persona.getCobertura2() + ";" + persona.getCobertura3() + "\r\n");
                    break;
                case "Seguros Vida":
                    escribir.write(persona.getTseg() + ";" + persona.getCuilcli() + ";" + persona.getNombrecli() + ";" + persona.getTelcli() + ";" + persona.getMailcli() + "\r\n");
                    break;

            }
            escribir.close();

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}

package ejercicioextra3guia11.Entidades;

/**
 *
 * @author mauro
 */
public class Cliente {
    private String Nombre;
    private String Apellido;
    private String Documento;
    private String Mail;
    private String Domicilio;
    private String Telefono;

    public Cliente() {
    }

    public Cliente(String Nombre, String Apellido, String Documento, String Mail, String Domicilio, String Telefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
        this.Mail = Mail;
        this.Domicilio = Domicilio;
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nombre=" + Nombre + ", Apellido=" + Apellido + ", Documento=" + Documento + ", Mail=" + Mail + ", Domicilio=" + Domicilio + ", Telefono=" + Telefono + '}';
    }
    
    
}

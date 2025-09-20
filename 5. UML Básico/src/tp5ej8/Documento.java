
package tp5ej8;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; //Composicion

    //Constructor
    public Documento(String titulo, String contenido, String codigoHash, String fechaFirma, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fechaFirma, usuario); //Composicion
    }

    @Override
    public String toString() {
        return "Documento titulo:" + titulo + ", contenido:" + contenido + ", firmadigital: " + firmaDigital;
    }
}

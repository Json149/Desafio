package sv.edu.udb.desafio.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "discos")
public class DiscosModel {


    public DiscosModel() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String nombre_disco;
    private String id_artista;
    private String id_disco;
    private Integer numero_canciones;
    private double precio;

    public DiscosModel(String nombre_disco, String id_artista, String id_disco, Integer numero_canciones, double precio) {
        this.nombre_disco = nombre_disco;
        this.id_artista = id_artista;
        this.id_disco = id_disco;
        this.numero_canciones = numero_canciones;
        this.precio = precio;
    }

    public String getNombre_disco() {
        return nombre_disco;
    }

    public void setNombre_disco(String nombre_disco) {
        this.nombre_disco = nombre_disco;
    }

    public String getId_artista() {
        return id_artista;
    }

    public void setId_artista(String id_artista) {
        this.id_artista = id_artista;
    }

    public String getId_disco() {
        return id_disco;
    }

    public void setId_disco(String id_disco) {
        this.id_disco = id_disco;
    }

    public Integer getNumero_canciones() {
        return numero_canciones;
    }

    public void setNumero_canciones(Integer numero_canciones) {
        this.numero_canciones = numero_canciones;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

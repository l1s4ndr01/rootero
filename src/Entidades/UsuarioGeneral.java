package Entidades;
// Generated 15/10/2018 18:54:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 *UsuarioGenerall generated by hbm2java
 */
public class UsuarioGeneral  implements java.io.Serializable {


     private String username;
     private String password;
     private String apellido;
     private String nombre;
     private String email;
     private Byte activo;
     private Set copialicencias = new HashSet(0);
     private Set modificaciontitulars = new HashSet(0);
     private Set titulars = new HashSet(0);
     private Set comprobantepagos = new HashSet(0);
     private Set licencias = new HashSet(0);
     private Administrador administrador;
     private Usuario usuario;

    public UsuarioGeneral() {
    }

	
    public UsuarioGeneral(String username, String password, String apellido, String nombre, String email) {
        this.username = username;
        this.password = password;
        this.apellido = apellido;
        this.nombre = nombre;
        this.email = email;
    }
    public UsuarioGeneral(String username, String password, String apellido, String nombre, String email, Byte activo, Set copialicencias, Set modificaciontitulars, Set titulars, Set comprobantepagos, Set licencias, Administrador administrador, Usuario usuario) {
       this.username = username;
       this.password = password;
       this.apellido = apellido;
       this.nombre = nombre;
       this.email = email;
       this.activo = activo;
       this.copialicencias = copialicencias;
       this.modificaciontitulars = modificaciontitulars;
       this.titulars = titulars;
       this.comprobantepagos = comprobantepagos;
       this.licencias = licencias;
       this.administrador = administrador;
       this.usuario = usuario;
    }
   
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Byte getActivo() {
        return this.activo;
    }
    
    public void setActivo(Byte activo) {
        this.activo = activo;
    }
    public Set getCopialicencias() {
        return this.copialicencias;
    }
    
    public void setCopialicencias(Set copialicencias) {
        this.copialicencias = copialicencias;
    }
    public Set getModificaciontitulars() {
        return this.modificaciontitulars;
    }
    
    public void setModificaciontitulars(Set modificaciontitulars) {
        this.modificaciontitulars = modificaciontitulars;
    }
    public Set getTitulars() {
        return this.titulars;
    }
    
    public void setTitulars(Set titulars) {
        this.titulars = titulars;
    }
    public Set getComprobantepagos() {
        return this.comprobantepagos;
    }
    
    public void setComprobantepagos(Set comprobantepagos) {
        this.comprobantepagos = comprobantepagos;
    }
    public Set getLicencias() {
        return this.licencias;
    }
    
    public void setLicencias(Set licencias) {
        this.licencias = licencias;
    }
    public Administrador getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


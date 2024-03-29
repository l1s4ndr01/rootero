package Entidades;
// Generated 15/10/2018 18:54:52 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private String usuariogeneralUsername;
     private Administrador administrador;
     private UsuarioGeneral usuariogeneral;
     private Date fechacreacion;
     private Set modificacionbajausuarios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(Administrador administrador,UsuarioGeneral usuariogeneral, Date fechacreacion) {
        this.administrador = administrador;
        this.usuariogeneral = usuariogeneral;
        this.fechacreacion = fechacreacion;
    }
    public Usuario(Administrador administrador,UsuarioGeneral usuariogeneral, Date fechacreacion, Set modificacionbajausuarios) {
       this.administrador = administrador;
       this.usuariogeneral = usuariogeneral;
       this.fechacreacion = fechacreacion;
       this.modificacionbajausuarios = modificacionbajausuarios;
    }
   
    public String getUsuariogeneralUsername() {
        return this.usuariogeneralUsername;
    }
    
    public void setUsuariogeneralUsername(String usuariogeneralUsername) {
        this.usuariogeneralUsername = usuariogeneralUsername;
    }
    public Administrador getAdministrador() {
        return this.administrador;
    }
    
    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    public UsuarioGeneral getUsuariogeneral() {
        return this.usuariogeneral;
    }
    
    public void setUsuariogeneral (UsuarioGeneral usuariogeneral) {
        this.usuariogeneral = usuariogeneral;
    }
    public Date getFechacreacion() {
        return this.fechacreacion;
    }
    
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    public Set getModificacionbajausuarios() {
        return this.modificacionbajausuarios;
    }
    
    public void setModificacionbajausuarios(Set modificacionbajausuarios) {
        this.modificacionbajausuarios = modificacionbajausuarios;
    }




}



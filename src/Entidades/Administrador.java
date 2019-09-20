package Entidades;
// Generated 15/10/2018 18:54:52 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Administrador generated by hbm2java
 */
public class Administrador  implements java.io.Serializable {


     private String usuariogeneralUsername;
     private UsuarioGeneral usuariogeneral;
     private Set modificacionbajausuarios = new HashSet(0);
     private Set usuarios = new HashSet(0);

    public Administrador() {
    }

	
    public Administrador (UsuarioGeneral usuariogeneral) {
        this.usuariogeneral = usuariogeneral;
    }
    public Administrador (UsuarioGeneral usuariogeneral, Set modificacionbajausuarios, Set usuarios) {
       this.usuariogeneral = usuariogeneral;
       this.modificacionbajausuarios = modificacionbajausuarios;
       this.usuarios = usuarios;
    }
   
    public String getUsuariogeneralUsername() {
        return this.usuariogeneralUsername;
    }
    
    public void setUsuariogeneralUsername(String usuariogeneralUsername) {
        this.usuariogeneralUsername = usuariogeneralUsername;
    }
    public UsuarioGeneral getUsuariogeneral() {
        return this.usuariogeneral;
    }
    
    public void setUsuariogeneral (UsuarioGeneral usuariogeneral) {
        this.usuariogeneral = usuariogeneral;
    }
    public Set getModificacionbajausuarios() {
        return this.modificacionbajausuarios;
    }
    
    public void setModificacionbajausuarios(Set modificacionbajausuarios) {
        this.modificacionbajausuarios = modificacionbajausuarios;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}



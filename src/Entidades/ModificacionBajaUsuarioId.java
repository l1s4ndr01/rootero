package Entidades;
// Generated 15/10/2018 18:54:52 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 *ModificacionBajaUsuarioIdd generated by hbm2java
 */
public class ModificacionBajaUsuarioId  implements java.io.Serializable {


     private String usermodificado;
     private String adminmodificacion;
     private Date fechahoramodificacion;

    public ModificacionBajaUsuarioId() {
    }

    public ModificacionBajaUsuarioId(String usermodificado, String adminmodificacion, Date fechahoramodificacion) {
       this.usermodificado = usermodificado;
       this.adminmodificacion = adminmodificacion;
       this.fechahoramodificacion = fechahoramodificacion;
    }
   
    public String getUsermodificado() {
        return this.usermodificado;
    }
    
    public void setUsermodificado(String usermodificado) {
        this.usermodificado = usermodificado;
    }
    public String getAdminmodificacion() {
        return this.adminmodificacion;
    }
    
    public void setAdminmodificacion(String adminmodificacion) {
        this.adminmodificacion = adminmodificacion;
    }
    public Date getFechahoramodificacion() {
        return this.fechahoramodificacion;
    }
    
    public void setFechahoramodificacion(Date fechahoramodificacion) {
        this.fechahoramodificacion = fechahoramodificacion;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ModificacionBajaUsuarioId) ) return false;
		ModificacionBajaUsuarioId castOther = (ModificacionBajaUsuarioId ) other; 
         
		 return ( (this.getUsermodificado()==castOther.getUsermodificado()) || ( this.getUsermodificado()!=null && castOther.getUsermodificado()!=null && this.getUsermodificado().equals(castOther.getUsermodificado()) ) )
 && ( (this.getAdminmodificacion()==castOther.getAdminmodificacion()) || ( this.getAdminmodificacion()!=null && castOther.getAdminmodificacion()!=null && this.getAdminmodificacion().equals(castOther.getAdminmodificacion()) ) )
 && ( (this.getFechahoramodificacion()==castOther.getFechahoramodificacion()) || ( this.getFechahoramodificacion()!=null && castOther.getFechahoramodificacion()!=null && this.getFechahoramodificacion().equals(castOther.getFechahoramodificacion()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getUsermodificado() == null ? 0 : this.getUsermodificado().hashCode() );
         result = 37 * result + ( getAdminmodificacion() == null ? 0 : this.getAdminmodificacion().hashCode() );
         result = 37 * result + ( getFechahoramodificacion() == null ? 0 : this.getFechahoramodificacion().hashCode() );
         return result;
   }   


}



package mapeo;
// Generated 22/08/2014 02:20:23 PM by Hibernate Tools 3.6.0



/**
 * UsuTrammov generated by hbm2java
 */
public class UsuTrammov  implements java.io.Serializable {


     private UsuTrammovId id;
     private TramiteMovimiento tramiteMovimiento;
     private Usuario usuario;

    public UsuTrammov() {
    }

	
    public UsuTrammov(UsuTrammovId id) {
        this.id = id;
    }
    public UsuTrammov(UsuTrammovId id, TramiteMovimiento tramiteMovimiento, Usuario usuario) {
       this.id = id;
       this.tramiteMovimiento = tramiteMovimiento;
       this.usuario = usuario;
    }
   
    public UsuTrammovId getId() {
        return this.id;
    }
    
    public void setId(UsuTrammovId id) {
        this.id = id;
    }
    public TramiteMovimiento getTramiteMovimiento() {
        return this.tramiteMovimiento;
    }
    
    public void setTramiteMovimiento(TramiteMovimiento tramiteMovimiento) {
        this.tramiteMovimiento = tramiteMovimiento;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


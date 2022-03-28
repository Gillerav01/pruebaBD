// Generated with g9.

package es.prueba.spring.main.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Version;

@Entity(name="usuarios")
public class Usuarios implements Serializable {

    /** Primary key. */
    protected static final String PK = "idUsuario";

    /**
     * The optimistic lock. Available via standard bean get/set operations.
     */
    @Version
    @Column(name="LOCK_FLAG")
    private Integer lockFlag;

    /**
     * Access method for the lockFlag property.
     *
     * @return the current value of the lockFlag property
     */
    public Integer getLockFlag() {
        return lockFlag;
    }

    /**
     * Sets the value of the lockFlag property.
     *
     * @param aLockFlag the new value of the lockFlag property
     */
    public void setLockFlag(Integer aLockFlag) {
        lockFlag = aLockFlag;
    }

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_usuario", unique=true, nullable=false, precision=10)
    private int idUsuario;
    @Column(name="nombre_usuario", nullable=false, length=30)
    private String nombreUsuario;
    @Column(name="apellidos_usuario", nullable=false, length=40)
    private String apellidosUsuario;
    @Column(name="dni_usuario", nullable=false, length=9)
    private String dniUsuario;
    @Column(name="email_usuario", nullable=false, length=50)
    private String emailUsuario;
    @Column(name="psswrd_usuario", nullable=false, length=50)
    private String psswrdUsuario;
    @OneToMany(mappedBy="usuarios")
    private Set<UsuarioProducto> usuarioProducto;
    @OneToMany(mappedBy="usuarios")
    private Set<RolUsuario> rolUsuario;

    /** Default constructor. */
    public Usuarios() {
        super();
    }

    /**
     * Access method for idUsuario.
     *
     * @return the current value of idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * Setter method for idUsuario.
     *
     * @param aIdUsuario the new value for idUsuario
     */
    public void setIdUsuario(int aIdUsuario) {
        idUsuario = aIdUsuario;
    }

    /**
     * Access method for nombreUsuario.
     *
     * @return the current value of nombreUsuario
     */
    public String getNombreUsuario() {
        return nombreUsuario;
    }

    /**
     * Setter method for nombreUsuario.
     *
     * @param aNombreUsuario the new value for nombreUsuario
     */
    public void setNombreUsuario(String aNombreUsuario) {
        nombreUsuario = aNombreUsuario;
    }

    /**
     * Access method for apellidosUsuario.
     *
     * @return the current value of apellidosUsuario
     */
    public String getApellidosUsuario() {
        return apellidosUsuario;
    }

    /**
     * Setter method for apellidosUsuario.
     *
     * @param aApellidosUsuario the new value for apellidosUsuario
     */
    public void setApellidosUsuario(String aApellidosUsuario) {
        apellidosUsuario = aApellidosUsuario;
    }

    /**
     * Access method for dniUsuario.
     *
     * @return the current value of dniUsuario
     */
    public String getDniUsuario() {
        return dniUsuario;
    }

    /**
     * Setter method for dniUsuario.
     *
     * @param aDniUsuario the new value for dniUsuario
     */
    public void setDniUsuario(String aDniUsuario) {
        dniUsuario = aDniUsuario;
    }

    /**
     * Access method for emailUsuario.
     *
     * @return the current value of emailUsuario
     */
    public String getEmailUsuario() {
        return emailUsuario;
    }

    /**
     * Setter method for emailUsuario.
     *
     * @param aEmailUsuario the new value for emailUsuario
     */
    public void setEmailUsuario(String aEmailUsuario) {
        emailUsuario = aEmailUsuario;
    }

    /**
     * Access method for psswrdUsuario.
     *
     * @return the current value of psswrdUsuario
     */
    public String getPsswrdUsuario() {
        return psswrdUsuario;
    }

    /**
     * Setter method for psswrdUsuario.
     *
     * @param aPsswrdUsuario the new value for psswrdUsuario
     */
    public void setPsswrdUsuario(String aPsswrdUsuario) {
        psswrdUsuario = aPsswrdUsuario;
    }

    /**
     * Access method for usuarioProducto.
     *
     * @return the current value of usuarioProducto
     */
    public Set<UsuarioProducto> getUsuarioProducto() {
        return usuarioProducto;
    }

    /**
     * Setter method for usuarioProducto.
     *
     * @param aUsuarioProducto the new value for usuarioProducto
     */
    public void setUsuarioProducto(Set<UsuarioProducto> aUsuarioProducto) {
        usuarioProducto = aUsuarioProducto;
    }

    /**
     * Access method for rolUsuario.
     *
     * @return the current value of rolUsuario
     */
    public Set<RolUsuario> getRolUsuario() {
        return rolUsuario;
    }

    /**
     * Setter method for rolUsuario.
     *
     * @param aRolUsuario the new value for rolUsuario
     */
    public void setRolUsuario(Set<RolUsuario> aRolUsuario) {
        rolUsuario = aRolUsuario;
    }

    /**
     * Compares the key for this instance with another Usuarios.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Usuarios and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Usuarios)) {
            return false;
        }
        Usuarios that = (Usuarios) other;
        if (this.getIdUsuario() != that.getIdUsuario()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Usuarios.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Usuarios)) return false;
        return this.equalKeys(other) && ((Usuarios)other).equalKeys(this);
    }

    /**
     * Returns a hash code for this instance.
     *
     * @return Hash code
     */
    @Override
    public int hashCode() {
        int i;
        int result = 17;
        i = getIdUsuario();
        result = 37*result + i;
        return result;
    }

    /**
     * Returns a debug-friendly String representation of this instance.
     *
     * @return String representation of this instance
     */
    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("[Usuarios |");
        sb.append(" idUsuario=").append(getIdUsuario());
        sb.append("]");
        return sb.toString();
    }

    /**
     * Return all elements of the primary key.
     *
     * @return Map of key names to values
     */
    public Map<String, Object> getPrimaryKey() {
        Map<String, Object> ret = new LinkedHashMap<String, Object>(6);
        ret.put("idUsuario", Integer.valueOf(getIdUsuario()));
        return ret;
    }

}

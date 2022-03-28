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

@Entity(name="roles")
public class Roles implements Serializable {

    /** Primary key. */
    protected static final String PK = "idRol";

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
    @Column(name="id_rol", unique=true, nullable=false, precision=10)
    private int idRol;
    @Column(name="nombre_rol", nullable=false, length=30)
    private String nombreRol;
    @OneToMany(mappedBy="roles")
    private Set<RolUsuario> rolUsuario;

    /** Default constructor. */
    public Roles() {
        super();
    }

    /**
     * Access method for idRol.
     *
     * @return the current value of idRol
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Setter method for idRol.
     *
     * @param aIdRol the new value for idRol
     */
    public void setIdRol(int aIdRol) {
        idRol = aIdRol;
    }

    /**
     * Access method for nombreRol.
     *
     * @return the current value of nombreRol
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * Setter method for nombreRol.
     *
     * @param aNombreRol the new value for nombreRol
     */
    public void setNombreRol(String aNombreRol) {
        nombreRol = aNombreRol;
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
     * Compares the key for this instance with another Roles.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Roles and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Roles)) {
            return false;
        }
        Roles that = (Roles) other;
        if (this.getIdRol() != that.getIdRol()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Roles.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Roles)) return false;
        return this.equalKeys(other) && ((Roles)other).equalKeys(this);
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
        i = getIdRol();
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
        StringBuffer sb = new StringBuffer("[Roles |");
        sb.append(" idRol=").append(getIdRol());
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
        ret.put("idRol", Integer.valueOf(getIdRol()));
        return ret;
    }

}

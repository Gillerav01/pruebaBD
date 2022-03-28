// Generated with g9.

package es.prueba.spring.main.modelo;

import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Version;

@Entity(name="rol_usuario")
@IdClass(RolUsuario.RolUsuarioId.class)
public class RolUsuario implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class RolUsuarioId implements Serializable {
        Usuarios usuarios;
        Roles roles;
    }

    /** Primary key. */
    protected static final String PK = "RolUsuarioPrimary";

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

    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="id_rol", nullable=false)
    private Roles roles;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="id_usuario", nullable=false)
    private Usuarios usuarios;

    /** Default constructor. */
    public RolUsuario() {
        super();
    }

    /**
     * Access method for roles.
     *
     * @return the current value of roles
     */
    public Roles getRoles() {
        return roles;
    }

    /**
     * Setter method for roles.
     *
     * @param aRoles the new value for roles
     */
    public void setRoles(Roles aRoles) {
        roles = aRoles;
    }

    /**
     * Access method for usuarios.
     *
     * @return the current value of usuarios
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     * Setter method for usuarios.
     *
     * @param aUsuarios the new value for usuarios
     */
    public void setUsuarios(Usuarios aUsuarios) {
        usuarios = aUsuarios;
    }

    /** Temporary value holder for group key fragment usuariosIdUsuario */
    private transient int tempUsuariosIdUsuario;

    /**
     * Gets the key fragment idUsuario for member usuarios.
     * If this.usuarios is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setUsuariosIdUsuario.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Usuarios
     */
    public int getUsuariosIdUsuario() {
        return (getUsuarios() == null ? tempUsuariosIdUsuario : getUsuarios().getIdUsuario());
    }

    /**
     * Sets the key fragment idUsuario from member usuarios.
     * If this.usuarios is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getUsuariosIdUsuario.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdUsuario New value for the key fragment
     * @see Usuarios
     */
    public void setUsuariosIdUsuario(int aIdUsuario) {
        if (getUsuarios() == null) {
            tempUsuariosIdUsuario = aIdUsuario;
        } else {
            getUsuarios().setIdUsuario(aIdUsuario);
        }
    }

    /** Temporary value holder for group key fragment rolesIdRol */
    private transient int tempRolesIdRol;

    /**
     * Gets the key fragment idRol for member roles.
     * If this.roles is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setRolesIdRol.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Roles
     */
    public int getRolesIdRol() {
        return (getRoles() == null ? tempRolesIdRol : getRoles().getIdRol());
    }

    /**
     * Sets the key fragment idRol from member roles.
     * If this.roles is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getRolesIdRol.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdRol New value for the key fragment
     * @see Roles
     */
    public void setRolesIdRol(int aIdRol) {
        if (getRoles() == null) {
            tempRolesIdRol = aIdRol;
        } else {
            getRoles().setIdRol(aIdRol);
        }
    }

    /**
     * Compares the key for this instance with another RolUsuario.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class RolUsuario and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof RolUsuario)) {
            return false;
        }
        RolUsuario that = (RolUsuario) other;
        if (this.getUsuariosIdUsuario() != that.getUsuariosIdUsuario()) {
            return false;
        }
        if (this.getRolesIdRol() != that.getRolesIdRol()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another RolUsuario.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof RolUsuario)) return false;
        return this.equalKeys(other) && ((RolUsuario)other).equalKeys(this);
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
        i = getUsuariosIdUsuario();
        result = 37*result + i;
        i = getRolesIdRol();
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
        StringBuffer sb = new StringBuffer("[RolUsuario |");
        sb.append(" usuariosIdUsuario=").append(getUsuariosIdUsuario());
        sb.append(" rolesIdRol=").append(getRolesIdRol());
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
        ret.put("usuariosIdUsuario", Integer.valueOf(getUsuariosIdUsuario()));
        ret.put("rolesIdRol", Integer.valueOf(getRolesIdRol()));
        return ret;
    }

}

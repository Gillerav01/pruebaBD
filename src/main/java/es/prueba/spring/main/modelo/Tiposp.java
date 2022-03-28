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

@Entity(name="tiposp")
public class Tiposp implements Serializable {

    /** Primary key. */
    protected static final String PK = "idTipop";

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
    @Column(name="id_tipop", unique=true, nullable=false, precision=10)
    private int idTipop;
    @Column(name="nombre_tipop", nullable=false, length=50)
    private String nombreTipop;
    @OneToMany(mappedBy="tiposp")
    private Set<TipoProducto> tipoProducto;

    /** Default constructor. */
    public Tiposp() {
        super();
    }

    /**
     * Access method for idTipop.
     *
     * @return the current value of idTipop
     */
    public int getIdTipop() {
        return idTipop;
    }

    /**
     * Setter method for idTipop.
     *
     * @param aIdTipop the new value for idTipop
     */
    public void setIdTipop(int aIdTipop) {
        idTipop = aIdTipop;
    }

    /**
     * Access method for nombreTipop.
     *
     * @return the current value of nombreTipop
     */
    public String getNombreTipop() {
        return nombreTipop;
    }

    /**
     * Setter method for nombreTipop.
     *
     * @param aNombreTipop the new value for nombreTipop
     */
    public void setNombreTipop(String aNombreTipop) {
        nombreTipop = aNombreTipop;
    }

    /**
     * Access method for tipoProducto.
     *
     * @return the current value of tipoProducto
     */
    public Set<TipoProducto> getTipoProducto() {
        return tipoProducto;
    }

    /**
     * Setter method for tipoProducto.
     *
     * @param aTipoProducto the new value for tipoProducto
     */
    public void setTipoProducto(Set<TipoProducto> aTipoProducto) {
        tipoProducto = aTipoProducto;
    }

    /**
     * Compares the key for this instance with another Tiposp.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Tiposp and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Tiposp)) {
            return false;
        }
        Tiposp that = (Tiposp) other;
        if (this.getIdTipop() != that.getIdTipop()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Tiposp.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Tiposp)) return false;
        return this.equalKeys(other) && ((Tiposp)other).equalKeys(this);
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
        i = getIdTipop();
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
        StringBuffer sb = new StringBuffer("[Tiposp |");
        sb.append(" idTipop=").append(getIdTipop());
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
        ret.put("idTipop", Integer.valueOf(getIdTipop()));
        return ret;
    }

}

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

@Entity(name="tipo_producto")
@IdClass(TipoProducto.TipoProductoId.class)
public class TipoProducto implements Serializable {

    /**
     * IdClass for primary key when using JPA annotations
     */
    public class TipoProductoId implements Serializable {
        Productos productos;
        Tiposp tiposp;
    }

    /** Primary key. */
    protected static final String PK = "TipoProductoPrimary";

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
    @JoinColumn(name="id_producto", nullable=false)
    private Productos productos;
    @ManyToOne(optional=false)
    @Id
    @JoinColumn(name="id_tipop", nullable=false)
    private Tiposp tiposp;

    /** Default constructor. */
    public TipoProducto() {
        super();
    }

    /**
     * Access method for productos.
     *
     * @return the current value of productos
     */
    public Productos getProductos() {
        return productos;
    }

    /**
     * Setter method for productos.
     *
     * @param aProductos the new value for productos
     */
    public void setProductos(Productos aProductos) {
        productos = aProductos;
    }

    /**
     * Access method for tiposp.
     *
     * @return the current value of tiposp
     */
    public Tiposp getTiposp() {
        return tiposp;
    }

    /**
     * Setter method for tiposp.
     *
     * @param aTiposp the new value for tiposp
     */
    public void setTiposp(Tiposp aTiposp) {
        tiposp = aTiposp;
    }

    /** Temporary value holder for group key fragment productosIdProducto */
    private transient int tempProductosIdProducto;

    /**
     * Gets the key fragment idProducto for member productos.
     * If this.productos is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setProductosIdProducto.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Productos
     */
    public int getProductosIdProducto() {
        return (getProductos() == null ? tempProductosIdProducto : getProductos().getIdProducto());
    }

    /**
     * Sets the key fragment idProducto from member productos.
     * If this.productos is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getProductosIdProducto.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdProducto New value for the key fragment
     * @see Productos
     */
    public void setProductosIdProducto(int aIdProducto) {
        if (getProductos() == null) {
            tempProductosIdProducto = aIdProducto;
        } else {
            getProductos().setIdProducto(aIdProducto);
        }
    }

    /** Temporary value holder for group key fragment tipospIdTipop */
    private transient int tempTipospIdTipop;

    /**
     * Gets the key fragment idTipop for member tiposp.
     * If this.tiposp is null, a temporary stored value for the key
     * fragment will be returned. The temporary value is set by setTipospIdTipop.
     * This behavior is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @return Current (or temporary) value of the key fragment
     * @see Tiposp
     */
    public int getTipospIdTipop() {
        return (getTiposp() == null ? tempTipospIdTipop : getTiposp().getIdTipop());
    }

    /**
     * Sets the key fragment idTipop from member tiposp.
     * If this.tiposp is null, the passed value will be temporary
     * stored, and returned by subsequent calls to getTipospIdTipop.
     * This behaviour is required by some persistence libraries to allow
     * fetching of objects in arbitrary order.
     *
     * @param aIdTipop New value for the key fragment
     * @see Tiposp
     */
    public void setTipospIdTipop(int aIdTipop) {
        if (getTiposp() == null) {
            tempTipospIdTipop = aIdTipop;
        } else {
            getTiposp().setIdTipop(aIdTipop);
        }
    }

    /**
     * Compares the key for this instance with another TipoProducto.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class TipoProducto and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof TipoProducto)) {
            return false;
        }
        TipoProducto that = (TipoProducto) other;
        if (this.getProductosIdProducto() != that.getProductosIdProducto()) {
            return false;
        }
        if (this.getTipospIdTipop() != that.getTipospIdTipop()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another TipoProducto.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof TipoProducto)) return false;
        return this.equalKeys(other) && ((TipoProducto)other).equalKeys(this);
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
        i = getProductosIdProducto();
        result = 37*result + i;
        i = getTipospIdTipop();
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
        StringBuffer sb = new StringBuffer("[TipoProducto |");
        sb.append(" productosIdProducto=").append(getProductosIdProducto());
        sb.append(" tipospIdTipop=").append(getTipospIdTipop());
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
        ret.put("productosIdProducto", Integer.valueOf(getProductosIdProducto()));
        ret.put("tipospIdTipop", Integer.valueOf(getTipospIdTipop()));
        return ret;
    }

}

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

@Entity(name="productos")
public class Productos implements Serializable {

    /** Primary key. */
    protected static final String PK = "idProducto";

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
    @Column(name="id_producto", unique=true, nullable=false, precision=10)
    private int idProducto;
    @Column(name="nombre_objeto", nullable=false, length=30)
    private String nombreObjeto;
    @Column(name="descripcion_objeto", nullable=false)
    private String descripcionObjeto;
    @Column(name="stock_objeto", nullable=false, precision=10)
    private int stockObjeto;
    @Column(name="precio_objeto", nullable=false, precision=22)
    private double precioObjeto;
    @OneToMany(mappedBy="productos")
    private Set<TipoProducto> tipoProducto;
    @OneToMany(mappedBy="productos")
    private Set<UsuarioProducto> usuarioProducto;

    /** Default constructor. */
    public Productos() {
        super();
    }

    /**
     * Access method for idProducto.
     *
     * @return the current value of idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * Setter method for idProducto.
     *
     * @param aIdProducto the new value for idProducto
     */
    public void setIdProducto(int aIdProducto) {
        idProducto = aIdProducto;
    }

    /**
     * Access method for nombreObjeto.
     *
     * @return the current value of nombreObjeto
     */
    public String getNombreObjeto() {
        return nombreObjeto;
    }

    /**
     * Setter method for nombreObjeto.
     *
     * @param aNombreObjeto the new value for nombreObjeto
     */
    public void setNombreObjeto(String aNombreObjeto) {
        nombreObjeto = aNombreObjeto;
    }

    /**
     * Access method for descripcionObjeto.
     *
     * @return the current value of descripcionObjeto
     */
    public String getDescripcionObjeto() {
        return descripcionObjeto;
    }

    /**
     * Setter method for descripcionObjeto.
     *
     * @param aDescripcionObjeto the new value for descripcionObjeto
     */
    public void setDescripcionObjeto(String aDescripcionObjeto) {
        descripcionObjeto = aDescripcionObjeto;
    }

    /**
     * Access method for stockObjeto.
     *
     * @return the current value of stockObjeto
     */
    public int getStockObjeto() {
        return stockObjeto;
    }

    /**
     * Setter method for stockObjeto.
     *
     * @param aStockObjeto the new value for stockObjeto
     */
    public void setStockObjeto(int aStockObjeto) {
        stockObjeto = aStockObjeto;
    }

    /**
     * Access method for precioObjeto.
     *
     * @return the current value of precioObjeto
     */
    public double getPrecioObjeto() {
        return precioObjeto;
    }

    /**
     * Setter method for precioObjeto.
     *
     * @param aPrecioObjeto the new value for precioObjeto
     */
    public void setPrecioObjeto(double aPrecioObjeto) {
        precioObjeto = aPrecioObjeto;
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
     * Compares the key for this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if other object is instance of class Productos and the key objects are equal
     */
    private boolean equalKeys(Object other) {
        if (this==other) {
            return true;
        }
        if (!(other instanceof Productos)) {
            return false;
        }
        Productos that = (Productos) other;
        if (this.getIdProducto() != that.getIdProducto()) {
            return false;
        }
        return true;
    }

    /**
     * Compares this instance with another Productos.
     *
     * @param other The object to compare to
     * @return True if the objects are the same
     */
    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Productos)) return false;
        return this.equalKeys(other) && ((Productos)other).equalKeys(this);
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
        i = getIdProducto();
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
        StringBuffer sb = new StringBuffer("[Productos |");
        sb.append(" idProducto=").append(getIdProducto());
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
        ret.put("idProducto", Integer.valueOf(getIdProducto()));
        return ret;
    }

}

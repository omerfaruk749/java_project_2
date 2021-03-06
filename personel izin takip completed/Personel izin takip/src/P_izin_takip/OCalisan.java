/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package P_izin_takip;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author TEKIN
 */
@Entity
@Table(name = "O_CALISAN", catalog = "", schema = "OFY")
@NamedQueries({
    @NamedQuery(name = "OCalisan.findAll", query = "SELECT o FROM OCalisan o")
    , @NamedQuery(name = "OCalisan.findById", query = "SELECT o FROM OCalisan o WHERE o.id = :id")
    , @NamedQuery(name = "OCalisan.findByIsim", query = "SELECT o FROM OCalisan o WHERE o.isim = :isim")
    , @NamedQuery(name = "OCalisan.findBySoyisim", query = "SELECT o FROM OCalisan o WHERE o.soyisim = :soyisim")
    , @NamedQuery(name = "OCalisan.findByYas", query = "SELECT o FROM OCalisan o WHERE o.yas = :yas")
    , @NamedQuery(name = "OCalisan.findByUnvan", query = "SELECT o FROM OCalisan o WHERE o.unvan = :unvan")})
public class OCalisan implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "ISIM")
    private String isim;
    @Column(name = "SOYISIM")
    private String soyisim;
    @Column(name = "YAS")
    private Integer yas;
    @Column(name = "UNVAN")
    private String unvan;

    public OCalisan() {
    }

    public OCalisan(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        String oldIsim = this.isim;
        this.isim = isim;
        changeSupport.firePropertyChange("isim", oldIsim, isim);
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        String oldSoyisim = this.soyisim;
        this.soyisim = soyisim;
        changeSupport.firePropertyChange("soyisim", oldSoyisim, soyisim);
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        Integer oldYas = this.yas;
        this.yas = yas;
        changeSupport.firePropertyChange("yas", oldYas, yas);
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        String oldUnvan = this.unvan;
        this.unvan = unvan;
        changeSupport.firePropertyChange("unvan", oldUnvan, unvan);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OCalisan)) {
            return false;
        }
        OCalisan other = (OCalisan) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "P_izin_takip.OCalisan[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

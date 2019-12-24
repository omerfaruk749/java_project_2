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
@Table(name = "UNVANLAR", catalog = "", schema = "OFY")
@NamedQueries({
    @NamedQuery(name = "Unvanlar_1.findAll", query = "SELECT u FROM Unvanlar_1 u")
    , @NamedQuery(name = "Unvanlar_1.findByUnvan", query = "SELECT u FROM Unvanlar_1 u WHERE u.unvan = :unvan")
    , @NamedQuery(name = "Unvanlar_1.findByGunsayisi", query = "SELECT u FROM Unvanlar_1 u WHERE u.gunsayisi = :gunsayisi")})
public class Unvanlar_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Column(name = "UNVAN")
    private String unvan;
    @Id
    @Basic(optional = false)
    @Column(name = "GUNSAYISI")
    private Integer gunsayisi;

    public Unvanlar_1() {
    }

    public Unvanlar_1(Integer gunsayisi) {
        this.gunsayisi = gunsayisi;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        String oldUnvan = this.unvan;
        this.unvan = unvan;
        changeSupport.firePropertyChange("unvan", oldUnvan, unvan);
    }

    public Integer getGunsayisi() {
        return gunsayisi;
    }

    public void setGunsayisi(Integer gunsayisi) {
        Integer oldGunsayisi = this.gunsayisi;
        this.gunsayisi = gunsayisi;
        changeSupport.firePropertyChange("gunsayisi", oldGunsayisi, gunsayisi);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gunsayisi != null ? gunsayisi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Unvanlar_1)) {
            return false;
        }
        Unvanlar_1 other = (Unvanlar_1) object;
        if ((this.gunsayisi == null && other.gunsayisi != null) || (this.gunsayisi != null && !this.gunsayisi.equals(other.gunsayisi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "P_izin_takip.Unvanlar_1[ gunsayisi=" + gunsayisi + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}

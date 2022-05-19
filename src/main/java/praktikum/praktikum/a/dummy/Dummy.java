/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum.praktikum.a.dummy;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ASUS
 */
@Entity
@Table(name = "dummy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Dummy.findAll", query = "SELECT d FROM Dummy d"),
    @NamedQuery(name = "Dummy.findById", query = "SELECT d FROM Dummy d WHERE d.id = :id"),
    @NamedQuery(name = "Dummy.findByTglahir", query = "SELECT d FROM Dummy d WHERE d.tglahir = :tglahir")})
public class Dummy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "tglahir")
    @Temporal(TemporalType.DATE)
    private Date tglahir;
    @Lob
    @Column(name = "gambar")
    private byte[] gambar;

    public Dummy() {
    }

    public Dummy(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTglahir() {
        return tglahir;
    }

    public void setTglahir(Date tglahir) {
        this.tglahir = tglahir;
    }

    public byte[] getGambar() {
        return gambar;
    }

    public void setGambar(byte[] gambar) {
        this.gambar = gambar;
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
        if (!(object instanceof Dummy)) {
            return false;
        }
        Dummy other = (Dummy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "praktikum.praktikum.a.dummy.Dummy[ id=" + id + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "tarjetadespacho")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tarjetadespacho.findAll", query = "SELECT t FROM Tarjetadespacho t")
    , @NamedQuery(name = "Tarjetadespacho.findByIdTarjetaDespacho", query = "SELECT t FROM Tarjetadespacho t WHERE t.idTarjetaDespacho = :idTarjetaDespacho")
    , @NamedQuery(name = "Tarjetadespacho.findByPersonaidPersona", query = "SELECT t FROM Tarjetadespacho t WHERE t.personaidPersona = :personaidPersona")
    , @NamedQuery(name = "Tarjetadespacho.findByFecha", query = "SELECT t FROM Tarjetadespacho t WHERE t.fecha = :fecha")
    , @NamedQuery(name = "Tarjetadespacho.findByNumeroTarjeta", query = "SELECT t FROM Tarjetadespacho t WHERE t.numeroTarjeta = :numeroTarjeta")})
public class Tarjetadespacho implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idTarjetaDespacho")
    private Integer idTarjetaDespacho;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "numeroTarjeta")
    private String numeroTarjeta;

    public Tarjetadespacho() {
    }

    public Tarjetadespacho(Integer idTarjetaDespacho) {
        this.idTarjetaDespacho = idTarjetaDespacho;
    }

    public Tarjetadespacho(Integer idTarjetaDespacho, int personaidPersona) {
        this.idTarjetaDespacho = idTarjetaDespacho;
        this.personaidPersona = personaidPersona;
    }

    public Integer getIdTarjetaDespacho() {
        return idTarjetaDespacho;
    }

    public void setIdTarjetaDespacho(Integer idTarjetaDespacho) {
        this.idTarjetaDespacho = idTarjetaDespacho;
    }

    public int getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(int personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTarjetaDespacho != null ? idTarjetaDespacho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tarjetadespacho)) {
            return false;
        }
        Tarjetadespacho other = (Tarjetadespacho) object;
        if ((this.idTarjetaDespacho == null && other.idTarjetaDespacho != null) || (this.idTarjetaDespacho != null && !this.idTarjetaDespacho.equals(other.idTarjetaDespacho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tarjetadespacho[ idTarjetaDespacho=" + idTarjetaDespacho + " ]";
    }
    
}

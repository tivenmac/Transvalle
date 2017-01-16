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
@Table(name = "documento")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Documento.findAll", query = "SELECT d FROM Documento d")
    , @NamedQuery(name = "Documento.findByIdDocumento", query = "SELECT d FROM Documento d WHERE d.idDocumento = :idDocumento")
    , @NamedQuery(name = "Documento.findByAseguradora", query = "SELECT d FROM Documento d WHERE d.aseguradora = :aseguradora")
    , @NamedQuery(name = "Documento.findByNombre", query = "SELECT d FROM Documento d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Documento.findByFechaExpiraci\u00f3n", query = "SELECT d FROM Documento d WHERE d.fechaExpiraci\u00f3n = :fechaExpiraci\u00f3n")
    , @NamedQuery(name = "Documento.findByFechaExpedici\u00f3n", query = "SELECT d FROM Documento d WHERE d.fechaExpedici\u00f3n = :fechaExpedici\u00f3n")})
public class Documento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idDocumento")
    private Integer idDocumento;
    @Column(name = "aseguradora")
    private String aseguradora;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "fechaExpiraci\u00f3n")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpiración;
    @Column(name = "fechaExpedici\u00f3n")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaExpedición;

    public Documento() {
    }

    public Documento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public Integer getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(Integer idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaExpiración() {
        return fechaExpiración;
    }

    public void setFechaExpiración(Date fechaExpiración) {
        this.fechaExpiración = fechaExpiración;
    }

    public Date getFechaExpedición() {
        return fechaExpedición;
    }

    public void setFechaExpedición(Date fechaExpedición) {
        this.fechaExpedición = fechaExpedición;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDocumento != null ? idDocumento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Documento)) {
            return false;
        }
        Documento other = (Documento) object;
        if ((this.idDocumento == null && other.idDocumento != null) || (this.idDocumento != null && !this.idDocumento.equals(other.idDocumento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Documento[ idDocumento=" + idDocumento + " ]";
    }
    
}

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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "documento_has_bus")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DocumentoHasBus.findAll", query = "SELECT d FROM DocumentoHasBus d")
    , @NamedQuery(name = "DocumentoHasBus.findByDocumentoidDocumento", query = "SELECT d FROM DocumentoHasBus d WHERE d.documentoHasBusPK.documentoidDocumento = :documentoidDocumento")
    , @NamedQuery(name = "DocumentoHasBus.findByBusidBus", query = "SELECT d FROM DocumentoHasBus d WHERE d.documentoHasBusPK.busidBus = :busidBus")
    , @NamedQuery(name = "DocumentoHasBus.findByFechaExpedicion", query = "SELECT d FROM DocumentoHasBus d WHERE d.fechaExpedicion = :fechaExpedicion")
    , @NamedQuery(name = "DocumentoHasBus.findByFechaExpiracion", query = "SELECT d FROM DocumentoHasBus d WHERE d.fechaExpiracion = :fechaExpiracion")})
public class DocumentoHasBus implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DocumentoHasBusPK documentoHasBusPK;
    @Basic(optional = false)
    @Column(name = "fechaExpedicion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpedicion;
    @Basic(optional = false)
    @Column(name = "fechaExpiracion")
    @Temporal(TemporalType.DATE)
    private Date fechaExpiracion;

    public DocumentoHasBus() {
    }

    public DocumentoHasBus(DocumentoHasBusPK documentoHasBusPK) {
        this.documentoHasBusPK = documentoHasBusPK;
    }

    public DocumentoHasBus(DocumentoHasBusPK documentoHasBusPK, Date fechaExpedicion, Date fechaExpiracion) {
        this.documentoHasBusPK = documentoHasBusPK;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaExpiracion = fechaExpiracion;
    }

    public DocumentoHasBus(int documentoidDocumento, int busidBus) {
        this.documentoHasBusPK = new DocumentoHasBusPK(documentoidDocumento, busidBus);
    }

    public DocumentoHasBusPK getDocumentoHasBusPK() {
        return documentoHasBusPK;
    }

    public void setDocumentoHasBusPK(DocumentoHasBusPK documentoHasBusPK) {
        this.documentoHasBusPK = documentoHasBusPK;
    }

    public Date getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(Date fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (documentoHasBusPK != null ? documentoHasBusPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoHasBus)) {
            return false;
        }
        DocumentoHasBus other = (DocumentoHasBus) object;
        if ((this.documentoHasBusPK == null && other.documentoHasBusPK != null) || (this.documentoHasBusPK != null && !this.documentoHasBusPK.equals(other.documentoHasBusPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DocumentoHasBus[ documentoHasBusPK=" + documentoHasBusPK + " ]";
    }
    
}

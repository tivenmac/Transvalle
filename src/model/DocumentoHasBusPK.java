/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author oscar
 */
@Embeddable
public class DocumentoHasBusPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "Documento_idDocumento")
    private int documentoidDocumento;
    @Basic(optional = false)
    @Column(name = "Bus_idBus")
    private int busidBus;

    public DocumentoHasBusPK() {
    }

    public DocumentoHasBusPK(int documentoidDocumento, int busidBus) {
        this.documentoidDocumento = documentoidDocumento;
        this.busidBus = busidBus;
    }

    public int getDocumentoidDocumento() {
        return documentoidDocumento;
    }

    public void setDocumentoidDocumento(int documentoidDocumento) {
        this.documentoidDocumento = documentoidDocumento;
    }

    public int getBusidBus() {
        return busidBus;
    }

    public void setBusidBus(int busidBus) {
        this.busidBus = busidBus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) documentoidDocumento;
        hash += (int) busidBus;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DocumentoHasBusPK)) {
            return false;
        }
        DocumentoHasBusPK other = (DocumentoHasBusPK) object;
        if (this.documentoidDocumento != other.documentoidDocumento) {
            return false;
        }
        if (this.busidBus != other.busidBus) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.DocumentoHasBusPK[ documentoidDocumento=" + documentoidDocumento + ", busidBus=" + busidBus + " ]";
    }
    
}

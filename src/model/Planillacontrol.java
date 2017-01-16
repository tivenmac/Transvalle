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
@Table(name = "planillacontrol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Planillacontrol.findAll", query = "SELECT p FROM Planillacontrol p")
    , @NamedQuery(name = "Planillacontrol.findByIdPlanillaControl", query = "SELECT p FROM Planillacontrol p WHERE p.idPlanillaControl = :idPlanillaControl")
    , @NamedQuery(name = "Planillacontrol.findByPersona", query = "SELECT p FROM Planillacontrol p WHERE p.persona = :persona")
    , @NamedQuery(name = "Planillacontrol.findByFecha", query = "SELECT p FROM Planillacontrol p WHERE p.fecha = :fecha")
    , @NamedQuery(name = "Planillacontrol.findByNumeroTarjeta", query = "SELECT p FROM Planillacontrol p WHERE p.numeroTarjeta = :numeroTarjeta")})
public class Planillacontrol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPlanillaControl")
    private Integer idPlanillaControl;
    @Column(name = "persona")
    private Integer persona;
    @Column(name = "fecha")
    @Temporal(TemporalType.DATE)
    private Date fecha;
    @Column(name = "numeroTarjeta")
    private String numeroTarjeta;

    public Planillacontrol() {
    }

    public Planillacontrol(Integer idPlanillaControl) {
        this.idPlanillaControl = idPlanillaControl;
    }

    public Integer getIdPlanillaControl() {
        return idPlanillaControl;
    }

    public void setIdPlanillaControl(Integer idPlanillaControl) {
        this.idPlanillaControl = idPlanillaControl;
    }

    public Integer getPersona() {
        return persona;
    }

    public void setPersona(Integer persona) {
        this.persona = persona;
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
        hash += (idPlanillaControl != null ? idPlanillaControl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Planillacontrol)) {
            return false;
        }
        Planillacontrol other = (Planillacontrol) object;
        if ((this.idPlanillaControl == null && other.idPlanillaControl != null) || (this.idPlanillaControl != null && !this.idPlanillaControl.equals(other.idPlanillaControl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Planillacontrol[ idPlanillaControl=" + idPlanillaControl + " ]";
    }
    
}

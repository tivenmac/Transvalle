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
@Table(name = "detallesplantilla")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallesplantilla.findAll", query = "SELECT d FROM Detallesplantilla d")
    , @NamedQuery(name = "Detallesplantilla.findById", query = "SELECT d FROM Detallesplantilla d WHERE d.id = :id")
    , @NamedQuery(name = "Detallesplantilla.findByIdPlanillacontrol", query = "SELECT d FROM Detallesplantilla d WHERE d.idPlanillacontrol = :idPlanillacontrol")
    , @NamedQuery(name = "Detallesplantilla.findByIdBus", query = "SELECT d FROM Detallesplantilla d WHERE d.idBus = :idBus")
    , @NamedQuery(name = "Detallesplantilla.findByRuta", query = "SELECT d FROM Detallesplantilla d WHERE d.ruta = :ruta")
    , @NamedQuery(name = "Detallesplantilla.findByHoraSalida", query = "SELECT d FROM Detallesplantilla d WHERE d.horaSalida = :horaSalida")})
public class Detallesplantilla implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "id_planillacontrol")
    private int idPlanillacontrol;
    @Basic(optional = false)
    @Column(name = "id_bus")
    private int idBus;
    @Basic(optional = false)
    @Column(name = "ruta")
    private int ruta;
    @Basic(optional = false)
    @Column(name = "horaSalida")
    @Temporal(TemporalType.TIME)
    private Date horaSalida;

    public Detallesplantilla() {
    }

    public Detallesplantilla(Integer id) {
        this.id = id;
    }

    public Detallesplantilla(Integer id, int idPlanillacontrol, int idBus, int ruta, Date horaSalida) {
        this.id = id;
        this.idPlanillacontrol = idPlanillacontrol;
        this.idBus = idBus;
        this.ruta = ruta;
        this.horaSalida = horaSalida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPlanillacontrol() {
        return idPlanillacontrol;
    }

    public void setIdPlanillacontrol(int idPlanillacontrol) {
        this.idPlanillacontrol = idPlanillacontrol;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public int getRuta() {
        return ruta;
    }

    public void setRuta(int ruta) {
        this.ruta = ruta;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
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
        if (!(object instanceof Detallesplantilla)) {
            return false;
        }
        Detallesplantilla other = (Detallesplantilla) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Detallesplantilla[ id=" + id + " ]";
    }
    
}

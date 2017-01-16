/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oscar
 */
@Entity
@Table(name = "puntocontrol")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Puntocontrol.findAll", query = "SELECT p FROM Puntocontrol p")
    , @NamedQuery(name = "Puntocontrol.findByIdPuntoControl", query = "SELECT p FROM Puntocontrol p WHERE p.idPuntoControl = :idPuntoControl")
    , @NamedQuery(name = "Puntocontrol.findByPersonaidPersona", query = "SELECT p FROM Puntocontrol p WHERE p.personaidPersona = :personaidPersona")
    , @NamedQuery(name = "Puntocontrol.findByDescripci\u00f3n", query = "SELECT p FROM Puntocontrol p WHERE p.descripci\u00f3n = :descripci\u00f3n")
    , @NamedQuery(name = "Puntocontrol.findByNombre", query = "SELECT p FROM Puntocontrol p WHERE p.nombre = :nombre")})
public class Puntocontrol implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idPuntoControl")
    private Integer idPuntoControl;
    @Basic(optional = false)
    @Column(name = "Persona_idPersona")
    private int personaidPersona;
    @Column(name = "descripci\u00f3n")
    private String descripción;
    @Column(name = "nombre")
    private String nombre;

    public Puntocontrol() {
    }

    public Puntocontrol(Integer idPuntoControl) {
        this.idPuntoControl = idPuntoControl;
    }

    public Puntocontrol(Integer idPuntoControl, int personaidPersona) {
        this.idPuntoControl = idPuntoControl;
        this.personaidPersona = personaidPersona;
    }

    public Integer getIdPuntoControl() {
        return idPuntoControl;
    }

    public void setIdPuntoControl(Integer idPuntoControl) {
        this.idPuntoControl = idPuntoControl;
    }

    public int getPersonaidPersona() {
        return personaidPersona;
    }

    public void setPersonaidPersona(int personaidPersona) {
        this.personaidPersona = personaidPersona;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPuntoControl != null ? idPuntoControl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Puntocontrol)) {
            return false;
        }
        Puntocontrol other = (Puntocontrol) object;
        if ((this.idPuntoControl == null && other.idPuntoControl != null) || (this.idPuntoControl != null && !this.idPuntoControl.equals(other.idPuntoControl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Puntocontrol[ idPuntoControl=" + idPuntoControl + " ]";
    }
    
}

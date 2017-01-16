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
@Table(name = "recorrido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recorrido.findAll", query = "SELECT r FROM Recorrido r")
    , @NamedQuery(name = "Recorrido.findByIdRecorrido", query = "SELECT r FROM Recorrido r WHERE r.idRecorrido = :idRecorrido")
    , @NamedQuery(name = "Recorrido.findByTarjetaDespachoidTarjetaDespacho", query = "SELECT r FROM Recorrido r WHERE r.tarjetaDespachoidTarjetaDespacho = :tarjetaDespachoidTarjetaDespacho")
    , @NamedQuery(name = "Recorrido.findByHoraEntrada", query = "SELECT r FROM Recorrido r WHERE r.horaEntrada = :horaEntrada")
    , @NamedQuery(name = "Recorrido.findByHoraSalida", query = "SELECT r FROM Recorrido r WHERE r.horaSalida = :horaSalida")
    , @NamedQuery(name = "Recorrido.findByColeo", query = "SELECT r FROM Recorrido r WHERE r.coleo = :coleo")
    , @NamedQuery(name = "Recorrido.findByNumeroRecorrido", query = "SELECT r FROM Recorrido r WHERE r.numeroRecorrido = :numeroRecorrido")})
public class Recorrido implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idRecorrido")
    private Integer idRecorrido;
    @Basic(optional = false)
    @Column(name = "TarjetaDespacho_idTarjetaDespacho")
    private int tarjetaDespachoidTarjetaDespacho;
    @Column(name = "horaEntrada")
    @Temporal(TemporalType.DATE)
    private Date horaEntrada;
    @Column(name = "horaSalida")
    @Temporal(TemporalType.DATE)
    private Date horaSalida;
    @Column(name = "coleo")
    private Integer coleo;
    @Column(name = "numeroRecorrido")
    private Integer numeroRecorrido;

    public Recorrido() {
    }

    public Recorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public Recorrido(Integer idRecorrido, int tarjetaDespachoidTarjetaDespacho) {
        this.idRecorrido = idRecorrido;
        this.tarjetaDespachoidTarjetaDespacho = tarjetaDespachoidTarjetaDespacho;
    }

    public Integer getIdRecorrido() {
        return idRecorrido;
    }

    public void setIdRecorrido(Integer idRecorrido) {
        this.idRecorrido = idRecorrido;
    }

    public int getTarjetaDespachoidTarjetaDespacho() {
        return tarjetaDespachoidTarjetaDespacho;
    }

    public void setTarjetaDespachoidTarjetaDespacho(int tarjetaDespachoidTarjetaDespacho) {
        this.tarjetaDespachoidTarjetaDespacho = tarjetaDespachoidTarjetaDespacho;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Integer getColeo() {
        return coleo;
    }

    public void setColeo(Integer coleo) {
        this.coleo = coleo;
    }

    public Integer getNumeroRecorrido() {
        return numeroRecorrido;
    }

    public void setNumeroRecorrido(Integer numeroRecorrido) {
        this.numeroRecorrido = numeroRecorrido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRecorrido != null ? idRecorrido.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recorrido)) {
            return false;
        }
        Recorrido other = (Recorrido) object;
        if ((this.idRecorrido == null && other.idRecorrido != null) || (this.idRecorrido != null && !this.idRecorrido.equals(other.idRecorrido))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Recorrido[ idRecorrido=" + idRecorrido + " ]";
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClasses;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Victor
 */
@Entity
@Table(name="rastreamentoRota")
public class RotaEntity implements Serializable {
    @Column(name="ponto")
    private ArrayList<String> ponto;
    @Column(name="nomeRota")
    private String nomeRota;

    public RotaEntity() {
    }

    public RotaEntity(List pontos, String nomeRota, Long id) {
        this.ponto = new ArrayList<>();
        this.nomeRota = nomeRota;
        this.id = id;
    }
    
    public ArrayList<String> getPonto() {
        return ponto;
    }

    public void setPonto(ArrayList<String> ponto) {
        this.ponto = ponto;
    }

    public String getNomeRota() {
        return nomeRota;
    }

    public void setNomeRota(String nomeRota) {
        this.nomeRota = nomeRota;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof RotaEntity)) {
            return false;
        }
        RotaEntity other = (RotaEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.RotaEntity[ id=" + id + " ]";
    }
    
}

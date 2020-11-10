/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityClasses;

import java.io.Serializable;
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
@Table(name="rastreamentoMotorista")
public class MotoristaEntity implements Serializable {
    @Column(name="nomeMotorista")
    private String nomeMotorista;
    @Column(name="emailMotorista")
    private String emailMotorista;
    @Column(name="senhaMotorista")
    private String senhaMotorista;
    @Column(name="avaliacoesPositivas")
    private int avaliacoesPositivas;
    @Column(name="avaliacoesNegativas")
    private int avaliacoesNegativas;

    public MotoristaEntity() {
    }

    public MotoristaEntity(String nomeMotorista, String emailMotorista, String senhaMotorista, int avaliacoesPositivas, int avaliacoesNegativas, Long id) {
        this.nomeMotorista = nomeMotorista;
        this.emailMotorista = emailMotorista;
        this.senhaMotorista = senhaMotorista;
        this.avaliacoesPositivas = avaliacoesPositivas;
        this.avaliacoesNegativas = avaliacoesNegativas;
        this.id = id;
    }

    public String getNomeMotorista() {
        return nomeMotorista;
    }

    public void setNomeMotorista(String nomeMotorista) {
        this.nomeMotorista = nomeMotorista;
    }

    public String getEmailMotorista() {
        return emailMotorista;
    }

    public void setEmailMotorista(String emailMotorista) {
        this.emailMotorista = emailMotorista;
    }

    public String getSenhaMotorista() {
        return senhaMotorista;
    }

    public void setSenhaMotorista(String senhaMotorista) {
        this.senhaMotorista = senhaMotorista;
    }

    public int getAvaliacoesPositivas() {
        return avaliacoesPositivas;
    }

    public void setAvaliacoesPositivas(int avaliacoesPositivas) {
        this.avaliacoesPositivas = avaliacoesPositivas;
    }

    public int getAvaliacoesNegativas() {
        return avaliacoesNegativas;
    }

    public void setAvaliacoesNegativas(int avaliacoesNegativas) {
        this.avaliacoesNegativas = avaliacoesNegativas;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
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
        if (!(object instanceof MotoristaEntity)) {
            return false;
        }
        MotoristaEntity other = (MotoristaEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.MotoristaEntity[ id=" + id + " ]";
    }
    
}

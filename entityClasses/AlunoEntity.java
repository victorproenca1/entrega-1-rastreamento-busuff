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
@Table(name="rastreamentoAluno")
public class AlunoEntity implements Serializable {
    @Column(name="emailAluno")
    private String emailAluno;
    @Column(name="senhaAluno")
    private String senhaAluno;
    @Column(name="nomeAluno")
    private String nomeAluno;
    @Column(name="curso")
    private String curso;

    public AlunoEntity() {
    }

    public AlunoEntity(String emailAluno, String senhaAluno, String nomeAluno, String curso, Long id) {
        this.emailAluno = emailAluno;
        this.senhaAluno = senhaAluno;
        this.nomeAluno = nomeAluno;
        this.curso = curso;
        this.id = id;
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmailAluno() {
        return emailAluno;
    }

    public void setEmailAluno(String emailAluno) {
        this.emailAluno = emailAluno;
    }

    public String getSenhaAluno() {
        return senhaAluno;
    }

    public void setSenhaAluno(String senhaAluno) {
        this.senhaAluno = senhaAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
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
        if (!(object instanceof AlunoEntity)) {
            return false;
        }
        AlunoEntity other = (AlunoEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityClasses.AlunoEntity[ id=" + id + " ]";
    }
    
}

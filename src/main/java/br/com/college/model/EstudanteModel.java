package br.com.college.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String matricula;
    private String nome;
    private String email;
    private LocalDate dataNascimento;
    private Integer idade;

    public EstudanteModel() {
    }

    public EstudanteModel(Integer id, String matricula, String nome, String email, LocalDate dataNascimento, Integer idade) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public EstudanteModel(String matricula, String nome, String email, LocalDate dataNascimento, Integer idade) {
        this.matricula = matricula;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "EstudanteModel{" +
                "id=" + id +
                ", matricula='" + matricula + '\'' +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                '}';
    }
}

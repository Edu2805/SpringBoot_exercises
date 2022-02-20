package com.devInHouse.simpleForm.entities;

import javax.persistence.*;

//Define a tabela no banco e dados
@Entity
@Table(name = "tb_user")
public class User {

    //Configuração da chave primária no banco, sendo gerada de forma automática
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    /**
     * Definição da relação entre tabela tb_user e tb_department (Vários usuários para um departamento)
     * Obs: olhar a configuração do banco de dados em resources/application.properties
     */
    @ManyToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public User(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}

package com.devInHouse.simpleForm.entities;

import javax.persistence.*;

//Definição da tabela no banco de dados
@Entity
@Table(name = "tb_department")
public class Department {

    //Configuração para gerar a chave primária de forma automática
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    public Department(){

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
}

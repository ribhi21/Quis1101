/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "cv_1101")
public class Customer implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String nama_cv;
    @Column(length = 255, nullable = true)
    private String alamat_cv;
    @Column(length = 255, nullable = true)
    private String tanggal_cv;
    

    public Long getId_Customer() {
        return id;
    }

    public void setId_Customer(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getNama_Customer() {
        return nama_cv;
    }

    /**
     * @param name the name to set
     */
    public void setNama_Customer(String name) {
        this.nama_cv = nama_cv;
    }

    /**
     * @param description the description to set
     */
    public void setPassword(String description) {
        this.alamat_cv = alamat_cv;
    }

    /**
     * @return the description
     */
    public String getPassword() {
        return alamat_cv;
    }
        /**
     * @param description the description to set
     */
    public void setNohp(String description) {
        this.tanggal_cv = tanggal_cv;
    }

    /**
     * @return the description
     */
    public String getNohp() {
        return tanggal_cv;
    }

}

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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "nilai_1101")
public class Layanan implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nama_cv;
    @Column(length = 255, nullable = true)
    private String nilai_cv;
    @ManyToOne
    private Customer cv;
    /**
     * @return the id
     */
    public Long getId_Layanan() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId_layanan(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getKendaraan_Layanan() {
        return nama_cv;
    }

    /**
     * @param name the name to set
     */
    public void setKendaraan_Layanan(String name) {
        this.nama_cv = nama_cv;
    }

    public String getKeterangan_Layanan() {
        return nilai_cv;
    }

    /**
     * @param name the name to set
     */
    public void setKeterangan_Layanan(String name) {
        this.nilai_cv = nilai_cv;
    }
       
    public Customer getCustomer() {
        return cv;
    }

    /**
     * @param name the name to set
     */
    public void setCustomer(Customer customer) {
        this.cv = cv;
    }
    
    
}

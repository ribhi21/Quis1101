/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.repo;

import com.MRibhiAlGhiffary.kuis1101.entity.Layanan;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface LayananRepo extends CrudRepository<Layanan, Long>{
    
    @Query("select l from Layanan l")
    public List<Layanan> findAllLayanan();
    
    @Query("select l from Layanan l where l.customer.id= :id")
    public List<Layanan> findByCustomer(@Param("id") Long id);
    
    @Query("select l from Layanan l where LOWER(l.kendaraan_layanan) LIKE LOWER(:kendaraan_layanan)")
    public List<Layanan> findByKendaraanLayanan(@Param("kendaraan_layanan") String kendaraan_layanan);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.service;

import com.MRibhiAlGhiffary.kuis1101.entity.Layanan;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.MRibhiAlGhiffary.kuis1101.repo.LayananRepo;

/**
 *
 * @author Hendro Steven
 */
@Service("layananService")
@Transactional
public class LayananService {

    @Autowired
    private LayananRepo repo;

    public Layanan insertOrUpdate(Layanan layanan) {
        return repo.save(layanan);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public List<Layanan> findAll() {
        return repo.findAllLayanan();
    }

    public List<Layanan> findByCategory(Long customerId) {
        return repo.findByCustomer(customerId);
    }

    public List<Layanan> findByKendaraanLayanan(String kendaraan_layanan) {
        return repo.findByKendaraanLayanan("%" + kendaraan_layanan + "%");
    }
}

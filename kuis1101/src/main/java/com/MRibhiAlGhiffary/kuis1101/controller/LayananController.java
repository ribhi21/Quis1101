/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.MRibhiAlGhiffary.kuis1101.controller;

import com.MRibhiAlGhiffary.kuis1101.entity.Layanan;
import com.MRibhiAlGhiffary.kuis1101.service.LayananService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.MRibhiAlGhiffary.kuis1101.repo.LayananRepo;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/layanan")
public class LayananController {
    
    @Autowired
    private LayananService layananService;
    
    @RequestMapping(method = RequestMethod.POST)
    public Layanan insertOrUpdate(@RequestBody Layanan layanan){
        return layananService.insertOrUpdate(layanan);
    }
  
}

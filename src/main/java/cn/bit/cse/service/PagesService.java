/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.bit.cse.service;

import cn.bit.cse.models.Pages;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

/**
 *
 * @author Yvette
 */
public interface PagesService {
    
    Pages save(Pages pages);
    
    void delete(Pages pages);
    
    Pages findOne(String id);
    
    Iterable<Pages> findAll();
    
    Page<Pages> findByTitle(String title, PageRequest pageRequest);
    
    List<Pages> findByUrl(String url);
    
    
    
    
}

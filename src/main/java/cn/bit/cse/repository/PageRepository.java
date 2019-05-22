/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.bit.cse.repository;

import cn.bit.cse.models.Pages;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;
/**
 *
 * @author Yvette
 */
public interface PageRepository  extends ElasticsearchRepository<Pages, String>{
    
    /**
     *
     * @param title
     * @param pageable
     * @return
     */
    Page<Pages> findByTitle(String title, Pageable pageable);
    List<Pages> findByUrl(String url);

    public Pages findOne(String id);
}

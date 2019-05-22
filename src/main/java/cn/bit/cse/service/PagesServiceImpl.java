/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.bit.cse.service;

import org.springframework.stereotype.Service;
import cn.bit.cse.models.Pages;
import cn.bit.cse.repository.PageRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;


/**
 *
 * @author Yvette
 */

@Service
public class PagesServiceImpl implements PagesService {
    
    private PageRepository pageRepository;
    
    @Autowired
    public Pages save(Pages pages) {
       return pageRepository.save(pages);
    }

    public void delete(Pages pages) {
        pageRepository.delete(pages);
    }

    public Pages findOne(String id) {
      return pageRepository.findOne(id);
    }

    public Iterable<Pages> findAll() {
       return pageRepository.findAll();
    }

    
    public Page<Pages> findByTitle(String title, PageRequest pageRequest) {
        return pageRepository.findByTitle(title, pageRequest);
    }

    
    public List<Pages> findByUrl(String url) {
        return pageRepository.findByUrl(url);
    }

    /**
     * @return the pageRepository
     */
    public PageRepository getPageRepository() {
        return pageRepository;
    }

    /**
     * @param pageRepository the pageRepository to set
     */
    public void setPageRepository(PageRepository pageRepository) {
        this.pageRepository = pageRepository;
    }
    
}

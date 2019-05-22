/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.bit.cse.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "city", type="pages")


/**
 *
 * @author Yvette
 */
public class Pages {
    
    @Id
    private String id;
    private String  url;
    private String title;
    private String url2;

    public Pages() {
    }

    public Pages(String id, String url, String title, String url2) {
        this.id = id;
        this.url = url;
        this.title = title;
        this.url2 = url2;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the url2
     */
    public String getUrl2() {
        return url2;
    }

    /**
     * @param url2 the url2 to set
     */
    public void setUrl2(String url2) {
        this.url2 = url2;
    }

    @Override
    public String toString() {
        return "Page{" + "id=" + id + ", url=" + url + ", title=" + title + ", url2=" + url2 + '}';
    }
    
              
    
    
}

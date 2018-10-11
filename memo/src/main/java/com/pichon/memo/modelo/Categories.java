package com.pichon.memo.modelo;
// Generated Oct 11, 2018 1:49:03 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Categories generated by hbm2java
 */
@Entity
public class Categories  implements java.io.Serializable {

     @Id
     @GeneratedValue
     private Integer cid;
     private String cname;
     private String descrip;
     //@ElementCollection(targetClass=Integer.class)
     //private Set<Products> productses = new HashSet<Products>(0);

    public Categories() {
    }

	
    public Categories(String cname, String descrip) {
        this.cname = cname;
        this.descrip = descrip;
    }
    
//    public Categories(String cname, String descrip, Set<Products> productses) {
//       this.cname = cname;
//       this.descrip = descrip;
//       this.productses = productses;
//    }
   
    public Integer getCid() {
        return this.cid;
    }
    
    public void setCid(Integer cid) {
        this.cid = cid;
    }
    public String getCname() {
        return this.cname;
    }
    
    public void setCname(String cname) {
        this.cname = cname;
    }
    public String getDescrip() {
        return this.descrip;
    }
    
    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }
    
//    public Set<Products> getProductses() {
//        return this.productses;
//    }
//    
//    public void setProductses(Set<Products> productses) {
//        this.productses = productses;
//    }




}



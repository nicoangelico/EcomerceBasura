package com.pichon.memo.modelo;
// Generated Oct 11, 2018 1:49:03 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Products generated by hbm2java
 */
@Entity
public class Products  implements java.io.Serializable {

     @Id
     @GeneratedValue
     private Integer pid;
     private Categories categories;
     private String descr;
     private String imgurl;
     private BigDecimal price;
     private Boolean used;
     //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, targetEntity = Reservations.class)
     @ElementCollection(targetClass=Integer.class)
     private Set<Reservations> reservationses = new HashSet<>(0);

    public Products() {
    }

	
    public Products(Categories categories, String descr, String imgurl) {
        this.categories = categories;
        this.descr = descr;
        this.imgurl = imgurl;
    }
    public Products(Categories categories, String descr, String imgurl, BigDecimal price, Boolean used, Set<Reservations> reservationses) {
       this.categories = categories;
       this.descr = descr;
       this.imgurl = imgurl;
       this.price = price;
       this.used = used;
       this.reservationses = reservationses;
    }
   
    public Integer getPid() {
        return this.pid;
    }
    
    public void setPid(Integer pid) {
        this.pid = pid;
    }
    public Categories getCategories() {
        return this.categories;
    }
    
    public void setCategories(Categories categories) {
        this.categories = categories;
    }
    public String getDescr() {
        return this.descr;
    }
    
    public void setDescr(String descr) {
        this.descr = descr;
    }
    public String getImgurl() {
        return this.imgurl;
    }
    
    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }
    public BigDecimal getPrice() {
        return this.price;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public Boolean getUsed() {
        return this.used;
    }
    
    public void setUsed(Boolean used) {
        this.used = used;
    }
    public Set<Reservations> getReservationses() {
        return this.reservationses;
    }
    
    public void setReservationses(Set<Reservations> reservationses) {
        this.reservationses = reservationses;
    }




}



package ivoluntar.Users;

import ivoluntar.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@jakarta.persistence.Entity
@Table(name = "volunteers")
public class Voluntar implements Entity<Long> {

    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "city")
    private String city;

    @Column(name = "county")
    private String county;

    @Column(name = "CNP")
    private Long CNP;

    @Column(name = "number_id")
    private String numberID;

    @Column(name = "date_id")
    private LocalDate dateID;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = aLong;
    }

    public Voluntar() {
    }

    public Voluntar(Long userId, String city, String county) {
        this.userId = userId;
        this.city = city;
        this.county = county;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public Long getCNP() {
        return CNP;
    }

    public void setCNP(Long CNP) {
        this.CNP = CNP;
    }

    public String getNumberID() {
        return numberID;
    }

    public void setNumberID(String numberID) {
        this.numberID = numberID;
    }

    public LocalDate getDateID() {
        return dateID;
    }

    public void setDateID(LocalDate dateID) {
        this.dateID = dateID;
    }
}

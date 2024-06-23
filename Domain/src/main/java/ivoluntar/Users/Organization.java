package ivoluntar.Users;

import ivoluntar.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@jakarta.persistence.Entity
@Table(name = "organizations")
public class Organization implements Entity<Long> {

    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private Enum<TypeNGO> type;

    @Column(name = "registration_date")
    private LocalDate registrationDate;

    @Column(name = "id_code")
    private Integer id_code;

    @Column(name = "id_RAF")
    private Integer id_RAF;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "county")
    private String county;

    @Column(name = "acc_registration_date")
    private LocalDateTime acc_registration_date;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = aLong;
    }

    public Organization() {
    }

    public Organization(String name, Enum<TypeNGO> type, LocalDate registrationDate, Integer id_code, Integer id_RAF, String address, String city, String county) {
        this.name = name;
        this.type = type;
        this.registrationDate = registrationDate;
        this.id_code = id_code;
        this.id_RAF = id_RAF;
        this.address = address;
        this.city = city;
        this.county = county;
        this.acc_registration_date = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum<TypeNGO> getType() {
        return type;
    }

    public void setType(Enum<TypeNGO> type) {
        this.type = type;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDate registrationDate) {
        this.registrationDate = registrationDate;
    }

    public Integer getId_code() {
        return id_code;
    }

    public void setId_code(Integer id_code) {
        this.id_code = id_code;
    }

    public Integer getId_RAF() {
        return id_RAF;
    }

    public void setId_RAF(Integer id_RAF) {
        this.id_RAF = id_RAF;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public LocalDateTime getAcc_registration_date() {
        return acc_registration_date;
    }

    public void setAcc_registration_date(LocalDateTime acc_registration_date) {
        this.acc_registration_date = acc_registration_date;
    }
}

package ivoluntar.Users;

import ivoluntar.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "admin_ong")
public class AdminONG implements Entity<Long> {

    @Id
    @GeneratedValue(generator = "increment")
    private Long id;

    @Column(name = "id_user")
    private Long idUser;

    @Column(name = "id_ong")
    private Long idONG;

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long aLong) {
        this.id = aLong;
    }

}

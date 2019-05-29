package wojciech.aoi.api.dao.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Rower {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nazwa;

    private LocalDate dataprodukcji;

    public Rower() {
    }

    public Rower(Long id, String nazwa, LocalDate dataprodukcji) {
        this.id = id;
        this.nazwa = nazwa;
        this.dataprodukcji = dataprodukcji;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public LocalDate getDataprodukcji() {
        return dataprodukcji;
    }

    public void setDataprodukcji(LocalDate dataprodukcji) {
        this.dataprodukcji = dataprodukcji;
    }
}
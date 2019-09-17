package pl.kiebdaj.videoapp.dao.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class VideoCassette {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String director;
    private LocalDate productionYear;

    public VideoCassette() {
    }

    public VideoCassette(Long id, String title, String director, LocalDate productionYear) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.productionYear = productionYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(LocalDate productionYear) {
        this.productionYear = productionYear;
    }
}

package application.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="author")

public class Author implements Serializable {
    @Id
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String author;

    @ManyToMany
    @JoinTable(name="aut_tit",
        joinColumns = {@JoinColumn(name="id_aut")},
        inverseJoinColumns = {@JoinColumn(name="id_tit")})
    private List<Title> titles = new ArrayList<Title>();

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public int getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Author(int id, String author) {
        this.id = id;
        this.author = author;
    }

    public Author() {
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", author='" + author + '\'' +
                '}';
    }
}

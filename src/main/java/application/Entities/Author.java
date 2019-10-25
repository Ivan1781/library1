package application.Entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="author")

public class Author implements Serializable {
    @Id
    @Column(name="id")
    private int id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getId() == author.getId() &&
                Objects.equals(getName(), author.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Column(name="name")
    private String name;

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

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String author) {
        this.name = author;
    }

    public Author(int id, String author) {
        this.id = id;
        this.name = author;
    }

    public Author() {
    }





    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

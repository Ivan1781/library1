import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="title")

public class Title {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name="century" )
    private int century;

    @ManyToMany(mappedBy = "titles")
    private List<Author> authors = new ArrayList<Author>();

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCentury(int century) {
        this.century = century;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getCentury() {
        return century;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Title(int id, String title, int century) {
        this.id = id;
        this.title = title;
        this.century = century;
    }

    public Title() {
    }

    @Override
    public String toString() {
        return "Title{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", century=" + century +
                ", authors=" + authors +
                '}';
    }
}

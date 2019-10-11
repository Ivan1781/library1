import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory = null;

    public static SessionFactory buildSessionFactory(){
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        MetadataSources source = new MetadataSources(registry);
        source.addAnnotatedClass(Author.class);
        source.addAnnotatedClass(Title.class);
        SessionFactory sessionFactory = source.buildMetadata().buildSessionFactory();
        return sessionFactory;
    }

}

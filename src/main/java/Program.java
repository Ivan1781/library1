import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.query.sqm.tree.predicate.LikeSqmPredicate;
import org.hibernate.service.Service;
import org.hibernate.service.ServiceRegistry;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Program {
    public static void main(String[] args) throws Exception {

//        AutDao autDao = new AutDao();
//        List<Author> authors = autDao.getAll();
//        for(Author a: authors){
//            System.out.println(a);
//        }
//
//        autDao.remove(26);
//
//        List<Author> authorw = autDao.getAll();
//        for(Author a: authorw){
//            System.out.println(a);
//        }




//        try {
//            SessionFactory a = HibernateUtil.buildSessionFactory();
//            Session session = a.openSession();
//            Transaction transaction = session.beginTransaction();
//
//            Query query = session.createQuery("FROM Title");
//
//
//            List ttt = query.list();
//            System.out.println(ttt);
//
//
//            session.getTransaction().commit();
//            session.close();
//
//        }
//        catch (Exception e) {
//            System.out.println("AAAAAAAAA");
//
//
//        }
    }
}

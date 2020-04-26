package uk.co._4loop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import uk.co._4loop.model.Employee;

import java.util.List;

@SuppressWarnings("SyntaxError")
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private final SessionFactory sessionFactory;

    public EmployeeDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Employee> getEmployees() {
        Session currentSession = sessionFactory.getCurrentSession();

        Query<Employee> query = currentSession.createQuery("from Employee", Employee.class);

        return query.getResultList();
    }

    @Override
    public List<Employee> getEmployeeByID(int id) {
        Session currentSession = sessionFactory.getCurrentSession();

         Query<Employee> query = currentSession.createQuery("from Employee where id=:id", Employee.class);
        query.setParameter("id", id);

        return query.getResultList();
    }

    @Override
    public boolean saveEmployee(Employee employee) {

        try {
            sessionFactory.getCurrentSession().save(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateEmployee(Employee employee) {

        try {
            sessionFactory.getCurrentSession().update(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteEmployee(Employee employee) {
        try {
            sessionFactory.getCurrentSession().delete(employee);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


}

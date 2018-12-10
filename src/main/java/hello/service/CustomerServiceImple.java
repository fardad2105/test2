package hello.service;

import hello.tables.daos.CustomerDao;
import hello.tables.daos.RentalDao;
import hello.tables.pojos.Customer;
import hello.tables.pojos.Film;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CustomerServiceImple extends AbstractService<Customer> {


    @Autowired
    DSLContext dsl;


    CustomerDao customerDao = new CustomerDao(this.configuration);

    @Override
    public boolean save(Customer customer) {
        return super.save(customer);
    }

    @Override
    public Customer find(int id) {
        return super.find(id);
    }


    public Customer findByEmail(String email)
    {
        return customerDao.fetchOneByEmail(email);
    }

    @Override
    public List<Customer> findAll() {
        return super.findAll();
    }

    @Override
    public List<Customer> findEntries(int firstResult, int maxResults) {
        return super.findEntries(firstResult, maxResults);
    }

    @Override
    public long countAll() {
        return super.countAll();
    }

    @Override
    public Customer update(Customer customer) {
        return super.update(customer);
    }

    @Override
    public void delete(Customer customer) {
        super.delete(customer);
    }
}

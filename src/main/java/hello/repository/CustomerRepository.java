package hello.repository;

import hello.domain.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by hongpf on 16/4/15.
 */
public interface CustomerRepository extends MongoRepository<Customer,Long > {
    public Customer findByFirstName(String firstName);
    public List<Customer> findByLastName(String lastName);
}

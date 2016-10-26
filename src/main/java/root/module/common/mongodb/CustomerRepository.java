package root.module.common.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by m on 2016/10/26.
 */
public interface CustomerRepository extends MongoRepository<Customer, String> {
    public Customer findByFirstName(String firstName);

    public List<Customer> findByLastName(String lastName);
}

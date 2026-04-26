package br.com.pferreira.customer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pedro Ferreira
 */

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
}

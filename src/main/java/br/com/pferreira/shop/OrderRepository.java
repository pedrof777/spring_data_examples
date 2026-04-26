package br.com.pferreira.shop;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Pedro Ferreira
 */

@Repository
public interface OrderRepository extends CrudRepository<Order, String> {
}

package br.com.pferreira;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import br.com.pferreira.customer.Customer;
import br.com.pferreira.customer.CustomerRepository;
import br.com.pferreira.shop.LineItem;
import br.com.pferreira.shop.Order;
import br.com.pferreira.shop.OrderRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.data.geo.Point;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;
import org.springframework.data.mongodb.repository.query.MongoEntityInformation;
import org.springframework.data.repository.support.Repositories;
import org.springframework.test.context.junit4.SpringRunner;



/**
 * @author Pedro Ferreira
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationConfigurationTest {

  @Autowired ApplicationContext context;

  @Autowired
  OrderRepository orderRepository;

  @Autowired
  CustomerRepository customerRepository;

  @Test
  public void repositoriesAreAssignedToAppropriateStores(){
    Repositories repositories = new Repositories(context);

    assertThat(repositories.getEntityInformationFor(Customer.class)).isInstanceOf(JpaEntityInformation.class);
    assertThat(repositories.getEntityInformationFor(Order.class)).isInstanceOf(MongoEntityInformation.class);
  }

  @Test
  public void cadastrarMongo(){
    LineItem item = new LineItem("t1", 1);
    Order order = new Order("1", new Date().from(Instant.now()), Arrays.asList(item));
    Order newOrder = orderRepository.save(order);
    assertNotNull(newOrder);
  }

}

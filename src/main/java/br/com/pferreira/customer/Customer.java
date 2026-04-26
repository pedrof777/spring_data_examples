package br.com.pferreira.customer;

import lombok.Data;
import org.springframework.util.Assert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Pedro Ferreira
 */

@Data
@Entity
public class Customer {

  private @Id @GeneratedValue Long id;
  private String firstName, lastName;

  private Adress address;

  public  Customer(String firstName, String lastName){
    Assert.hasText(firstName,"O primeiro nome não pode ser nulo ou vazio!");
    Assert.hasText(firstName,"O segundo nome não pode ser nulo ou vazio!");

    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Customer(String firstName, String lastName, Adress adress){
    Assert.hasText(firstName,"O primeiro nome não pode ser nulo ou vazio!");
    Assert.hasText(firstName,"O segundo nome não pode ser nulo ou vazio!");
    Assert.notNull(adress, "Endereço não pode ser nulo ou vazio!");

    this.firstName = firstName;
    this.lastName = lastName;
    this.address = adress;
  }

  protected  Customer(){}
}

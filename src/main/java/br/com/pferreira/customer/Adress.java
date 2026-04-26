package br.com.pferreira.customer;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.geo.Point;

import javax.persistence.Embeddable;

/**
 * @author Pedro Ferreira
 */

@Getter
@Setter
@RequiredArgsConstructor
@Embeddable
public class Adress {

  private Point location;
  private String street;
  private String zipCode;

  public Point getLocation() {
    return location;
  }

  public void setLocation(Point location) {
    this.location = location;
  }

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }
}

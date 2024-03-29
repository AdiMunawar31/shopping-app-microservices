package com.d2y.orderservice.models;

import java.math.BigDecimal;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "t_order_line_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItems {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String skuCode;
  private BigDecimal price;
  private Integer quantity;

}

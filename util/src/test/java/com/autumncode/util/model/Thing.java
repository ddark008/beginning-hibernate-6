package com.autumncode.util.model;

import lombok.Data;

import jakarta.persistence.*;

@Entity(name = "Thing")
@Data
public class Thing {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Integer id;
  @Column
  String name;
}

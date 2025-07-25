package com.exampleEmployee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="employee")
public class Employee {

    @Id
    private Long id;
    @Column(nullable = false , length = 50)
    private String Name;
    private int Phone;
    private String Email;
    private String Location;

}

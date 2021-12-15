package com.lecture.car_rental.domain;

import com.lecture.car_rental.domain.enumeration.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="roles")
public class Role implements Serializable {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id; //roller sinirli oldugu icin ınteger belirledik

   @Enumerated(EnumType.STRING)
   @Column(length=30) //   @Column(length=30,name = "user_role") defaultu UserRole'u big harften ayiriyor
   private UserRole name;
}

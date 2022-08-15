package com.bernardofmf.springdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * With the entity annotation the entity can interact with the database
 * Data makes it so we don't need to add boilerplate (getters, setters, ctors)
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    /**
     * Examples of annotations to validade data
     *     @Length(max = 5, min = 1)
     *     @Size(max = 10, min = 0)
     *     @Email
     *     @Positive
     *     @Negative
     *     @PositiveOrZero
     *     @NegativeOrZero
     *     @Future
     *     @FutureOrPresent
     *     @Past
     *     @PastOrPresent
     */
    @NotBlank(message = "Missing property: departmentName")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}

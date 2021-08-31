/*
 * Tonderai Muchada
 * Copyright (c) 12/08/2020, 19:55.
 */

package service;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "service")
public class Service {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "service_id")
    private Long id;
    @Column(name = "service_name", nullable = false)
    private String name;
    @Column(name = "location", nullable = false)
    private String location;
    @Column(name = "pricing", nullable = false)
    private String pricing;
    @Column(name = "date_created", nullable = false)
    private LocalDate dateCreated;
    @Column(name = "date_modified", nullable = false)
    private LocalDate dateModified;
    @Column(name = "is_admin", nullable = false)
    private Boolean isAdmin;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}

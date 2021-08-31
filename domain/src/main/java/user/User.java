/*
 * Tonderai Muchada
 * Copyright (c) 12/08/2020, 19:56.
 */

package user;

import javax.persistence.*;

import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "user_name", nullable = false)
    private String name;
    @Column(name = "passkey", nullable = false)
    private String passkey;
    @Column(name = "date_created", nullable = false)
    private LocalDate dateCreated;
    @Column(name = "date_modified", nullable = false)
    private LocalDate dateModified;
    @Column(name = "is_admin", nullable = false)
    private Boolean isAdmin;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;

    public User(String name, String passkey, LocalDate dateCreated, LocalDate dateModified, Boolean isAdmin,
                Boolean isActive) {
        this.name = name;
        this.passkey = passkey;
        this.dateCreated = dateCreated;
        this.dateModified = dateModified;
        this.isAdmin = isAdmin;
        this.isActive = isActive;
    }
}

/*
 * Tonderai Muchada
 * Copyright (c) 12/08/2020, 19:56.
 */

package subcategory;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "subCategories")
public class SubCategory {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "sub_category_id")
    private Long id;
    @Column(name = "sub_category_name", nullable = false)
    private String name;
    @Column(name = "date_created", nullable = false)
    private LocalDate dateCreated;
    @Column(name = "date_modified", nullable = false)
    private LocalDate dateModified;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}

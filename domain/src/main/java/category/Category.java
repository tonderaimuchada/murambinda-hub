package category;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "category_id")
    private Long id;
    @Column(name = "category_name", nullable = false)
    private String name;
    @Column(name = "date_created", nullable = false)
    private LocalDate dateCreated;
    @Column(name = "date_modified", nullable = false)
    private LocalDate dateModified;
    @Column(name = "is_active", nullable = false)
    private Boolean isActive;
}

/*
 * Tonderai Muchada
 * Copyright (c) 31/08/2020, 03:25.
 */

package zw.co.murambindahub;

import category.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}

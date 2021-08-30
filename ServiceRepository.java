/*
 * Tonderai Muchada
 * Copyright (c) 31/08/2020, 03:22.
 */

package zw.co.murambindahub;

import org.springframework.data.jpa.repository.JpaRepository;
import service.Service;

public interface ServiceRepository extends JpaRepository<Service, Long> {
}

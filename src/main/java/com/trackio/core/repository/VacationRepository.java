package com.trackio.core.repository;

import com.trackio.core.domain.Vacation;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author jsingh on 2/13/2014
 */
public interface VacationRepository extends CrudRepository<Vacation, Long> {

    List<Vacation> findByVacationId(long vacationId);
}

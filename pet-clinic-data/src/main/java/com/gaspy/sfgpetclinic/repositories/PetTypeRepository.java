package com.gaspy.sfgpetclinic.repositories;

import com.gaspy.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}

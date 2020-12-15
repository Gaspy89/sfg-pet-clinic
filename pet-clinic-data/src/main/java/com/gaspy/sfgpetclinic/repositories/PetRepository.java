package com.gaspy.sfgpetclinic.repositories;

import com.gaspy.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

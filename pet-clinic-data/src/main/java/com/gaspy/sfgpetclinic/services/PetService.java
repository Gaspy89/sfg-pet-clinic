package com.gaspy.sfgpetclinic.services;

import com.gaspy.sfgpetclinic.model.Owner;
import com.gaspy.sfgpetclinic.model.Pet;
import java.util.Set;

public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}

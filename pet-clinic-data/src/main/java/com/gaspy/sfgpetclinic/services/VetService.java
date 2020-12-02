package com.gaspy.sfgpetclinic.services;

import com.gaspy.sfgpetclinic.model.Owner;
import com.gaspy.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Owner save(Vet vet);
    Set<Vet> findAll();
}

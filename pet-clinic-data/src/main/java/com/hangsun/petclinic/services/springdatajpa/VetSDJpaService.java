package com.hangsun.petclinic.services.springdatajpa;

import com.hangsun.petclinic.model.Vet;
import com.hangsun.petclinic.repositories.VetRespority;
import com.hangsun.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VetSDJpaService implements VetService {

    private final VetRespority vetRespority;

    public VetSDJpaService(VetRespority vetRespority) {
        this.vetRespority = vetRespority;
    }

    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRespority.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Long id) {
        return vetRespority.findById(id).orElse(null);
    }

    @Override
    public Vet save(Vet vet) {
        return vetRespority.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRespority.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRespority.deleteById(id);
    }
}

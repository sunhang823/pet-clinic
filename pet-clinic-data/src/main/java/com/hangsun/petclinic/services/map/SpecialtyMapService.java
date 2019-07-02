package com.hangsun.petclinic.services.map;

import com.hangsun.petclinic.model.Specialty;
import com.hangsun.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SpecialtyMapService extends AbstractMapService<Specialty, Long> implements SpecialtyService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Specialty save(Specialty speciality) {
        return super.save(speciality);
    }

    @Override
    public void delete(Specialty speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);

    }
}

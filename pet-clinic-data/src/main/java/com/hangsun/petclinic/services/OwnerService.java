package com.hangsun.petclinic.services;

import com.hangsun.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);
}

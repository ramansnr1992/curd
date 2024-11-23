package com.curdsample.in.repository;

import org.springframework.data.repository.CrudRepository;

import com.curdsample.in.model.Location;

public interface LocationRepository extends CrudRepository<Location, Long> {

}

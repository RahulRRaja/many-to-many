package com.many.manytomany.repository;

import com.many.manytomany.model.Stream;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StreamRepository extends CrudRepository<Stream,Long> {
}

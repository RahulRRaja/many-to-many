package com.many.manytomany.repository;

import com.many.manytomany.model.Viewer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewerRepository extends CrudRepository<Viewer,Long> {
}

package com.aw.csr.csrrest.repo;

import com.aw.csr.csrrest.entity.SiteUser;
import java.util.List;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<SiteUser, Long> {

  List<SiteUser> findByName(@Param("name") String name);
}

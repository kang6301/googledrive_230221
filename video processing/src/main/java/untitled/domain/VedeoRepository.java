package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(collectionResourceRel = "vedeos", path = "vedeos")
public interface VedeoRepository
    extends PagingAndSortingRepository<Vedeo, Long> {}

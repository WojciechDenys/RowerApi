package wojciech.aoi.api.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import wojciech.aoi.api.dao.entity.Rower;

@Repository
public interface RowerRepository extends CrudRepository<Rower, Long> {
}

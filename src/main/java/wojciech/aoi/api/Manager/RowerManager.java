package wojciech.aoi.api.Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import wojciech.aoi.api.dao.RowerRepository;
import wojciech.aoi.api.dao.entity.Rower;

import java.time.LocalDate;
import java.util.Optional;


@Service
public class RowerManager {

    private RowerRepository rowerRepository;

    @Autowired
    public RowerManager(RowerRepository rowerRepository) {
        this.rowerRepository = rowerRepository;
    }

    public Optional<Rower> findByid(Long id) {
        return rowerRepository.findById(id);
    }

    public Iterable<Rower> findAll() {
        return rowerRepository.findAll();
    }

    public Rower save(Rower rower) {
        return rowerRepository.save(rower);
    }

    public void deleteByID(Long id) {
        rowerRepository.deleteById(id);
    }
    @EventListener(ApplicationReadyEvent.class)
    public void fillDB() {
        save(new Rower(1L, "R213et", LocalDate.of(2019, 1, 2)));
        save(new Rower(2L, "Gi213", LocalDate.of(2009, 2, 4)));

    }
}


package wojciech.aoi.api.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import wojciech.aoi.api.Manager.RowerManager;
import wojciech.aoi.api.dao.entity.Rower;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/rowery")
public class RowerApi {


private RowerManager Rowery;
    @Autowired
    public RowerApi(RowerManager rowerManager) {
        this.Rowery = Rowery;
    }

    @GetMapping("all")
    public Iterable<Rower> giveItAll(){
        return Rowery.findAll();
    }

    @GetMapping
    public Optional<Rower> getById(@RequestParam Long index) {
        return Rowery.findByid(index);

    }

    @PostMapping
    public Rower addRower(@RequestBody Rower rower){
        return Rowery.save(rower);
    }


    @PutMapping
    public Rower updateRower(@RequestBody Rower rower){
        return Rowery.save(rower);
    }
    @DeleteMapping
    public void deleteRower(@RequestParam Long index){
         Rowery.deleteByID(index);
    }
}


package com.audit;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audit.dao.PvRepository;
import com.audit.model.ManPower;

@RestController
@RequestMapping("/audit")
@CrossOrigin(origins = "*")
public class AuditController {

	@Autowired
    DataSource dataSource;

    @Autowired
    PvRepository pvRepository;
    
    @GetMapping("/getManPower")
    String getManPower(String tlPune) {
    	List<ManPower> manPowerList = pvRepository.findAll(); 
    	System.out.println("tlPune = " + tlPune);
    	return "The state of " + tlPune + "is " +  manPowerList.get(0).getState();
    }
    
    @PostMapping("/saveManPower")
    ManPower saveManPower(ManPower manPower) {
    	return pvRepository.save(manPower); 
    }
}

package hairpin.demo.service;

import hairpin.demo.repository.CourtRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourtService {

    @Autowired
    private CourtRepository courtRepository;
}

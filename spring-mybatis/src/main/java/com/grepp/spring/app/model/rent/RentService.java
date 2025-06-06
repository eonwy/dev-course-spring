package com.grepp.spring.app.model.rent;

import com.grepp.spring.app.model.rent.dto.Rent;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Slf4j
public class RentService {

    private final RentRepository rentRepository;

    @Transactional
    public List<Rent> selectAll() {
        List<Rent> rents = rentRepository.selectAll();
        return rents;
    }
}

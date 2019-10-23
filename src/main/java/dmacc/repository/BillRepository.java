package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.entities.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}

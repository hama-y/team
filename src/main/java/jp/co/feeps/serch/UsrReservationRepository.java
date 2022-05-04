package jp.co.feeps.serch;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface UsrReservationRepository extends
    JpaRepository<UsrReservation, Integer>, JpaSpecificationExecutor<UsrReservation> {
}
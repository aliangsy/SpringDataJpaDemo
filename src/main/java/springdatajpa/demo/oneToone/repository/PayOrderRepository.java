package springdatajpa.demo.oneToone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springdatajpa.demo.oneToone.domain.PayOrder;

import java.util.Optional;

public interface PayOrderRepository extends JpaRepository<PayOrder,String> {
    Optional<PayOrder> findByOutradeno(String out_trade_no);
}

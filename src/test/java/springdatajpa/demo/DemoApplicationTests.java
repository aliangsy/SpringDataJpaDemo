package springdatajpa.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import springdatajpa.demo.oneToone.domain.PayOrder;
import springdatajpa.demo.oneToone.repository.PayOrderRepository;

import java.util.Optional;

@SpringBootTest
class DemoApplicationTests {
@Autowired
private PayOrderRepository payOrderRepository;
    @Test
    void contextLoads() {
        Optional<PayOrder> byOutradeno = payOrderRepository.findByOutradeno("20200211192109741");
        System.out.println(byOutradeno.get().getPayTokens());
        System.out.println(byOutradeno.get().getTrxid());
    }

}

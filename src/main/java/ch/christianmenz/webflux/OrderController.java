package ch.christianmenz.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/orders")
public class OrderController {

    @GetMapping("/{id}")
    public Mono<Order> findOrder(@PathVariable String id) {
        Order order = new Order();
        order.setId("1983");
        order.setName("Christian Menz");
        return Mono.just(order);
    }

}

package br.com.workshop.repositories;


import br.com.workshop.entities.OrderItem;
import br.com.workshop.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}

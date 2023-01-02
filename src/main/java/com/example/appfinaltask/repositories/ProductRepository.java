package com.example.appfinaltask.repositories;

import com.example.appfinaltask.data.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/** Интерфейс ProductRepository реализующий взаимодействие с классом Product
 * @author Dmytro Tatarynov <dmytro.course@gmail.com>
 * @version 3.0
 * @see JpaRepository
 * */

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitle(String title);
}

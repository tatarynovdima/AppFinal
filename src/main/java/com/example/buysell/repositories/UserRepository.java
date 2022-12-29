package com.example.buysell.repositories;

import com.example.buysell.data.User;
import org.springframework.data.jpa.repository.JpaRepository;


/** Интерфейс UserService реализующий взаимодействие с классом User
 * @author Dmytro Tatarynov <dmytro.course@gmail.com>
 * @version 3.0
 * @see JpaRepository
 * */

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}

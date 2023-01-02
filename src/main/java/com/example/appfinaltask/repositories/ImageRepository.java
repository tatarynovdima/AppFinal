package com.example.appfinaltask.repositories;

import com.example.appfinaltask.data.Image;
import org.springframework.data.jpa.repository.JpaRepository;

/** Интерфейс ImageRepository реализующий взаимодействие с классом Image
 * @author Dmytro Tatarynov <dmytro.course@gmail.com>
 * @version 3.0
 * @see UserRepository
 * */

public interface ImageRepository extends JpaRepository<Image, Long> {
}

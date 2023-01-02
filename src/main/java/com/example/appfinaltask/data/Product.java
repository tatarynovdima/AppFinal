package com.example.appfinaltask.data;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


/** Класс описывающий сущность Product
 * @author Dmytro Tatarynov <dmytro.course@gmail.com>
 * @version 3.0
 * */

@Entity
@Table(name = "products")
@Data
public class Product {

    /** Поле индификатора */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Поле заголовка товара */
    private String title;

    /** Поле описания товара */
    private String description;

    /** Поле цены товара */
    private Integer price;

    /** Поле города из которого продается товар */
    private String city;

    /** Поле лист картинок */
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
    mappedBy = "product")
    private List<Image> images = new ArrayList<>();
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.LAZY)
    @JoinColumn
    private User user;

    /** Поле заглавной картинки для продукта */
    private Long previewImageId;

    /** Поле даты создания товара */
    private LocalDateTime dateOfCreated;

    @PrePersist
    private void onCreate() { dateOfCreated = LocalDateTime.now(); }

    /**
     * Метод назначения фотографии товару, устанавливаем текущию картинку
     * и добавляем в колекцию с изображениями
     * @param image картинку
     */
    public void addImageToProduct(Image image) {
        image.setProduct(this);
        images.add(image);
    }
}

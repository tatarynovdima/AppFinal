package com.example.appfinaltask.data;

import javax.persistence.*;

/** Класс описывающий сущность Image
 * @author Dmytro Tatarynov <dmytro.course@gmail.com>
 * @version 3.0
 * */


@Entity
@Table(name = "images")
public class Image {
    /** Поле индификатора */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /** Поле имени файла */
    private String name;

    /** Поле имени файла */
    private String originalFileName;

    /** Поле размера файла */
    private Long size;

    /** Поле расширение файла */
    private String contentType;

    /** Поле заглавной картинки для продукта */
    private boolean previewImage;

    /** Поле массива байтов для картинки */
    @Lob
    //@Column(columnDefinition = "LONGBLOB")
    private byte[] bytes;
    @ManyToOne(cascade = CascadeType.REFRESH, fetch = FetchType.EAGER)
    private Product product;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalFileName() {
        return originalFileName;
    }

    public void setOriginalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public boolean isPreviewImage() {
        return previewImage;
    }

    public void setPreviewImage(boolean previewImage) {
        this.previewImage = previewImage;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

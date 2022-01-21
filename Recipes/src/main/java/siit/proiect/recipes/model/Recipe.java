package siit.proiect.recipes.model;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Date;

@Entity
public class Recipe {

    @Id
    @GeneratedValue
    private Long id;


    @Size(min = 4, max = 100, message = "Min 4, Max 30 characters")
    private String name;

    @Size(min = 20, max = 100, message = "Min 20, Max 50 characters")
    private String description;
    @Size(min = 20, max = 1000, message = "Min 20, Max 1000 characters")
    private String ingredients;
    @Size(min = 20, max = 1000, message = "Min 20, Max 1000 characters")
    private String directions;

    @NotEmpty
    @Lob
    private byte[] image;


    private Category category;

    @Column(updatable = false)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date created;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date lastModify;

    public Recipe() {

    }


    public Recipe(String name, String description, String ingredients, String directions, byte[] image, Category category) {
        this.name = name;
        this.description = description;
        this.ingredients = ingredients;
        this.directions = directions;
        this.image = image;
        this.category = category;
    }


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

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getImage() {
        if (image != null) {
            try {
                return new String(Base64.encodeBase64(image), "UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public void setImage(MultipartFile image) {
        try {
            this.image = image.getBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setLastModify(Date lastModify) {
        this.lastModify = lastModify;
    }

    public Date getLastModify() {
        return lastModify;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

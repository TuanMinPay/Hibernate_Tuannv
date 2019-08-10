package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
@Table(name = "phones")
public class Phone {
    @Id
    private long id;
    private String name;
    private String brand;
    private float price;
    private String description;
    private long createdAt;
    private long updatedAt;
    private int status;

    public Phone() {
        this.createdAt = Calendar.getInstance().getTimeInMillis();
        this.updatedAt = Calendar.getInstance().getTimeInMillis();
        this.status = 1;
    }

    public long getId() {
        return id;
    }

    public Phone setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Phone setName(String name) {
        this.name = name;
        return this;
    }

    public String getBrand() {
        return brand;
    }

    public Phone setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Phone setPrice(float price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Phone setDescription(String description) {
        this.description = description;
        return this;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public Phone setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public Phone setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public int getStatus() {
        return status;
    }

    public Phone setStatus(int status) {
        this.status = status;
        return this;
    }

    public static final class Builder {
        private long id;
        private String name;
        private String brand;
        private float price;
        private String description;
        private long createdAt;
        private long updatedAt;
        private int status;

        private Builder() {
        }

        public static Builder aPhone() {
            return new Builder();
        }

        public Builder withId(long id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder withPrice(float price) {
            this.price = price;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withCreatedAt(long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder withUpdatedAt(long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Builder withStatus(int status) {
            this.status = status;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBrand(brand);
            phone.setPrice(price);
            phone.setDescription(description);
            phone.setCreatedAt(createdAt);
            phone.setUpdatedAt(updatedAt);
            phone.setStatus(status);
            return phone;
        }
    }
}

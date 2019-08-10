package entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Calendar;

@Entity
@Table(name = "brands")
public class Brand {
    @Id
    private long id;
    private String name;
    private long createdAt;
    private long updatedAt;
    private int status;

    public Brand() {
        this.createdAt = Calendar.getInstance().getTimeInMillis();
        this.updatedAt = Calendar.getInstance().getTimeInMillis();
        this.status = 1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public static final class Builder {
        private long id;
        private String name;
        private long createdAt;
        private long updatedAt;
        private int status;

        private Builder() {
        }

        public static Builder aBrand() {
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

        public Brand build() {
            Brand brand = new Brand();
            brand.setId(id);
            brand.setName(name);
            brand.setCreatedAt(createdAt);
            brand.setUpdatedAt(updatedAt);
            brand.setStatus(status);
            return brand;
        }
    }
}

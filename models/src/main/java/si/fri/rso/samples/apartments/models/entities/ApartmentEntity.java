package si.fri.rso.samples.apartments.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "apartments")
@NamedQueries(value =
        {
                @NamedQuery(name = "ApartmentEntity.getAll",
                        query = "SELECT a FROM ApartmentEntity a")
        })
public class ApartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "email")
    private String email;

    @Column(name = "description", length = 1024)
    private String description;

    @Column(name = "tenantID")
    private int tenantId;

    @Column(name = "location")
    private String location;

    @Column(name = "capacity")
    private int capacity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
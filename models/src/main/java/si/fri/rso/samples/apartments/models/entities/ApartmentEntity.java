package si.fri.rso.samples.apartments.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "apartment")
@NamedQueries(value =
        {
                @NamedQuery(name = "Apartment.getAll",
                        query = "SELECT a FROM Apartment a")
        })
public class ApartmentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private String title;

    @Column(name = "tenantID")
    private String tenantId;

    @Column(name = "location")
    private String location;

    @Column(name = "capacity")
    private Integer capacity;

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

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
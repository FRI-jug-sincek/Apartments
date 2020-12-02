package si.fri.rso.samples.imagecatalog.models.converters;

import si.fri.rso.samples.imagecatalog.lib.Apartment;
import si.fri.rso.samples.imagecatalog.models.entities.ApartmentEntity;

public class ApartmentConverter {

    public static Apartment toDto(ApartmentEntity e) {

        Apartment a = new Apartment();
        a.setId(e.getId());
        a.setTitle(e.getTitle());
        a.setTenantId(e.getTenantId());
        a.setLocation(e.getLocation());
        a.setCapacity(e.getCapacity());

        return a;
    }

    public static ApartmentEntity toEntity(Apartment a) {

        ApartmentEntity e = new ApartmentEntity();

        e.setId(a.getId());
        e.setTitle(a.getTitle());
        e.setTenantId(a.getTenantId());
        e.setLocation(a.getLocation());
        e.setCapacity(a.getCapacity());

        return e;
    }

}

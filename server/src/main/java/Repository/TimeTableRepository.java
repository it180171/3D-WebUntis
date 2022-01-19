package Repository;


import Entity.Timetable;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TimeTableRepository implements PanacheRepositoryBase<Timetable, Long> {


}

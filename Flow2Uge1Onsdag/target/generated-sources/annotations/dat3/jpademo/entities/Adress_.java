package dat3.jpademo.entities;

import dat3.jpademo.entities.Adress;
import dat3.jpademo.entities.Person;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-11-01T18:54:42")
@StaticMetamodel(Adress.class)
public class Adress_ { 

    public static volatile SingularAttribute<Adress, Integer> zip;
    public static volatile SingularAttribute<Adress, Long> a_id;
    public static volatile SingularAttribute<Adress, String> city;
    public static volatile SingularAttribute<Adress, String> street;
    public static volatile SingularAttribute<Adress, Person> person;
    public static volatile SingularAttribute<Adress, Adress> adress;

}
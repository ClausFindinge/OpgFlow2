package facades;

import entities.Person;
import java.util.List;
import utils.EMF_Creator;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//Uncomment the line below, to temporarily disable this test
//@Disabled
public class PersonFacadeTest {

    private static EntityManagerFactory emf;
    private static PersonFacade facade;
private static Person p1, p2, p3;
    
    public PersonFacadeTest() {
    }

    @BeforeAll
    public static void setUpClass() {
       emf = EMF_Creator.createEntityManagerFactoryForTest();
       facade = PersonFacade.getFacadeExample(emf);
    }

    @AfterAll
    public static void tearDownClass() {
//        Clean up database after test is done or use a persistence unit with drop-and-create to start up clean on every test
    }

    // Setup the DataBase in a known state BEFORE EACH TEST
    //TODO -- Make sure to change the script below to use YOUR OWN entity class
    @BeforeEach
    public void setUp() {
        EntityManager em = emf.createEntityManager();
        p1 = new Person("Paul", "McCartney", "32455667");
          p2 = new Person("John", "Lennon", "98877665");
            p3 = new Person("Tove", "Ditlevsen", "66667777");
        try {
            em.getTransaction().begin();
            em.createNamedQuery("Person.deleteAllRows").executeUpdate();
            em.persist((p1));
            em.persist((p2));
            em.persist((p3));

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    @AfterEach
    public void tearDown() {
//        Remove any data after each test was run
    }

    // TODO: Delete or change this method 
    @Test
    public void testAllFacadeMethod() {
        assertEquals(3, facade.getPersonCount(), "Expects two rows in the database");
    }

    @Test
    public void testGetPerson(){
        Person person = facade.getPerson(p1.getId());
        assertEquals("Paul", person.getFirstname(), "Except to find Paul");
}
    @Test
    public void testAddPerson(){
        Person p = facade.addPerson("Yoko", "Ono", "674509");
        assertNotNull(p.getId());
    } 
    

 @Test
    public void testDeletePerson(){
        long p1Id = p1.getId();
        facade.deletePerson(p1.getId());
        EntityManager em = emf.createEntityManager();
        try {
        List<Person> persons = em.createQuery("select p from Person p").getResultList();
        persons = em.createQuery("select p from Person p WHERE p.id = :id").getResultList();
        assertEquals(2, persons.size(),"Expecting 2 persons in the DB" + p1Id);
        persons = em.createQuery("select p from Person p WHERE p.id = :id").getResultList();
        assertEquals(0, persons.size(),"Expecting 2 persons in the DB" + p1Id);

        } finally {
            em.close();
        }
            
        }

    @Test
    public void testEditPerson(){
   
        p3.setLastname("Hansen");
        Person p1New = facade.editPerson(p3);
        assertEquals(p1New.getLastname(), p3.getLastname());
        assertNotEquals(p3.getLastname(), "Jensen");
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import dtomappers.PersonDTO;
import entities.Person;
import java.util.List;

/**
 *
 * @author Bruger
 */
public interface IPersonFacade {
     
  public Person addPerson(String fName, String lName, String phone);  
  public Person deletePerson(long id);  
  public Person getPerson(long id);  
  public List<Person> getAllPersons();  
  public Person editPerson(Person p);  


    
}

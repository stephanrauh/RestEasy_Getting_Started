package de.beyondjava.rest.restEasyGettingStarted;

import java.util.Date;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class User {
   private Date dob;
   private String email;
   private Integer id;
   private String name;

   /**
    * 
    */
   public User() {
   }

   /**
    * @param i
    * @param string
    * @param string2
    * @param date
    */
   public User(int id, String name, String email, Date dob) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.dob = dob;
   }

   /**
    * @return the dob
    */
   public Date getDob() {
      return dob;
   }

   /**
    * @return the email
    */
   public String getEmail() {
      return email;
   }

   /**
    * @return the id
    */
   public Integer getId() {
      return id;
   }

   /**
    * @return the name
    */
   public String getName() {
      return name;
   }

   /**
    * @param dob
    *           the dob to set
    */
   public void setDob(Date dob) {
      this.dob = dob;
   }

   /**
    * @param email
    *           the email to set
    */
   public void setEmail(String email) {
      this.email = email;
   }

   /**
    * @param id
    *           the id to set
    */
   public void setId(Integer id) {
      this.id = id;
   }

   /**
    * @param name
    *           the name to set
    */
   public void setName(String name) {
      this.name = name;
   }
}

package serialize;

import java.io.*;

import serialize.Employee;

public class SerializeDemo {

	   public static void main(String [] args) {
	      Employee e = new Employee();
	      String name = "Reyan Ali";
	      String address = "Phokka Kuan, Ambehta Peer";
	      int SSN = 11122333;
	      int number = 101;
	      e.setName(name); 
	      e.setAddress(address);
	      e.setSSN(SSN);
	      e.setNumber(number);
	      
	      try {
	         FileOutputStream fileOut = new FileOutputStream("./employee.ser");
	         ObjectOutputStream out = new ObjectOutputStream(fileOut);
	         out.writeObject(e);
	         out.close();
	         fileOut.close();
	         System.out.printf("Serialized data is saved in /tmp/employee.ser");
	      } catch (IOException i) {
	         i.printStackTrace();
	      }
	   }
	}
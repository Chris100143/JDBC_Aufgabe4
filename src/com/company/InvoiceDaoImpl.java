/**
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 24.08.2021
 */

package com.company;

public class InvoiceDaoImpl {

    public static void main(String[] args) {

        //Objekt instanziieren
        Student student1 = new Student();

        student1.setName("Christoph");
        student1.setRollNo("1");

        //Ausgabe
        System.out.println("Student" + "\n" + "Name: " + "\t" + student1.getName() + "\n" + "Rollennummer: " + "\t" + student1.getRollNo());
    }
}

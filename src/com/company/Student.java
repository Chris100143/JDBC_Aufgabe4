/**
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 24.08.2021
 */

package com.company;

//Klasse
public class Student {

    //Eigenschaften
    private String name;
    private int rollNo;

    //Konstruktor
    public Student() {
    }

    //Methoden
    /**
     *
     * @return - Gibt den Namen zurück
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name - Setzt den Namen
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return - Gibt die Rollennummer zurück
     */
    public int getRollNo() {
        return rollNo;
    }

    /**
     *
     * @param rollNo - Setzt die Rollennummer
     */
    public String setRollNo(String rollNo) {
        this.rollNo = Integer.parseInt(rollNo);

        return rollNo;
    }
}

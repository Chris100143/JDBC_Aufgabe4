/**
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 24.08.2021
 */

package com.company;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    //Eigenschaften
    private List<Student> students;

    //Konstruktor
    public StudentDaoImpl() {
    }

    //Methoden
    /**
     *
     * @param students - die Studenten in der Liste
     * @return - returned die Liste
     */
    @Override
    public List<Student> getAllStudents(List<Student> students) {
        return students;
    }

    @Override
    public void updateStudentl() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void addStudent() {

    }
}

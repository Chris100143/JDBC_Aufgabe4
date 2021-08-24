/**
 * @author Christoph Lottersberger
 * @version 1.0.0
 * @since 24.08.2021
 */

package com.company;

import java.util.List;

public interface StudentDao {

    //Methoden
    /**
     *
     * @param students - die Studenten in der Liste
     * @return - returned die Liste
     */
    public List<Student> getAllStudents(List<Student> students);
    public void updateStudentl();
    public void deleteStudent();
    public void addStudent();
}

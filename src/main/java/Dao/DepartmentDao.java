package Dao;

import models.Department;
import java.util.List;

public interface DepartmentDao {

//create
    void add(Department department);
    //void addDepartmentToNews

    //read
    List<Department> getAll();
    // List<Department> getAllDepartments

    //update

    //delete
    void deleteById(int id);
    void clearAll();
}

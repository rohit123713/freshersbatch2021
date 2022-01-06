package com.example.demo.ifaces;

import java.sql.Date;
import java.util.List;

public interface EmployeeRepository<T> extends Crudrepository<T> {

       public List<T> findBybirthday(Date date);
       public List<T> findByweddinganniversary(Date date);
}

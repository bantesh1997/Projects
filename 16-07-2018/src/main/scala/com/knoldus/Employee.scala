package com.knoldus

class Employee {
  def findEmployees(employee :Map[Int, Double]) :Set[Int] = {

    val filteredEmployees = employee.filter(emp => emp._2 > 35000.0 && (emp._2 * 0.75) > 25000.0)
    filteredEmployees.keys.toSet

  }

  def reviseSalary(oldData :Map[Int, Double]) :Map[Int, Double] = {

    oldData.mapValues {
      case salary if salary < 20000 => salary * 2
      case salary if salary >= 20001 && salary <= 40000 => salary * 1.5
      case salary if salary > 40001 => salary * 1.25
    }
  }
}

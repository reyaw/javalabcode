package com.codingtemple;

public class Employee extends Person {
   private int employeeId;

   private Employee manager;

   public Employee() {
   }

   public Employee(String name, int employeeId) {
      super(name);
      this.employeeId = employeeId;
   }

   public int getEmployeeId() {
      return employeeId;
   }

   public Employee getManager() {
      return manager;
   }

   public void setManager(Employee manager) {
      this.manager = manager;
   }

   public void setEmployeeId(int employeeId) {
      this.employeeId = employeeId;
   }

   public double calcSalary() {
      return 0.0;
   }

   public String toString() {
      StringBuffer sb = new StringBuffer(super.toString());
      sb.append(" - employeeId: ").append(employeeId);
      return sb.toString();
   }
}

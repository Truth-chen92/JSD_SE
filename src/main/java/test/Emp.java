package test;

import java.util.Objects;

public class Emp implements Comparable<Emp>{
    private String name;
    private int age;
    private String gender;
    private double salary;

    public Emp(){

    }
    public Emp(String name, int age, String gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Emp emp = (Emp) o;

        if (age != emp.age) return false;
        if (Double.compare(emp.salary, salary) != 0) return false;
        if (!name.equals(emp.name)) return false;
        return gender.equals(emp.gender);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + gender.hashCode();
        temp = Double.doubleToLongBits(salary);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "name="+name+",age="+age+",gender="+gender+",salary="+salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Emp o) {
        return o.getAge()-this.getAge();
    }
}

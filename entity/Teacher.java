package entity;

import business.AllowanceCalulator;

public class Teacher extends Employee {
    private String faculty; //Tên khóa làm việc
    private EDegree degree; //Trình độ (Tiến sĩ/Thạc sĩ/Cử nhân)
    private int teachingHours;//số giờ giảng dạy


    public Teacher() {
        float allowance = AllowanceCalulator.calculateAllowance((this));
        this.setAllowance(allowance);
    }

    @Override
    public float getSalary() {
        float sal;
        sal = this.getSalaryRatio() * 730 + this.getAllowance() + this.getTeachingHours() * 45;
        return sal;
    }

    @Override
    public String toString() {
        return this.getFullName() + ", " + this.getFaculty() + ", " + this.getDegree() + ", "
                + ", " + this.getSalaryRatio() + ", " + this.getAllowance() + ", " + this.getTeachingHours() + ", "
                + this.getSalary();
    }




    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public EDegree getDegree() {
        return degree;
    }

    public void setDegree(EDegree degree) {
        this.degree = degree;
    }

    public int getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(int teachingHours) {
        this.teachingHours = teachingHours;
    }
}

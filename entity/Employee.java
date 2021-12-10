package entity;

//Interface Comparable dùng để sắp xếp các đối tượng theo tên
public abstract class Employee implements Comparable<Employee> {

    private String fullName;//Tên
    private float salaryRatio;//Hệ số lương
    private float allowance; //Phụ cấp

    public abstract float getSalary();

    public int compareTo(Employee e){
        //So sánh tên để sắp xếp theo tên
        return this.fullName.compareTo(e.getFullName());
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public float getSalaryRatio() {
        return salaryRatio;
    }

    public void setSalaryRatio(float salaryRatio) {
        this.salaryRatio = salaryRatio;
    }

    public float getAllowance() {
        return allowance;
    }

    public void setAllowance(float allowance) {
        this.allowance = allowance;
    }
}

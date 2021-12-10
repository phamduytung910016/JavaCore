package business;

import entity.Employee;
import entity.Staff;
import entity.Teacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class EmployeeManagement {

    private ArrayList<Employee> list;

    public EmployeeManagement() {
        this.list = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        list.add(e);
    }

    //search by staff/teacher` name
    public ArrayList<Employee> searchByName(String name) {
        ArrayList<Employee> rs = new ArrayList<>();
        //check null and empty
        if (name == null || name.trim() == "") {
            return rs;
        }

        //duyệt tất cả các phần tử mảng để so sánh
        //sử dụng method contains() để kiểm tra sự tồn tại của 1 chuỗi trong 1 chuỗi khác
        for (Employee e : list) {
            if(e.getFullName().toUpperCase().contains(name.toUpperCase())){
                rs.add(e);
            }
        }
        return rs;
    }

    //search by staff/teacher` s department/faculty
    public ArrayList<Employee> searchByDept(String dept){
        ArrayList<Employee> rs = new ArrayList<>();

        if (dept == null || dept.trim() == "") {
            return rs;
        }

        Staff s = null;
        Teacher t = null;
        String name = null;

        for (Employee e: list) {
            if(e instanceof Staff){
                s = (Staff) e;
                //lấy phòng ban của Staff
                name = s.getDepartment();
            }else if(t instanceof Teacher){
                t = (Teacher) e;
                //lấy về khoa của giảng viên
                name = t.getFaculty();
            }
            if(name.toUpperCase().contains(dept.toUpperCase())){
                rs.add(e);
            }

        }
        return rs;
    }

    public ArrayList<Employee> listAll(){
        Collections.sort(list);
        return list;
    }
}

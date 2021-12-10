package business;


//class này cdùng để tính phụ cấp cho từng đối tượng

import entity.*;

public class AllowanceCalulator {
    public static float calculateAllowance(Employee e){
        float allowance = 0;

        //kiểm tra xem là nhân viên hay giáo viên
        if(e instanceof Staff){
            Staff s = (Staff) e;
            //head/trường phòng 2000
            if(s.getPosition() == EPosition.HEAD){
                allowance = 2000;
            }else if(s.getPosition() == EPosition.VICE_HEAD){
                allowance = 1000;
            }else if(s.getPosition() == EPosition.STAFF){
                allowance = 500;
            }
        }else if(e instanceof Teacher){
            Teacher t = (Teacher) e;
            if(t.getDegree() == EDegree.DOCTOR){
                allowance = 1000;
            }else if(t.getDegree() == EDegree.MASTER){
                allowance = 500;
            }else if(t.getDegree() == EDegree.BACHELOR){
                allowance = 300;
            }
        }
        return allowance;
    }
}

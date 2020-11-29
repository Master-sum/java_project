import java.time.LocalDate;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] mo = new Employee[3];
        mo[0] = new Employee("bai", 12000, 2020, 11, 12);
        mo[1] = new Employee("jin", 12000, 2020, 11, 13);
        mo[2] = new Employee("xing", 12000, 2020, 11, 14);

        for(Employee e:mo)
            e.raise(5);
        for (Employee e:mo)
            System.out.println("name:"+e.getName()+",salary="+e.getSalsry()+",time:"+e.getTime());

    }
}
    class Employee{
        private String name;
        private double salsry;
        private LocalDate time;
//        构造方法
        public Employee(String n,double s,int y,int m,int d){
            name = n;
            salsry = s;
            time = LocalDate.of(y,m,d);
        }
        public String getName(){
            return name;
        }
        public double getSalsry(){
            return salsry;
        }
        public LocalDate getTime(){
            return time;
        }
        public void raise(double m1){
            double r = salsry*m1/100;
            salsry += r;
        }

    }


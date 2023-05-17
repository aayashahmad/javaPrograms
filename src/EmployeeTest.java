public class EmployeeTest {
    public static void main(String[] args) {
        Employee [] staff = new Employee[5];
        staff[0] = new Employee("aayash", 2000 , 2021,1 ,1);
        staff[1] = new Employee("irfan", 3000 , 2021,2 ,1);
        staff[2] = new Employee("zahid", 4000 , 2021,3 ,1);
        staff[3] = new Employee("asma", 5000 , 2021,4,1);
        staff[4] = new Employee("fida", 6000 , 2021,5,1);
        for (Employee e : staff){
            e.raiseSalary(100);

                System.out.println("Name  "+ e.getName()+"  Salary  "+ e.getSalary()+"  Date Joined  "+ e.getHireDate() );

        }
    }
}

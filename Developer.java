class Employee {
    int id;
    String name;
    String Designation;
}
class projectmanager extends Employee{
    int hra;
    int da;

}
class Developer extends projectmanager{
    Developer(int id,String name,String Designation,int hra,int da){
        this.id=id;
        this.name=name;
        this.Designation=Designation;
        this.hra=hra;
        this.da=da;
    }
    void diaplay(){
        System.out.println("id is         : "+id);
        System.out.println("name is       : "+name);
        System.out.println("Designation is: "+Designation);
        System.out.println("hra is        : "+hra);
        System.out.println("da is         : "+da);

    }
    public static void main(String []args){
        Developer d=new Developer(100, "ajit ", "java developer", 500, 300);
        d.diaplay();
    }
}

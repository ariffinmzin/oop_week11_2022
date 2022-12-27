public class RunUTHMEmployee{

    public static void main(String[] args){

        Lecturer l1 = new Lecturer(); //create an instance of Lecturer named l1
        l1.setEmployeeID("A100");
        l1.setName("Ariffin");
        l1.setSubject("OOP");
        System.out.println("EmployeeID : " + l1.getEmployeeID());
        System.out.println("Name : " + l1.getName());
        System.out.println("Subject : " + l1.getSubject());
        /* 
        Programmer p1 = new Programmer();
        p1.setEmployeeID("A200");
        p1.setName("Abu");
        p1.setProgrammingLanguage("PHP");

        System.out.println("EmployeeID : " + p1.getEmployeeID());
        System.out.println("Name : " + p1.getName());
        System.out.println("Subject : " + p1.getProgrammingLanguage());
        */


    }

}
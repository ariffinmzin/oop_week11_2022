public class UTHMEmployee { //parent class

    private String employeeID;
    private String name;

    public UTHMEmployee(){  //no-argument constructor

        System.out.println("This is a UTHMEmployee class");

    }

    //setters

    public void setEmployeeID(String employeeID){

        this.employeeID = employeeID;
    }

    public void setName(String name){

        this.name = name;
    }

    //getters

    public String getEmployeeID(){

        return employeeID;
    }

    public String getName(){

        return name;
    }

}
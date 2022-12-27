public class Lecturer extends UTHMEmployee{

    private String subject;

    public Lecturer(){
        super();
        System.out.println("This is a Lecturer class");

    }

    //setter

    public void setSubject(String subject){

        this.subject = subject;

    }

    //getter
    public String getSubject(){

        return subject;
    }

    
}

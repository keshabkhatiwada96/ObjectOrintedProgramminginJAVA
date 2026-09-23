
class person{
    String caste;
    String location;
    public void pinfo(){
        System.out.println(caste);
        System.out.println(location);

    }
}

class student extends person{
    String section;
    int rollno;
    public void sinfo(){
        System.out.println(caste);
        System.out.println(location);
        System.out.println(section);
        System.out.println(rollno);
    }
}

class collegestudent extends student{
    String collegename;
    int collegenumber;
    public void cinfo(){
         System.out.println(caste);
        System.out.println(location);
        System.out.println(section);
        System.out.println(rollno);
        System.out.println(collegename);
        System.out.println(collegenumber);
    }
}

public class Chatgpt {
    public static void main(String[] args) {
        collegestudent c1 = new collegestudent();
        c1.caste = "khatiwada";
        c1.location = "birtamode";
        c1.section="b" ;
        c1.rollno =10 ;
        c1.collegename ="balmiki" ;
        c1.collegenumber = 45;
        
        System.out.println("----------------");
        c1.pinfo();
        System.out.println("----------------");
        c1.sinfo();
        System.out.println("----------------");
        c1.cinfo();
    }
}

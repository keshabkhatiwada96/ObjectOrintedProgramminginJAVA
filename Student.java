class Student{
    String name;
    Student (String n){
    name=n;
    }
   
    Student (Student s1){
    name=s1.name;
    }

void display(){
    System.out.println("Im copy constructor");
    System.out.println("Name = "+name);
    }

public static void main(String[] args) {
    
    Student s1=new Student("ram");
    Student s2=new Student(s1);
    s2.display();
}



}
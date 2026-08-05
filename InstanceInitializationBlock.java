 // creating java code for instance initialization block
class InstanceInitializationBlock{
    int age;
    {
        age=20;
        System.out.println("...Instance Initialization Block executed...");
    }
    InstanceInitializationBlock(){
        System.out.println("Constructor executed...");
    }
    public static void main(String args[]){
        InstanceInitializationBlock s1=new InstanceInitializationBlock();
        System.out.println("Age of student is: "+s1.age);
    }
}
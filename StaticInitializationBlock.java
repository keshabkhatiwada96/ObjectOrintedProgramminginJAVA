 // creating static initialization block
class StaticInitializationBlock {
    static{
        System.out.println("...Static Initialization Block executed...");
    }
    StaticInitializationBlock(){
        System.out.println("Constructor executed...");
    }
    public static void main(String args[]){
        StaticInitializationBlock s1=new StaticInitializationBlock();
    }
    }
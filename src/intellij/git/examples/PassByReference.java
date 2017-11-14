package intellij.git.examples;

public class PassByReference {

    int x = 200;

    void modify(PassByReference b1){
        b1.x = 1000;
    }

    public static void main (String[] args){

        PassByReference b1 = new PassByReference();

        System.out.println("Initial value of the data is : " + b1.x);

        b1.modify(b1);

        System.out.println("Value after the reference  : " + b1.x);

    }
}

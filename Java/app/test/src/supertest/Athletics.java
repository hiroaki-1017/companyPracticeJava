package supertest;

public class Athletics extends Sports {
	String competition;

    void show(){
          super.show();
          System.out.println("competition:"+ competition);
    }
}

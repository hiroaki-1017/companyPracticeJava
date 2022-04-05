package test04;

public class Test {

    void Anzy() {

        int data = 10;
        data = Anzy2(data);
        System.out.println(data);

    }

    int Anzy2(int data) {

        System.out.println(data);
        data ++; // 「data」をインクリメントする(+1)
        return data;

    }

}


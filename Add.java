
import java.io.*;

class Add {

    int a, b, c;

    void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the a,b");
        a = Integer.valueOf(br.readLine());
        b = Integer.valueOf(br.readLine());
    }

    void process() {
        c = a + b;
    }

    void output() {
        System.out.println(c);
    }
}

class main {

    public static void main(String arg[]) throws IOException {
        Add x = new Add();
        x.input();
        x.process();
        x.output();
    }
}

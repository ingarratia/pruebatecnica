public class App {

    public static void main(String[] args) throws Exception {
        
        stack stackObj = new stack();

        stackObj.push(0);
        stackObj.push(2);
        stackObj.push(5);
        stackObj.push(6);
        stackObj.push(7);
        stackObj.push(8);


        stackObj.pop();
        stackObj.pop();
        stackObj.pop();

        stackObj.peek();

    }
}

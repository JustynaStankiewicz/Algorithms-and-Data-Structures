public class Test_2 {
    public static void main(String[] args) throws BottomOfStackException {
        MyStack stack = new MyStack(4);

        stack.push(1);
        stack.push(2);
        System.out.println("numer " + stack.pop());
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("wielkosc:" + stack.size());
        stack.push(6);
        System.out.println("numer " + stack.pop());
        stack.push(7);
        //stack.push(8);
        //stack.push(9);
        System.out.println(stack.isEmpty());


        for (int i = 0; i < stack.size(); i++) {
            if (i != stack.topIndex) {
                System.out.println(stack.array[i]);
            }
        }

    }
}

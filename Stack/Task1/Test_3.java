public class Test_3 {
    public static void main(String[] args) throws BottomOfStackException {
        VTStack vtstack = new VTStack(4);

        vtstack.push(1);
        vtstack.push(2);
        System.out.println("numer " + vtstack.pop());
        vtstack.push(3);
        vtstack.push(4);
        vtstack.push(5);
        System.out.println("wielkosc:" + vtstack.size());
        vtstack.push(6);
        //System.out.println("numer " + stack.pop());
        vtstack.push(7);
        //vtstack.push(8);
        //vtstack.push(9);
        System.out.println("pozycja: " + vtstack.peek());
        //vtstack.toTop();
        // vtstack.peek();
        vtstack.down();
        System.out.println("pozycja: " + vtstack.peek());
        vtstack.toTop();
        System.out.println("top: " + vtstack.peek());


        for (int i = 0; i < vtstack.size(); i++) {
            if (i != vtstack.topIndex) {
                System.out.println(vtstack.array[i]);
            }
        }

    }
}

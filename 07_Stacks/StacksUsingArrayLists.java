import java.util.ArrayList;

public class StacksUsingArrayLists {
    static class Stack{
        static ArrayList<Integer> s = new ArrayList<>();
        public static boolean isEmpty(){
            if(s.size()==0){
                return true;
            }
            return false;
        }
        public static void add(int data){
            s.add(data);
        }
        public static int pop(){
            if(s.isEmpty()){
                return -1;
            }
            int top=s.get(s.size()-1);
            s.remove(s.size()-1);
            return top;
        }

        public static int peek(){
             if(s.isEmpty()){
                return -1;
            }
         return s.get(s.size()-1);
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        StacksUsingArrayLists.Stack.add(1);
        s.add(2);
        s.add(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}

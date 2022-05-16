package Himanshu.ctcci.StacksAndQueue;
import java.util.*;

//https://www.algoexpert.io/questions/Min%20Max%20Stack%20Construction
public class MinMaxConstruction {


    class Program {
        // Feel free to add new properties and methods to the class.
        class MinMaxStack {
            Stack<Integer> st = new Stack<>();
            Stack<Integer> min = new Stack<>();
            Stack<Integer> max = new Stack<>();

            public int peek() {
                // Write your code here.
                return st.peek();
            }

            public int pop() {
                // Write your code here.
                if(st.peek().equals(min.peek())) {
                    min.pop();
                }
                if(st.peek().equals(max.peek())) {
                    max.pop();
                }
                return st.pop();
            }

            public void push(Integer number) {
                // Write your code here.
                if(min.isEmpty() || number <= min.peek()) {
                    min.push(number);
                }

                if(max.isEmpty() || number >= max.peek()) {
                    max.push(number);
                }

                st.push(number);
            }

            public int getMin() {
                // Write your code here.
                return min.peek();
            }

            public int getMax() {
                // Write your code here.
                return max.peek();
            }
        }
    }

}

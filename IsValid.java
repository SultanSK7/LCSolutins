import java.util.*;
class IsValid {
    public static boolean isValid(String s) {
    char a;
    int i=0;
    char pop;
    //boolean op = false;
    Stack <Character> Stk = new Stack<>();

    while(i<s.length()){
        //System.out.println(s.length());
        //System.out.println(i);
            a=s.charAt(i);
            if(a=='(' || a=='{' || a=='['){
                Stk.push(a);
                i+=1;
                continue;
            }

            if(Stk.isEmpty()){
                return false;
            }
            switch(a){
                case')':
                    pop=Stk.pop();
                    if(pop=='{' || pop == '['){
                        return false;
                    }
                    i+=1;
                    break;
                case'}':
                    pop=Stk.pop();
                    if(pop=='(' || pop == '['){
                        return false;
                    }
                    i+=1;
                    break;
                case']':
                    pop=Stk.pop();
                    if(pop=='{' || pop == '('){
                        return false;
                    }
                    i+=1;
                    break;        
            }           
    }return (Stk.isEmpty());
    }
    public static void main(String[] args) {
        String s = "{{{{{()}}}}}";
        System.out.println(isValid(s));
    }
}
class RomanToInt {
    public int romanToInt(String s) {
        char a;
        int op=0;
        int i=0;
        while(i<s.length()){
            a=s.charAt(i);
            switch(a){
                case 'I':
                    if(i+1<s.length() && s.charAt(i+1)=='V'){
                        op=op+4;
                        i+=2;
                        break;
                    }else if(i+1<s.length()  &&  s.charAt(i+1)=='X'){
                        op=op+9;
                        i+=2;
                        break;
                    }
                    op+=1;
                    i+=1;
                    break;
                case 'X':
                    if(i+1<s.length()  &&  s.charAt(i+1)=='L'){
                        op=op+40;
                        i+=2;
                        break;
                    }else if(i+1<s.length()  &&  s.charAt(i+1)=='C'){
                        op=op+90;
                        i+=2;
                        break;
                    }
                    op+=10;
                    i+=1;
                    break;
                case 'C':
                    if(i+1<s.length()  &&  s.charAt(i+1)=='D'){
                        op=op+400;
                        i+=2;
                        break;
                    }else if(i+1<s.length()  &&  s.charAt(i+1)=='M'){
                        op=op+900;
                        i+=2;
                        break;
                    }
                    op+=100;
                    i+=1;
                    break;
                case 'V':
                    op+=5;
                    i+=1;
                    break;
                case 'L':
                    op+=50;
                    i+=1;
                    break;
                case 'D':
                    op+=500;
                    i+=1;
                    break;
                case 'M':
                    op+=1000;
                    i+=1;
                    break;
                default:
                    break;
            }
        }
        return op;
    }
}
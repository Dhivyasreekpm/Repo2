package Javademo1;


class uniquestr {
    public static void main(String[] args) {
       String str="dhivyasree";
       System.out.println("Entered string:"+str);
       uniquecharacters(str);
    }
       public static void uniquecharacters(String test) {
           String temp="";
           for(int i=0;i<test.length();i++) {
               if(temp.indexOf(test.charAt(i)) == -1) {
                   temp=temp+test.charAt(i);
                   
               }
           }
           System.out.println(temp+ " ");
       }
    }

public class Day5_loops {
    public static void main(String args[]){
        for(int count=20;count<=35;count++){
            System.out.println(count);
        }
        System.out.println("Even Numbers");
        for(int count=10;count<=20;count++){
            if( count % 2 == 0){
            System.out.println(count);
        }
    }
}
}

//print three letters of string

public String frontTimes(String str, int n) {
    String result="";
    
    int end=3;
    if(str.length()<3){
      end=str.length();
    }
    
    
    String front=str.substring(0,end);
    for(int i=0;i<n;i++){
      result=result+front;
    }
    return result;
  }

//string times

public String stringTimes(String str, int n) {
    String s1="";
    for(int i=0;i<n;i++){
      s1=s1+str;
      
    }
    return s1;
  }
  
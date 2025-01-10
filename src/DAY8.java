public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
String stringOne = words[i];
for(int i = 0; i < words.length; i++){
   for(int j = 0;j < words.length; j++){
       String stringTwo = words[j];
       if(i != j && stringOne.length() < stringTwo.length()) {
           checkIfSubstring(stringOne , stringTwo);
           list.add(stringOne);
           break;
       }
   }
   return list;
}
public boolean checkIfSubstring(String sOne, String sTwo){
   for(int i = 0; i <= sTwo.length() - sOne.length();i++){
       if(sOne.equals(sTwo.substring(i, sOne.length() + i ))){
   
       return true;
   }
}
return false;
}
}

public class lesson1 {

  public static void main(String[] args) {
   //there is two types 
  //  primitive type & non primitive type
  //byte - 1 [-128 to 127]
  //short -2 byte memory
  //int - 4 byte memory
  //long - 8 byte memory
  //float - 4 byte memory
  //double - 8 byte memory
  //char - 2
  // boolean - 1 true false
//this are primitve datatype
  byte age = 30;
  int phone = 123456789;
  long phone2 = 4567890177777L;
  float pi = 3.14F;
  char letter = 'A';
  boolean isAdult = true;


//non-primitive datatype
// String  name = new String("Antik");
// System.out.println(name.length());
//string methods
//concatinating

String name1 = "Aman";
String name2 = "Anil";

name1 = name1.replace('A', 'B');

String name3 = name1 + " and " + name2;

// System.out.println(name3);
// System.out.println(name.charAt(0));
//replace


// System.out.println(name3);

//substring

String myName = "karim and joha";


System.out.println(myName.substring(0, 5));

  }
}
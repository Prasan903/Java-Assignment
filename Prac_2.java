// Name: Prasan Ashvinbhai Savaliya
// ID  : 21CE121
//Div: CE2 B2 

// Aim : Given a string, return a string made of the
//       first 2 chars (if present), however include
//       first  char  only  if  it  is  'o' and  
//       include  the  second  only  if  it  is  'z', 
//       so  "ozymandias" yields "oz".
//       startOz("ozymandias") → "oz"
//       startOz("bzoo") → "z"
//       startOz("oxx") → "o"

import java.util.Scanner;
class Prac_2
{
  public static void main(String[] args) 
  {    
    Scanner sc = new Scanner(System.in);
     
    System.out.print("Enter the String : ");
    String str = sc.nextLine();
    String ans = startOz(str);
    System.out.println(ans);
    sc.close();
    System.out.println("21CE121_PrasanSavaliya");
  }
  public static String startOz(String a)
  {   
    //when 'o' and 'z' are come in first in string then it's include in obt variable.
    String obt = "";
    if(a.charAt(0)=='o')
    obt=obt+'o';
    if(a.charAt(1)=='z')
    obt=obt+'z';
    return obt;
  }
}
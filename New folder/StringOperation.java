class StringOperation 
{ 
  public String name[];
  public String name2[];
  public int d;
  

public StringOperation(String name[])  
{
  this.name= name;

}

public void checkingPalindrome()
{
  

System.out.println(name);
name2 = Strrev(name);
System.out.println(name2);

int d = Strcmp(name,name2);

if(d == 0)
{
 System.out.println("its palindrome");

}
else
System.out.println("its not palindrome");
  
}

 

}
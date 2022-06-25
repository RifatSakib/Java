
class StringOperation 
{ 
  public String name[];
  public String name2[];
  public int length;
  

public StringOperation(String name[])  
{
  this.name= name;

}

public void checkingPalindrome()
{
  length = name.Length();
  
  for (int i=length-1; i>=0; i--)
  {
	  name2 = name2 + name.CharAt(i);
	  
  }	  


if(name.Equals(name2))
{
 System.out.println("its palindrome");

}
else
System.out.println("its not palindrome");
  
}

}
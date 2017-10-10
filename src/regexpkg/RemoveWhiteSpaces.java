package regexpkg;

/*
 * Write a java program to remove all white spaces from a string.
 */

public class RemoveWhiteSpaces {
	
	public static void main(String[] args)
    {
        String str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
 
        //1. Using replaceAll() Method
 
        String strWithoutSpace = str.replaceAll("\\s", ""); 
        System.out.println(strWithoutSpace);         //Output : CoreJavajspservletsjdbcstrutshibernatespring
 
        //2. Without Using replaceAll() Method
        
        str = "  Core Java jsp servlets             jdbc struts hibernate spring  ";
        char[] arr = str.toCharArray();
 
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++)
        {
        	if( (arr[i] != ' ') && (arr[i] != '\t') )
                sb.append(arr[i]);
        } 
        System.out.println(sb);           //Output : CoreJavajspservletsjdbcstrutshibernatespring
    }

}

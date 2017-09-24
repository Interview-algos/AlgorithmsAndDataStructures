package sreehari;


 public class Number  

 

{
    private static final String[] specialNames = {
        "",
        " thousand",
        " million",
        " billion",
        " trillion",
        " quadrillion",
        " quintillion"
    };
    
    private static final String[] tensNames = {
        "",
        " ten",
        " twenty",
        " thirty",
        " forty",
        " fifty",
        " sixty",
        " seventy",
        " eighty",
        " ninety"
    };
    
    private static final String[] numNames = {
        "",
        " one",
        " two",
        " three",
        " four",
        " five",
        " six",
        " seven",
        " eight",
        " nine",
        " ten",
        " eleven",
        " twelve",
        " thirteen",
        " fourteen",
        " fifteen",
        " sixteen",
        " seventeen",
        " eighteen",
        " nineteen"
    };
    
    private String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " hundred" + current;
    }
    
    public String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertLessThanOneThousand(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }
    
    public static void main(String[] args) {
        Number obj = new Number();
        System.out.println("*** " + obj.convert(123456789));
        System.out.println("*** " + obj.convert(-55));
        System.out.println("*** " + obj.convert(20));
        System.out.println("*** " + obj.convert(7));
        System.out.println("*** " + obj.convert(10));
        System.out.println("*** " + obj.convert(11));
        System.out.println("*** " + obj.convert(1));

        System.out.println("*** " + obj.convert(2));

        System.out.println("*** " + obj.convert(3));
        System.out.println("*** " + obj.convert(5));

        System.out.println("*** " + obj.convert(6));

        System.out.println("*** " + obj.convert(7));
        System.out.println("*** " + obj.convert(4));



        
        
    }
}


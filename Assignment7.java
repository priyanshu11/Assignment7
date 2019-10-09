public class Assignment7 {
    public static void sorting(String[] Array) {
        int n = Array.length;
        String temp;
        for (int i=0; i<n;i++) {
            for (int j=1;j<(n - i);j++) {
                if (Array[j - 1].compareTo(Array[j]) > 0) {
                    temp = Array[j - 1];
                    Array[j - 1] = Array[j];
                    Array[j] = temp;
                }

            }
        }
    }
    public static void search(String key,String[] Array){
        int n=Array.length;
        for(int i=0;i<n;i++)
        {
            if (key.equals(Array[i]))
            {
                System.out.println("\nElement found at index="+i);
            }
        }
    }


        public static void reverse(String[] Array)
    {
        int l=Array.length-1;
        String[] Array2= new String[Array.length];
        for(int i=0;i<Array.length;i++){

            System.out.print(Array[i]+", ");
            System.out.println();
            Array2[i]=Array[l];
            l--;
        }
        System.out.println("The Reversed array is:");
        for(int i=0;i<Array.length;i++)
        {
         System.out.print(Array2[i]+", ");
        }

    } 
    private static void printArray( String[] Array )
    {
        for (String s:Array) {
            System.out.print( s + " " );
        }
        System.out.println();
    }


  
       



    

    public static void main( String[] args )
    {
        String[] SArray = { "Zurich", "Denmark", "Amsterdam", "Warsaw", "Berlin", "Yorkshire", "Canada", "Xi" };
        String[] Array2={"Denmark", "Warsaw", "Yorkshire", "Canada"};
        String key="Warsaw";
        System.out.println("---------------------------------SORTING------------------------------------");
        sorting( SArray );
        
        printArray(SArray);
        System.out.println("---------------------------------SEARCH------------------------------------");

        search(key,SArray);
      
      

        System.out.println("---------------------------------REVERSE------------------------------------");
        reverse(SArray);

        
    }
}
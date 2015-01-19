//Array in java



public class Array {
    
    public static void main(String[] args) {
            
        
        int[][]values = {{33,33},
            
            
            
            {44,44}
        
        };
        
        
        
         int i =2;
         int j= 2;
    
         
         for(int row=0 ; row<i ; row++)
         {
          
             for(int column=0 ; column<j; column++)
             {
                 System.out.print(values[row][column] + "\t");
                 
             }
             
             System.out.println();
             
         }
         
    }
        
    
    
    
    
}

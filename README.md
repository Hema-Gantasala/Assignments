# Name in Box

This pattern is to get a rectangular structured box with help of (+ - | and space) like below

     
       
       +-------------------------------+
       |                               |
       |                               |
       |                               |
       |                               |
       |                               | 
       |                               |
       +-------------------------------+
   This code will help in getting the layout
   
       for(int i=0;i<r;i++)
     {
        for(int j=0;j<c;j++)
         {
          if(i==0 && j==0 || i==0 && j==c-1 || i==r-1 && j==0|| i==r-1 && j==c-1)
            System.out.print("+");
          else if(i==0 || i==r-1)
             System.out.print("-");
          else if(j==0 || j==c-1)
               System.out.print("|");
               
     
   And in the above box we need to print our name in the 2 and last row and leaving to spaces after the  name before reaching the edge(space occupied by name should be dynamic)
   
   
      else if(i==r-3 && j==c-(a+2))
            {
               System.out.print(name);
               j+=a-1;
             }
   this code helps to print name
    
    
       +-------------------------------+
       |                               |
       |                               |
       |                               |
       |                               |
       |                         Hema  | 
       |                               |
       +-------------------------------+
       
       
  **OUTPUT**
   ![image](https://user-images.githubusercontent.com/80663245/118505041-ac87ab00-b749-11eb-9a87-34993dc36f1b.png)

    

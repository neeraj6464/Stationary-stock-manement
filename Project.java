package project;  // PACKAGE NAME    
import java.text.SimpleDateFormat;  
import java.util.*;


 class Stesh
{
   // INPUT OBJECT.
    
   Scanner scan=new Scanner(System.in);
   
   String s_item[]={"pen","pencil","Stepler","A4_paper","note_book"};// s_item 
   

   String pen_com[]={"Natraj","montex","balaji","supra"};
   int pen_price[]={5,10,20,50};//pen_price
   int Qty_of_pen[]={10,500,60,320}; //qty_pen
  
   String pencil_com[]={"natraj","apsra","first","boskey"};
   int pencil_price[]={5,10,20};
   int Qty_of_pencil[]={10,500,320};

   String stepler_com[]={"switch","speed","click"};    
   int stepler_price[]={15,20,50,250};
   int Qty_of_stepler[]={100,500,600,3020};
    
   String A4_paper_com[]={"cycle","smoth","pages"};
   int A4_paper_price[]={50,100,200,500};
   int Qty_of_A4_paper[]={10,500,600,320};

   String note_book_com[]={"class_mate","notebook","pooja","rajshree"};
   int note_book_price[]={2,5,10,20,40,50};
   int Qty_of_note_book[]={10,50,60,13,120,20};

   int stoke[]={500,390,600,900,1000};

     
//CONSTRUCTOR
 
   Stesh()
   {
        
       System.out.println(".........................wellcome..............................");
        
     
   } 
  

// ITEM LIST METHOD
   public  void item()
    {
        for(int i=0;i<s_item.length;i++)
        {
         System.out.println("press "+ i + "for buying  " + s_item[i]);  
        }
         System.out.println("press 5 for see stock ");
         System.out.println("press 6 for exit ");
         
       input();
    }
    
// INPUT METHOD
   public void input()
   {
      int ch;
      System.out.println("enter the choice");
      ch=scan.nextInt();
      
      sale(ch);
   }

// SALE METHOD
    public  void sale(int a)
     {
        int range1,range2;
         switch(a)
         {
            
            case 0:  System.out.println("enter the range");
                      range1=scan.nextInt();
                      System.out.println("to");
                      range2=scan.nextInt();
                      stoke_cheak(s_item[0]);
                      range(range1,range2,pen_price,pen_com,Qty_of_pen,a);
                      break;
            case 1:  System.out.println("enter the range");
	                      range1=scan.nextInt();
                      System.out.println("to");
                      range2=scan.nextInt();
                      stoke_cheak(s_item[1]);
                      range(range1,range2,pencil_price,pencil_com,Qty_of_pencil,a);
                      break;
            case 2:  System.out.println("enter the range");
                      range1=scan.nextInt();
                      System.out.println("to");
                      range2=scan.nextInt();
                      stoke_cheak(s_item[2]);
                      range(range1,range2,stepler_price,stepler_com, Qty_of_stepler,a);
                      break;
            case 3:  System.out.println("enter the range");
                      range1=scan.nextInt();
                      System.out.println("to");
                      range2=scan.nextInt();
                      stoke_cheak(s_item[3]);
                      range(range1,range2,A4_paper_price,A4_paper_com,Qty_of_A4_paper,a);
                      break; 
            case 4: System.out.println("enter the range");
                      range1=scan.nextInt();
                      System.out.println("to");
                      range2=scan.nextInt();
                      stoke_cheak(s_item[4]);
                      range(range1,range2,note_book_price,note_book_com,Qty_of_note_book,a);
                      break;
            case 5: stoke_show();
                    break;
            case 6: System.exit(0);
            default:System.out.println("You have entered the Wrong  choice\n");
                    System.out.println("Please enter the Correct choice ");
                    break; 
                      
         }
     }

// STOKE cheaking METHOD

  public void stoke_cheak(String s)
   {
     for(int i=0;i<s_item.length;i++)
     {
          if(s_item[i]==s)
          {
             System.out.println("product is in stoke");
             break;
          }
         else
          {
                 if(i==s_item.length)
                 {
                    System.out.println("product is out of stock");
                 }
          }
     }
       
   }

// RANGE COMPARE
  public void range(int x,int y, int []a,String c[],int []b,int j)
   {
     System.out.println(" various price of your product given range");
    System.out.println("");
    System.out.println("company name \t\t  price \t\t  Qty\n ");
     for(int i=0;i<a.length;i++)
     {
       
       if(x<=a[i])
       {
          
         System.out.println(c[i] + "\t\t\t " + a[i] + "rs" + "\t\t\t" + b[i]+"\n");
       }
       if(a[i]>y)
         {
             break;
         }

     }
        System.out.println("enter the price");
       int ch1=scan.nextInt();
        System.out.println("enter the qty");
       int qty=scan.nextInt();
       System.out.println("collect your product............................. ");
       SimpleDateFormat sdf=new  SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
        Date date =new Date();
        System.out.println(" total bill=" + (qty*ch1) +"\t\t\t\t" + "DATE - " + sdf.format(date));
        
       stoke(qty,stoke,j);
     
        
   }
    
//show stoke method
  public  void stoke_show()
   {
          System.out.println("......................................stoke of shop................................");
          System.out.println("enter  your name");          
      int mo =scan.nextInt();
        System.out.println("enter your password");
       int password=scan.nextInt();
          if(mo==469469 && password==123456789)
          {
              for(int i=0;i<s_item.length;i++)
             {
       
                
                 System.out.println(""+  s_item[i] +"  "+ stoke[i]);
             }
       }
       else
       {
             if(mo!=469469)
             {
                 System.out.println("invalid user name");
             }
             else
            System.out.println("invalid password");
       }
   }
  
//stoke opration
  public  void stoke(int qty,int a[],int b)
   {
     a[b]=a[b]-qty;  
   }

 
}
//class stesh is end

// MAin CLASSS is start..

class Project 
{
   public static void main(String args [])
   {
    Stesh ob=new Stesh(); 
    do{
    ob.item();
    System.out.println("......................................THANKYOU!.........................");
    }while(true); 
   }
}

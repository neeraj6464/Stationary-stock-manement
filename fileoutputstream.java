package file_hand;
import java.io.*;
public class fileoutputstream
{
     String s_item[];
  String pen_com[];
   Integer pen_price[];//pen_price
   Integer Qty_of_pen[]; //qty_pen
  
   String pencil_com[];
   Integer pencil_price[];
   Integer Qty_of_pencil[];

   String stepler_com[];    
   Integer stepler_price[];
   Integer Qty_of_stepler[];
    
   String A4_paper_com[];
   Integer A4_paper_price[];
   Integer Qty_of_A4_paper[];

   String note_book_com[];
   Integer note_book_price[];
   Integer Qty_of_note_book[]; 
   fileoutputstream()
        {}
 
//constructor
  public  fileoutputstream(String[]s_item,Integer []pen_price,String[]pen_com,Integer []Qty_of_pen,Integer []pencil_price,String[]pencil_com,Integer []Qty_of_pencil,Integer []stepler_price
                     ,String[]stepler_com,Integer [] Qty_of_stepler,Integer []A4_paper_price,String[]A4_paper_com,Integer []Qty_of_A4_paper,Integer []note_book_price,String[]note_book_com
                      ,Integer []Qty_of_note_book)
       {   
              this.s_item=s_item;
              this.pen_com=pen_com;
               this.pen_price=pen_price;//pen_price
               this.Qty_of_pen=Qty_of_pen; //qty_pen
 
               this.pencil_com=pencil_com;
               this.pencil_price=pencil_price;
                this.Qty_of_pencil=Qty_of_pencil;

             this.stepler_com=stepler_com;    
             this.stepler_price=stepler_price;
             this.Qty_of_stepler=Qty_of_stepler;
    
             this.A4_paper_com=A4_paper_com;
              this.A4_paper_price=A4_paper_price;
               this.Qty_of_A4_paper=Qty_of_A4_paper;

              this.note_book_com=note_book_com;
              this.note_book_price=note_book_price;
               this.Qty_of_note_book=Qty_of_note_book; 

       }
 public void file_data()throws IOException
   {  
           //String s_item[]={"pen","pencil","stepler","A4_paper","note_book"};// s_item 
//Integer
  
	
              FileWriter w= new FileWriter("abc.doc");
            
             w.write("item\t\tcompany\t\tprice\t\tqty\n");
             for(String s:s_item)
              {
                 w.write(s); 
                if(s=="pen")
                 {
                       for(int a=0;a<pen_com.length;a++)
                        {
                            
                            w.write("\t\t"+pen_com[a]+"\t\t");
                            w.write(pen_price[a] +"\t\t");
                             w.write(Qty_of_pen[a] + "\n");                      
                        }
                       w.write("\n");
                 }
                
               
                 if(s=="pencil")
                 {
                        for(int b=0;b<pencil_com.length;b++)
                        {
                            w.write("\t\t"+pencil_com[b]);
                            w.write("\t\t"+pencil_price[b]+"\t\t");
                            w.write(Qty_of_pencil[b]+"\n");   
                        }
                        w.write("\n");
                  }
               
                if(s=="stepler")
                    {
                             for(int c=0;c<stepler_com.length;c++) 
                             {
                                   w.write("\t\t"+stepler_com[c]);
                                   w.write("\t\t"+stepler_price[c]+"\t\t");
                                   w.write(Qty_of_stepler[c]+"\n");  
                             }
                    }
                   w.write("\n");
                     if(s=="A4_paper")
                    {
                             for(int d=0;d<A4_paper_com.length;d++) 
                             {
                                   w.write("\t\t"+A4_paper_com[d]);
                                   w.write("\t\t"+A4_paper_price[d]+"\t\t");
                                   w.write(Qty_of_A4_paper[d]+"\n");  
                             }
                    }
                   w.write("\n");
                     if(s=="note_book")
                    {
                             for(int d=0;d<note_book_com.length;d++) 
                             {
                                   w.write("\t\t"+note_book_com[d]);
                                   w.write("\t\t"+note_book_price[d]+"\t\t");
                                   w.write(Qty_of_note_book[d]+"\n");  
                             }
                    }
                   w.write("\n");
             } //for each loop end 
               
            //fos.close();
            w.close();
       
           
      System.out.println("sucess");
 }
}
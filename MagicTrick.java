/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package magictrick;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Raakesh vicrak
 */
public class MagicTrick {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
       
        MagicTrick mt=new MagicTrick();
        mt.solve();
    }
    
    public void solve() throws IOException
    {
        int notc,firstchoice,secondchoice,globali=0,count = 0,answer = 0;
        int order1[][] = new int[4][4],order2[][] = new int[4][4],choicearray1[] = new int[4],choicearray2[] = new int[4];
        String temp,temp1[];
        
        Scanner sc= new Scanner(System.in);
         
        notc=sc.nextInt();
        String result[]=new String[notc];
        while(notc>=1)
        {
           
            firstchoice=(byte) sc.nextInt();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    order1[i][j]=sc.nextInt();
                }
            }
            
            secondchoice=sc.nextByte();
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
                {
                    order2[i][j]=sc.nextInt();
                }
            }
            //i am now copying firstchoice row elements;
            
            for(int j=0;j<4;j++)
            {
                choicearray1[j]=order1[firstchoice-1][j];
                //System.out.println(choicearray1[j]);
            }
            
            //i am now copying secondchoice row elements;
            
            for(int j=0;j<4;j++)
            {
                choicearray2[j]=order2[secondchoice-1][j];
                //System.out.println(choicearray2[j]);
            }
            
            for(int i=0;i<4;i++)
            {
                for(int j=0;j<4;j++)
            {
                if(choicearray1[i]==choicearray2[j])
                {
                    answer=(byte) choicearray1[i];
                    count++;
                }
            }
            }
            
            if(count==1)
            {
                result[notc-1]=String.valueOf(answer);
            }
            
           
            
            
                if(count==0)
                {
                    
                        result[notc-1]=String.valueOf("Volunteer cheated!");
                        //System.out.println("Case #"+notc+": Volunteer cheated!");
                } 
                else if(count>1)
                    {
                        result[notc-1]=String.valueOf("Bad magician!");
                        //System.out.println("Case #"+notc+": Bad magician!");
                    }
                
            
            count=0;
            notc--;
        }
        byte tempd=1;
        for(int i=result.length-1;i>=0;i--)
        {
            System.out.println("Case #"+tempd+": "+result[i]);tempd++;
        }
    }
    
}

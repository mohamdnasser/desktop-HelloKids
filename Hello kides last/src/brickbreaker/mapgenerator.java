
package brickbreaker;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;


public class mapgenerator {
    
    public int map[][];
    public int brickwidth;
    public int brickheight;
    
    /// constractor 
    public mapgenerator(int row , int col)
    {
        map = new int[row][col];
        
        for (int i=0 ;  i< map.length ; i++ )
        {
            for (int j=0 ; j<map[0].length ; j++)
            {
                map[i][j]= 1;
            }
        }
        brickwidth = 540/col;
        brickheight = 150/row;
    }
    
    
    
    
    
    public void draw (Graphics2D g)
    {
          for (int i=0 ;  i< map.length ; i++ )
        {
            for (int j=0 ; j<map[0].length ; j++)
            {
               if ( map[i][j] > 0 )
               {
                   g.setColor(Color.CYAN);
                   g.fillRect( j * brickwidth + 80 , i * brickheight + 50 , brickwidth , brickheight);
                   
                   //// t2seem l mo3b3at
                   g.setStroke(new BasicStroke(3));
                   g.setColor(Color.black);
                   g.drawRect( j * brickwidth + 80 , i * brickheight + 50 , brickwidth , brickheight);
                   
               }
            }
        }
    }
    public void setbrickvalue (int value, int row , int col)
    {
        map[row][col]=value;
    }
}

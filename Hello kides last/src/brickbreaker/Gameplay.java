
package brickbreaker;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Gameplay extends  JPanel  implements KeyListener , ActionListener{
    
    private boolean play = false;
    private int score = 0;
    private int totalbricks = 21;
    
    private Timer timer;
    private int delay = 8 ;
     
    private int playerx = 300;
    
    // coordinates of the ball
    private int ballposx = 120;
    private int ballposy = 350;
    private int ballxdir = -1;
    private int ballydir = -2;
    
    
    private  mapgenerator map;
    
    // constructor 
    
    public Gameplay()
    {
        map = new mapgenerator(3, 7);
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        timer = new Timer(delay, this);
        timer.start(); 
    }
    
    // draw things 
    @Override
    public void paint(Graphics g)
    {
        // background
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);
        
        // drawing map 
        map.draw((Graphics2D)g);
        
        // drawing the score.
        g.setColor(Color.gray);
        g.setFont(new Font("mhmd", Font.BOLD , 25));
        g.drawString("" + score , 30, 30);
        
        //borders 
        g.setColor(Color.white);
        g.fillRect(0, 0, 3, 592); // left 
        g.fillRect(0, 0, 692, 3); // top
        g.fillRect(682, 0, 3, 592);  // right 
        
        // the paddle
        g.setColor(Color.WHITE);
        g.fillRect(playerx, 550, 100, 8);
        
        // the ball 
        g.setColor(Color.yellow);
        g.fillOval(ballposx, ballposy, 20, 20);
        
        if (totalbricks <= 0)
        {
            play= false ;
            ballxdir = 0;
            ballydir = 0;
            
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString(" YOU WON  ", 190, 300);
            
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString(" PRESS ENTER TO RESTART ", 230, 350); 
        }
        
        if (ballposy > 570)
        {
            play= false ;
            ballxdir = 0;
            ballydir = 0;
            g.setColor(Color.red);
            g.setFont(new Font("serif", Font.BOLD, 30));
            g.drawString(" GAME OVER , SCORE: " + score , 190, 300);
            
            g.setFont(new Font("serif", Font.BOLD, 20));
            g.drawString(" PRESS ENTER TO RESTART ", 230, 350);
            
        }
        
        
        g.dispose();
         
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        timer.start();
            if (play)
        {
            
            //  for interaction between the ball and the paddle.
            if (new Rectangle(ballposx, ballposy, 20,20).intersects(new Rectangle(playerx, 550, 100, 8)))
            {
               ballydir = -ballydir; 
            }
            
            
            
            
             A:  for(int i=0 ;i < map.map.length; i++)
            {
                for ( int j=0 ; j< map.map[0].length; j++ )
                {
                    if(map.map[i][j] > 0)
                    {
                        int brickx = j * map.brickwidth + 80;
                        int bricky = i * map.brickheight + 50 ;
                        int brickwidth = map.brickwidth;
                        int brickheight = map.brickheight;
                        
                        Rectangle rect = new Rectangle(brickx, bricky, brickwidth, brickheight);
                        Rectangle ballrect = new Rectangle(ballposx, ballposy,20, 20);
                        Rectangle brickrect = rect ;
                        
                        if(ballrect.intersects(brickrect))
                        {
                            map.setbrickvalue(0, i, j);
                            totalbricks -- ;
                            score += 5;
                            
                            ///// for left and right intersection.
                            if ( ballposx +  19 <= brickrect.x  || ballposx + 1 >= brickrect.x + brickrect.width)
                            {
                                ballxdir = -ballxdir;
                                
                            }
                            
                            else
                            {
                                ballydir = -ballydir;
                            }
                            
                            
                            break A;
                        }
                        
                    }
                }
            }
            
            
            
            
            ballposx += ballxdir;
            ballposy += ballydir;
            if(ballposx < 0)
            {
                ballxdir = - ballxdir;
            }
            if(ballposy < 0)
            {
                ballydir = -  ballydir;
            }
             ballposy += ballydir;
            if(ballposx > 670)
            {
                ballxdir = - ballxdir;
            }
        }    
           
            
            repaint(); 
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
       
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
        {
            if(playerx >= 600)
            {
                playerx = 600;
            }
            else
            {
                moveRight();
                      
            }
            
        }
        if (e.getKeyCode() == KeyEvent.VK_LEFT )
        {
            if(playerx < 10)
            {
                playerx = 10;
            }
            else
            {
                moveLeft();
                      
            }
            
            if(e.getKeyCode() == KeyEvent.VK_ENTER)
            {
                if ( ! play )
                {
                    play = true ;
                    ballposx = 120;
                    ballposy = 350;
                    ballxdir = -1;
                    ballydir = -2;
                    playerx = 310;
                    score = 0;
                    totalbricks = 21;
                    map = new mapgenerator(3, 7);
                    
                    repaint();
                }
                    
                        
            }
        }
          
    }
    public void moveRight()
    {
        play=true;
        playerx += 30;
    }
     public void moveLeft()
    {
        play=true;
        playerx -= 30;
    }
    
 @Override
    public void keyTyped(KeyEvent e) { }
    @Override
    public void keyReleased(KeyEvent e) {}
   
    
}

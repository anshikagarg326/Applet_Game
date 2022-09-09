import java.awt.*; 
import java.applet.*; 
public class sry extends Applet implements Runnable
{	
	AudioClip ag;
	Image c,l;
	int f=100,k=90;
	int x1=320,x2=290,y=900,z=10,e=20;
	Thread th;
	public void init() 
	{	
		ag=getAudioClip(getCodeBase(),"don.wav"); 
		ag.play();
		c=getImage(getDocumentBase(),"air1.png");
		l=getImage(getDocumentBase(),"s1.png");
		th=new Thread(this);
		th.start();
		setBackground(Color.blue);  
	} 
	public void paint(Graphics g) 
	{ 	
		g.drawImage(c,z,80,this);
		g.drawImage(l,50,20,this);
		g.setColor(Color.yellow);
		//moon
		g.fillArc(1100,y,100,100,150,180); 



		//tree
		g.setColor(Color.black);
		g.drawLine(400,500,400,2000);
		g.drawLine(500,500,500,2000);



		//clouds
		g.setColor(Color.white);
		//1
		g.fillOval(f-30,k-40,50,50); 
		g.fillOval(f,k-60,50,50); 
		g.fillOval(f+10,k-30,50,50);
		//2
		g.fillOval(f+100,k+20,50,50); 
		g.fillOval(f+130,k,50,50); 
		g.fillOval(f+140,k+30,50,50); 	
		//3
		g.fillOval(f-30,k+110,50,50); 
		g.fillOval(f,k+90,50,50); 
		g.fillOval(f+10,k+120,50,50);



		g.setColor(Color.black);
		//3rd
		g.fillRect(1100,370,150,290);
		//1st
		g.fillRect(100,370,150,290);
		//2nd		
		g.fillRect(949,440,150,220);

		
		g.setColor(Color.yellow);
		//1st 
		g.fillRect(120,420,35,25);
		g.fillRect(200,420,35,25);
		g.fillRect(120,490,35,25);
		g.fillRect(200,490,35,25);
		g.fillRect(120,560,35,25);
		g.fillRect(200,560,35,25);
		g.fillRect(120,630,35,25);
		g.fillRect(200,630,35,25);


		//3rd
		g.fillRect(1120,420,35,25);
		g.fillRect(1200,420,35,25);
		g.fillRect(1120,490,35,25);
		g.fillRect(1200,490,35,25);
		g.fillRect(1120,560,35,25);
		g.fillRect(1200,560,35,25);
		g.fillRect(1120,630,35,25);
		g.fillRect(1200,630,35,25);

		
		//2nd
		g.fillRect(970,520,35,25);
		g.fillRect(1040,520,35,25);
		g.fillRect(970,590,35,25);
		g.fillRect(1040,590,35,25);


		//boy
		g.setColor(Color.black);
		g.fillOval(x1-20,510,40,40);
		
		g.setColor(Color.black);
		//line
		g.drawLine(x1,550,x2+30,600);
		//ll
		g.drawLine(x1,600,x2,650);
		//lr
		g.drawLine(x1,600,x2+60,650);
		//hl
		g.drawLine(x1,570,x2,590);
		//hr
		g.drawLine(x1,570,x2+60,590);
	}

	public void run()
	{
		while(true)
		{
			//man
		 	if(x1<=910 && x2<=910) 
		 	{
				x1+=2;
				x2+=2;
		 	}
		 	//moon
		 	if(y>=20)
		 	{
		 		y-=5;
		 	}
		 	//air
		 	if(z<=1600)
		 	{
		 		z+=5;
		 	}
		 	// cloud
		 	if(f<=1000)
			{
				f=f+2;
			}
			try
			{
				Thread.sleep(100);
			}			
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		 repaint();
		}
	}
}  





/*<applet code=sry width=400 height=500>
</applet>*/
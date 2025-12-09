<html>  
<body>  
<applet code="DisplayImage.class" width="300" height="300">  
</applet>  
</body>  
</html>  
above those code will be executed later 
before that make a jpg file in the parent file.



import java.awt.*;  
import java.applet.*;  
 
 
public class DisplayImage extends Applet {  
 
  Image picture;  
 
  public void init() {  
    picture = getImage(getDocumentBase(),"sonoo.jpg");  
  }  
   
  public void paint(Graphics g) {  
    g.drawImage(picture, 30,30, this);  
  }  
     
  }   

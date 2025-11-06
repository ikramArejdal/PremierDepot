package HelloWorldServer ; 
import org.omg.CORBA.ORB ;
import HelloWorldApp.HelloPOA ;
public class HelloServant extends HelloPOA {
	
 private String message =" Bonjour tous Le monde !!";
 private ORB orb;

public void setOrb (ORB orb ) {
	this.orb=orb ;
 }

@Override
public String HelloMessage() {

	return this.message;
			
	
 }


@Override
 public void HelloMessage ( String newHelloMessage ) { 
	message = newHelloMessage ; 
 }

}
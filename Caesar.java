import org.rcd.mvc.*;

public class Caesar
{

	public static void main(String[] args)
	{
		CaesarView theView = new CaesarView("Caesar Cipher Example in MVC");
		CaesarModel theModel = new CaesarModel();

		new CaesarController(theView,theModel);
		theView.setVisible(true);
	}
}
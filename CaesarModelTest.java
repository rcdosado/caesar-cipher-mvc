

import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import org.rcd.mvc.*;
/**
 * Tests for {@link CaesarModel}.
 *
 * @author rcdosado@gmail.com 
 */


@RunWith(JUnit4.class)
public class CaesarModelTest {
	CaesarModel theModel;


	@Before
	public void setUp(){
		theModel = new CaesarModel();
	}
    @Test
    public void testEncryption() {
		
		theModel.setPlainText("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		assertEquals("XYZABCDEFGHIJKLMNOPQRSTUVW",theModel.getEncryptedString());

		theModel.setPlainText("abcdefghijklmnopqrstuvwxyz");
		assertEquals("xyzabcdefghijklmnopqrstuvw",theModel.getEncryptedString());		
	
		theModel.setPlainText("0123456789");
		assertEquals("0123456789",theModel.getEncryptedString());		

		theModel.setPlainText(" ?$%^&*()!<>\'\";:");
		assertEquals(" ?$%^&*()!<>\'\";:",theModel.getEncryptedString());

		theModel.setPlainText("Carpenters");
		assertEquals("Zxombkqbop",theModel.getEncryptedString());

    }
	@Test(expected=IllegalArgumentException.class)
	public void testValidation(){
		
		String emptyStr="";
		String nullStr=null;
		theModel.setPlainText(emptyStr);
		theModel.setPlainText(nullStr);

	}


}

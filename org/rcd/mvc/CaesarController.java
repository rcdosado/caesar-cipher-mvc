package org.rcd.mvc;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

//for copy
import java.awt.datatransfer.*;
import java.awt.Toolkit;



public class CaesarController {
    private CaesarView view;
    private CaesarModel model;


    public CaesarController(CaesarView view, CaesarModel model){

        this.view = view;
        this.model = model;

        this.view.copyBtnListener(new CopyBtnListener());
        this.view.exitBtnListener(new ExitBtnListener());
		this.view.txtInputKeyListener(new TxtInputKeyListener());
	}

	class CopyBtnListener implements ActionListener{

		public void actionPerformed(ActionEvent actionEvent) {
			StringSelection stringSelection = new StringSelection (view.getOutputString());
			Clipboard clpbrd = Toolkit.getDefaultToolkit ().getSystemClipboard ();
			clpbrd.setContents (stringSelection, null);			
        }
    }

    class ExitBtnListener implements ActionListener{

        public void actionPerformed(ActionEvent actionEvent) {            
            //System.out.println("Exit button clicked");

			System.exit(-1);
        }
    }


	class TxtInputKeyListener implements KeyListener{
		
		public void keyTyped(KeyEvent e) {
		//	System.out.println( "KEY TYPED: ");
		}

		/** Handle the key-pressed event from the text field. */
		public void keyPressed(KeyEvent e) {
		//	System.out.println( "KEY PRESSED: ");
		}

		/** Handle the key-released event from the text field. */
		public void keyReleased(KeyEvent e) {
			model.setPlainText(view.getInputString());
			view.setOutputString(model.getEncryptedString( ));
		}
	}




}
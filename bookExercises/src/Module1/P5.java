package Module1;

import javax.swing.JOptionPane;

/*Modify the following code so that the dialog continues with the message
“My name is Hal! What would you like me to do?”
		Discard the user’s input and  display a message such as  I'm sorry, Dave. I'm afraid I can't do that.
		Replace Dave with the name that was provided by the user.

 * import javax.swing.JOptionPane;
 * public class DialogViewer {
 *    public static void main(String[] args) {
 *       String name = JOptionPane.showInputDialog("What is your name?");
 *       System.out.println(name);
 *       }
 *    }
 */

public class P5 {

	public static void main(String[] args) {
		JOptionPane.showInputDialog("Hi my name is Hal! what would you like me to do?");
		JOptionPane.showMessageDialog(null, "I'm sorry, Dave. I'm afraid I can't do that");

	}

}

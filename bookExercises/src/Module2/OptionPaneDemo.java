package Module2;

import javax.swing.JOptionPane;

public class OptionPaneDemo {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog("Enter price: ");
		double price = Double.parseDouble(input);
		final double TAX_RATE = 8.5;
		price = price * (1 + TAX_RATE / 100);
		JOptionPane.showMessageDialog(null, "Price after tax: " + price);
	}

}

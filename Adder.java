import javax.swing.JOptionPane;
public class Adder
{
	public static void main(String[] args) {
		String firstNumber, secondNumber, result;
		int num1, num2, sum;

		//read user number
		firstNumber = JOptionPane.showInputDialog("Enter first number:");
		//System.out.println(firstNumber);
		secondNumber = JOptionPane.showInputDialog("Enter second number:");

		//convert number
		num1 = Integer.parseInt(firstNumber);
		num2 = Integer.parseInt(secondNumber);

		result = num1 + num2 ;
		//result = firstNumber+"+"+secondNumber+"="+sum;
		//display results
		//JOptionPane.showMessageDialog(null, result, "Results", JOptionPane . INFORMATION_MESSAGE);

	}
}

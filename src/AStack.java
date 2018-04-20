public class AStack {

	public static void main(String[] args) {
		StringStack myStack = new StringStack(255);
		try {

			myStack.push("Computer Science is fun!!");
			System.out.println(myStack.topValue());
			myStack.push("CSCI IS FUN!!");
			System.out.println(myStack.topValue());
			System.out.println(myStack.pop());
			myStack.push("CofC");
			System.out.println(myStack.topValue());
			myStack.push("Data Structers");
			System.out.println(myStack.topValue());
			System.out.println(myStack.pop());

		}

		catch (StringTooLongException e) {
			System.out.println(e.getMessage());

		} catch (StackIsEmptyException e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println(myStack.toString());
		}

	}
}
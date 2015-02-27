
public class ExampleExecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String portNames[] = {"/dev/tty/some_name"};
		
		SerialReceiver receiver = new SerialReceiver(portNames, new OutputProtocol() {
			public void command(String message) {
				System.out.println(message);
			}
		});
	}

}

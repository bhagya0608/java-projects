package abc;

	interface Printable{
		
		void print();
	}
class Message implements Printable{
	public void print(){
		System.out.println("Hello from interface");
		}
}
class interfaceexample{
	public static void main(String as[]){
		Message msg=new Message();
		msg.print();
	}
}
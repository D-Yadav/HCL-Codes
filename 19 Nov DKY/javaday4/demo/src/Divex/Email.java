package Divex;
class InvalidEmailException extends Exception{
	public InvalidEmailException(String error) {
		super(error);
	}
}
class InvalidUserException extends Exception{
	public InvalidUserException(String error) {
		// TODO Auto-generated constructor stub
		super(error);
	}
}
public class Email { 
	public void show(String email) throws InvalidEmailException, InvalidUserException{
		boolean flag=true;
		if(email.indexOf('@')==-1){
			flag=false;
			throw new InvalidEmailException("@ is not found");
		}
		String user=email.substring(0, email.indexOf('@'));
		if(user.length()<5||user.length()>12){
			flag=false;
			throw new InvalidUserException("length of username is not between 5 to 12 chars");
			
		}
		if(flag==true){
		
			System.out.println(email);
		}
	}

	public static void main(String[] args) {
		try {
			new Email().show("sne@hcl.com");
		} catch (InvalidEmailException | InvalidUserException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

package inheritance;

public class Version2 extends Version1 {
public void voicemail() {
	System.out.println("Voicemail from Version2");
}
@Override
public void call() {
	System.out.println("Call from Version2");
}
}

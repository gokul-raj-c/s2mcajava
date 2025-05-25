import java.awt.*;
public class AwtApp1
{
AwtApp1()
{
Frame f=new Frame("First Frame");
//setTitle("First Frame");
f.setSize(300,300);
f.setVisible(true);

Label firstName = new Label("First Name");
firstName.setBounds(20, 50, 80, 20);

Label lastName = new Label("Last Name");
lastName.setBounds(20, 80, 80, 20);

Label dob = new Label("Date of Birth");
dob.setBounds(20, 110, 80, 20);

TextField firstNameTF = new TextField();
firstNameTF.setBounds(120, 50, 100, 20);
TextField lastNameTF = new TextField();
lastNameTF.setBounds(120, 80, 100, 20);

TextField dobTF = new TextField();
dobTF.setBounds(120, 110, 100, 20);

Button sbmt = new Button("Submit");
sbmt.setBounds(20, 160, 100, 30);
Button reset = new Button("Reset");
reset.setBounds(120,160,100,30);

f.add(firstName);
f.add(lastName);
f.add(dob);
f.add(firstNameTF);
f.add(lastNameTF);
f.add(dobTF);
f.add(sbmt);
f.add(reset);
}
public static void main(String[] args) 
{
AwtApp1 awt = new AwtApp1();
}
}

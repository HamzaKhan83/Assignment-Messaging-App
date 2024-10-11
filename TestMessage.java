import java.util.Scanner;

public class TestMessage{
    public static void main(String[] args) {
        
              MessagingApp app=new MessagingApp();
              Scanner scanner=new Scanner(System.in);

      while(true){
        

             System.out.println("1-Add Contact");
             System.out.println("2-Display contacts");
             System.out.println("3-Send Message");
             System.out.println("4-Display Message");
             System.out.println("5-Search Message");
             System.out.println("6-Delete Message");
             System.out.println("7-Exit");

             int choice=scanner.nextInt();
             scanner.nextLine();

              switch(choice){
                          
                    case 1:
                    System.out.println("Contact name:");
                    
                    String name=scanner.nextLine();
                    System.out.println("Contact number:");
                    String num=scanner.nextLine();

                    app.addContact(name, num);
                     break;

                    case 2:
                    app.displayContact();
                    break;

                    case 3:

                    System.out.println("Who do you want to send message:");
                    String n=scanner.nextLine();
                    app.addMessage(n);
                    break;


                    case 4:
                    System.out.println("Whose message do you want to display:");
                    String a=scanner.nextLine();
                    app.displayMessage(a);
                       break;

                    case 5:
                    System.out.println("Whose message do you want to search:");
                    String b=scanner.nextLine();
                    System.out.println("Message id:");  
                    String c=scanner.nextLine();
                    app.searchMessage(b, c);
                    break;


                    case 6:
                    System.out.println("which message do you want to delete?");
                    System.out.println("Name");
                    String n1=scanner.nextLine();
                    System.out.println("ID:");
                    String d=scanner.nextLine();
                    app.deleteMessage(n1, d);
                         break;

                    case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");


                   }


                   System.out.println("Do you want to perform another action? (8): ");
                                
                      int program=scanner.nextInt();
                      if(program!=8){
                        System.out.println("Exiting");
                        break;

                      }
    }
}
}
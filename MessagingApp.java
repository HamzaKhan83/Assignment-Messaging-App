import java.util.Scanner;


public class MessagingApp{

    private String[][] contact;

    private Message[][] m1;

    int contactCount;
    int chatCount[];

    MessagingApp(){

        contact=new String[100][3];
        m1=new Message[100][100];
        contactCount=0;
        chatCount=new int[100];
    }


    public void addContact(String name,String number){
              
        contact[contactCount][1]=name;
        contact[contactCount][2]=number;
        contact[contactCount][0]=Integer.toString(contactCount+1);
        contactCount++;

        System.out.println("Contact saved");




    }

    public int findIndexOfContact(String name){
        for(int i=0;i<contactCount;i++){

            if(contact[i][1].equals(name))
                return i;
            
        }
        return -1;



    }

    public void displayContact(){
                       
        for(int i=0;i<contactCount;i++){

            System.out.println(" Name:"+contact[i][1]+" ID: "+contact[i][0]+" Number: "+contact[i][2]);
        }
        

    }


    public void addMessage(String name){
       int index=findIndexOfContact(name);
       int choice;


        if(index!=-1){
      
       System.out.println("Message to "+name);
       do{

        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the id:");
        String id=s1.nextLine();
        System.out.println("Enter message:");
        String message=s1.nextLine();
           
        Message msg=new Message(name, message,id);
        m1[index][chatCount[index]]=msg;
        chatCount[index]++;
        System.out.println("Message sent");

        System.out.println("For another message type 1");
         choice=s1.nextInt();

       }
       while(choice==1);

        }else{
            System.out.println("No contact found and no message sent");
        }

    }


    public void displayMessage(String name){

        int index=findIndexOfContact(name);
        if(index!=-1){
           if(chatCount[index]==0){

                System.out.println("The contact has no messages");
           }else {  
              for(int i=0;i<chatCount[index];i++){
                          System.out.println(m1[index][i]);
               }
   
             }
         }else{
        System.out.println("No contact found");
       }
       }

           public void searchMessage(String name,String id){
            int index=findIndexOfContact(name);

            if(index!=-1){

                for(int i=0;i<chatCount[index];i++){
                   if(m1[index][i].getId().equals(id)){
                       System.out.println("Message found");
                       System.out.println(m1[index][i]);

                   }
                }
            } else{
                System.out.println("Message not found");
            }
           }
               
           public void deleteMessage(String name,String id){
            int index=findIndexOfContact(name);

            if(index!=-1){

                for(int i=0;i<chatCount[index];i++){
                   if(m1[index][i].getId().equals(id)){
                    System.out.println("Message deleted");
                       m1[index][i]=null;
                       System.out.println(m1[index][i]);
                      

                   }
                }
            } else{
                System.out.println("Message not found");
            }
           }

}
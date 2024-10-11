import java.time.LocalDateTime;

public class Message{

String sender="Hamza";
String receiver;
String id;
Boolean status;
LocalDateTime time;
String text;

Message(String receiver,String text,String id ){
this.setReceiver(receiver);

this.setId(id);
this.setText(text);
this.time=LocalDateTime.now();
}

public void setId(String id){
    this.id=id;
}
public String getId(){
    return id;
}
public void setReceiver(String receiver){
this.receiver=receiver;
}

public String getReceiver(){
    return receiver;
}



public void setText(String text){
    this.text=text;
}
public String getText(){
    return text;
}

public void setStatus(Boolean status){
    this.status=status;
}

public Boolean getStatus(){
    return status;
}

@Override
public String toString(){
    return "  TO : "+receiver+" from: "+sender+ " ID: "+id+" time= "+time+ "\n Message=  "+text;
}

@Override
public boolean equals(Object obj){

if(this==obj)return true;
if(!(this.getClass()==obj.getClass())){
    return false;
}


Message msg=(Message)obj;
return id.equals(msg.id);

}


}

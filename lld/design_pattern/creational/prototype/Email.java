package design_pattern.creational.prototype;

public class Email implements Copiable<Email>{

   private String sender;
   private String receiver;
   private String subject;
   private String body;


   Email(String sender,String receiver,String subject,String body)
   {
       this.receiver = receiver;
       this.sender = sender;
       this.body = body;
       this.subject = subject;

   }

   Email(Email e){
         this.subject = e.subject;
         this.sender = e.sender;
         this.body = e.body;
         this.receiver = e.receiver;
    }


    @Override
    public Email copy() {
        return new Email(this);            // passing current object to call copy constructor.
    }

    String getSender()
    {
        return this.sender;
    }

    String getReceiver()
    {
        return this.receiver;
    }

    String getSubject()
    {
        return this.subject;
    }

    String getBody()
    {
        return this.body;
    }
}

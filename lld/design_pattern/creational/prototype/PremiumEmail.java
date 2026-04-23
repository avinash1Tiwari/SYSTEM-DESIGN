package design_pattern.creational.prototype;

public class PremiumEmail extends Email{

    String cc;
    String bcc;

    PremiumEmail(String sender, String receiver, String subject, String body,String cc,String bcc) {
        super(sender, receiver, subject, body);
        this.cc = cc;
        this.bcc = bcc;
    }

    PremiumEmail(PremiumEmail pe)
    {
        super(pe);
        this.cc = pe.cc;
        this.bcc = pe.bcc;
    }

    @Override
    public PremiumEmail copy() {
        return new PremiumEmail(this);
    }
}

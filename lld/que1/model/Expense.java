package que1.model;

public class Expense {
    private Integer expanse_id;
    private String expanseName;
    private ExpanseType expanseType;
    private Double expanseAmount;
    private Integer trip_id;

     public Expense(String expanseName,ExpanseType expanseType,Double expanseAmount, Integer trip_id)
     {
         this.expanseName = expanseName;
         this.expanseType = expanseType;
         this.expanseAmount = expanseAmount;
         this.trip_id = trip_id;
     }


    public String getExpanseName()
    {
        return this.expanseName;
    }

    public ExpanseType getExpanseType()
    {
        return this.expanseType;
    }

    public Double getExpanseAmount() {
        return expanseAmount;
    }

    public Integer getTrip_id(){
         return this.trip_id;
    }
}


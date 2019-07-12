public class AppleStockCount {
    public static void main(String[] args) {
  
      if (args.length == 0) {
          System.out.println("Please give me a qty!");
          return;
      }
  
      int qty = Integer.parseInt(args[0]);
      double cost = 4.50;
      double total;
      boolean isDozen = qty %12 == 0;
      // System.out.println(isDosen);

  
      if (qty < 1) {
          System.out.println("Out of stock.");
        }
      else {
        total = qty * cost;
  
        StringBuilder message = new StringBuilder();
        if(isDozen){
          message.append("You have bought ");
          message.append(qty / 12);
          message.append(" dozen");

        }
        else{
          message.append("You have bought ");
          message.append(qty);
          message.append(" apple");

        }

      
        if (qty > 1) {
          message.append("s");
        }
        message.append(" for a total cost of ");
        message.append(total);
        message.append(".");
  
        System.out.println(message.toString());
    }
}
}
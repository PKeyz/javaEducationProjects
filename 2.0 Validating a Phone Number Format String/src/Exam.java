public abstract class Plant  {
    String [] scientificName = { };
    int growSize;
    String lastWatering (Date);
    poisonous;
}

public class Hahnenfussgewaechse extends Plant implements  poisonous{
    poison(true);

        }


        public class Rosengewaechse extends Plant implements poisonous{
        poison (false);

            @Override
            String lastWatering() {
                return super.lastWatering();
            }

        }

        interface poisonous () {

            PlantComponent[] poison = new PlantComponent[];
        }

        


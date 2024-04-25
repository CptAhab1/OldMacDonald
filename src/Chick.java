public class Chick implements Animal{
    private String myType;
    private String mySound;

    private boolean isConfused = false;

    public Chick(){
        myType = "chick";
    }

    public Chick(boolean hasTwoSounds){
        myType = "chick";
        isConfused = hasTwoSounds;
    }

    private String cheepOrCluck(){
        int soundProbability = Math.round((int)(10*Math.random()));
        if(soundProbability%2==0)
            mySound = "cheep";
        else
            mySound = "cluck";

        return mySound;
    }
    public String getSound(){
        if (isConfused)
            cheepOrCluck();
        else{
            mySound = "cluck";
        }

        return mySound;
    }
    public String getType(){return myType;}
}
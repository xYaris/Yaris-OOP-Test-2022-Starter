// GIT WAS GIVING ME PROBLEMS WHEN TRYING TO COMMIT AND DIDNT WANT TO WORK WITH ME SO APOLOGIES. 
//TRIED TO COMMIT - 3.44PM (Creating the constructor and initialising the variables)
//TRIED TO COMMIT - 4.30PM (Creating the array list and trying to create the table)
//TRIED TO COMMIT - 5.21PM (Attempting to draw the visualisation)
//FINAL COMMIT - 6.54PM (BUG IS SOMEWHAT DRAWN)


package ie.tudublin;
import processing.data.*;

public class Nematode 
{


    public Nematode(String name, int length, int limbs, String gender)
    {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
    }

    public Nematode (TableRow tr) 
    {
        this(
            tr.getString("name"), 
            tr.getInt("length"),
            tr.getInt("limbs"),
            tr.getString("gender")
            );
    }


    private String name;
    private int length;
    private int limbs;
    private String gender;


   
    public String getName() 
    {
        return name;
    }

 
    public void setName(String name) 
    {
        this.name = name;
    }

   
    public int getLength() 
    {
        return length;
    }


    public void setLength(int length) 
    {
        this.length = length;
    }

  
    public int getLimbs() {
        return limbs;
    }

  
    public void setLimbs(int limbs) 
    {
        this.limbs = limbs;
    }


    public String getGender() 
    {
        return gender;
    }

  
    public void setGender(String gender) 
    {
        this.gender = gender;
    }

   
    public String toString()
    {
        return "Nematode " + name + ", length: " + length + ", limbs: " + limbs + ", gender: " + gender ;
    }

}

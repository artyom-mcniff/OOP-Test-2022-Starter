package ie.tudublin;

import processing.data.TableRow;

public class Nematode {
    //name
    String name;
    //length
    int length;
    //limbs
    int limbs;
    //gender
    String gender;
    //eyes
    int eyes;



    
    @Override
    public String toString() {
        return "Nematode [eyes=" + eyes + ", gender=" + gender + ", length=" + length + ", limbs=" + limbs + ", name="
                + name + "]";
    }

    

    public Nematode(String name, int length, int limbs, String gender, int eyes) {
        this.name = name;
        this.length = length;
        this.limbs = limbs;
        this.gender = gender;
        this.eyes = eyes;
    }

    public Nematode(TableRow tr)
    {
        this(tr.getString("name"), tr.getInt("length"), tr.getInt("limbs"), tr.getString("gender"), tr.getInt("eyes"));
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getLimbs() {
        return limbs;
    }
    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getEyes() {
        return eyes;
    }
    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    

}
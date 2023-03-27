package uwcTest;

//UWCPointsCalculation will extends StudentResults as StudentResults is the super class
public class UWCPointsCalculation extends StudentResults{

    public UWCPointsCalculation(double mathNscPercent, double englishNscPercent, double loNscPercent,
            double other1NscPercent, double other2NscPercent, double other3NscPercent, double other4NscPercent,
            double other5NscPercent) {
        super(mathNscPercent, englishNscPercent, loNscPercent, other1NscPercent, other2NscPercent, other3NscPercent,
                other4NscPercent, other5NscPercent);
    }

    //Determining the users Math point
    public void uwcMathPoint(double mathNscPercent){
        if(mathNscPercent < 20){
            this.mathNscPercent = 0;
        }else if(mathNscPercent >= 20 && mathNscPercent<= 29){
            this.mathNscPercent = 1;
        }else if(mathNscPercent >= 30 && mathNscPercent <= 39){
            this.mathNscPercent = 3;
        }else if(mathNscPercent >= 40 && mathNscPercent <= 49){
            this.mathNscPercent = 5;
        }else if(mathNscPercent >= 50 && mathNscPercent <= 59){
            this.mathNscPercent = 7;
        }else if(mathNscPercent >= 60 && mathNscPercent <= 69){
            this.mathNscPercent = 9;
        }else if(mathNscPercent >= 70 && mathNscPercent <= 79){
            this.mathNscPercent = 11;
        }else if(mathNscPercent >= 80 && mathNscPercent <= 89){
            this.mathNscPercent = 13;
        }else if(mathNscPercent >= 90 && mathNscPercent <=100){
            this.mathNscPercent = 15;
        }

    }

    //Determining the users English point
    public void uwcEnglishPoint(double englishNscPercent){
        if(englishNscPercent < 20){
            this.englishNscPercent = 0;
        }else if(englishNscPercent >= 20 && englishNscPercent<= 29){
            this.englishNscPercent = 1;
        }else if(englishNscPercent >= 30 && englishNscPercent <= 39){
            this.englishNscPercent = 3;
        }else if(englishNscPercent >= 40 && englishNscPercent <= 49){
            this.englishNscPercent = 5;
        }else if(englishNscPercent >= 50 && englishNscPercent <= 59){
            this.englishNscPercent = 7;
        }else if(englishNscPercent >= 60 && englishNscPercent <= 59){
            this.englishNscPercent = 9;
        }else if(englishNscPercent >= 70 && englishNscPercent <= 79){
            this.englishNscPercent = 11;
        }else if(englishNscPercent >= 80 && englishNscPercent <= 89){
            this.englishNscPercent = 13;
        }else if(englishNscPercent >= 90 && englishNscPercent <=100){
            this.englishNscPercent = 15;
        }
    }

    //Determining the users Life Orientation Point
    public void uwcLoPoint(double loNscPercent){
        if(loNscPercent < 20){
            this.loNscPercent = 0;
        }else if(loNscPercent >= 20 && loNscPercent<= 29){
            this.loNscPercent = 1;
        }else if(loNscPercent >= 30 && loNscPercent <= 39){
            this.loNscPercent = 1;
        }else if(loNscPercent >= 40 && loNscPercent <= 49){
            this.loNscPercent = 1;
        }else if(loNscPercent >= 50 && loNscPercent <= 59){
            this.loNscPercent = 2;
        }else if(loNscPercent >= 60 && loNscPercent <= 59){
            this.loNscPercent = 2;
        }else if(loNscPercent >= 70 && loNscPercent <= 79){
            this.loNscPercent = 2;
        }else if(loNscPercent >= 80 && loNscPercent <= 89){
            this.loNscPercent = 3;
        }else if(loNscPercent >= 90 && loNscPercent <=100){
            this.loNscPercent = 3;
        }
    }

    //Determining the users points for their other subjects(1)
    public void uwcOther1NscPoint(double other1NscPercent){
        if(other1NscPercent < 20){
            this.other1NscPercent = 0;
        }else if(other1NscPercent >= 20 && other1NscPercent<= 29){
            this.other1NscPercent = 1;
        }else if(other1NscPercent >= 30 && other1NscPercent <= 39){
            this.other1NscPercent = 2;
        }else if(other1NscPercent >= 40 && other1NscPercent <= 49){
            this.other1NscPercent = 3;
        }else if(other1NscPercent >= 50 && other1NscPercent <= 59){
            this.other1NscPercent = 4;
        }else if(other1NscPercent >= 60 && other1NscPercent <= 69){
            this.other1NscPercent = 5;
        }else if(other1NscPercent >= 70 && other1NscPercent <= 79){
            this.other1NscPercent = 6;
        }else if(other1NscPercent >= 80 && other1NscPercent <= 89){
            this.other1NscPercent = 7;
        }else if(other1NscPercent >= 90 && other1NscPercent <=100){
            this.other1NscPercent = 8;
        }
    }

    //Determining the users points for their other subjects(2)
    public void uwcOther2NscPoint(double other2NscPercent){
        if(other2NscPercent < 20){
            this.other2NscPercent = 0;
        }else if(other2NscPercent >= 20 && other2NscPercent<= 29){
            this.other2NscPercent = 1;
        }else if(other2NscPercent >= 30 && other2NscPercent <= 39){
            this.other2NscPercent = 2;
        }else if(other2NscPercent >= 40 && other2NscPercent <= 49){
            this.other2NscPercent = 3;
        }else if(other2NscPercent >= 50 && other2NscPercent <= 59){
            this.other2NscPercent = 4;
        }else if(other2NscPercent >= 60 && other2NscPercent <= 69){
            this.other2NscPercent = 5;
        }else if(other2NscPercent >= 70 && other2NscPercent <= 79){
            this.other2NscPercent = 6;
        }else if(other2NscPercent >= 80 && other2NscPercent <= 89){
            this.other2NscPercent = 7;
        }else if(other2NscPercent >= 90 && other2NscPercent <=100){
            this.other2NscPercent = 8;
        }
    }

    //Determining the users points for their other subjects(3)
    public void uwcOther3NscPoint(double other3NscPercent){
        if(other3NscPercent < 20){
            this.other3NscPercent = 0;
        }else if(other3NscPercent >= 20 && other3NscPercent<= 29){
            this.other3NscPercent = 1;
        }else if(other3NscPercent >= 30 && other3NscPercent <= 39){
            this.other3NscPercent = 2;
        }else if(other3NscPercent >= 40 && other3NscPercent <= 49){
            this.other3NscPercent = 3;
        }else if(other3NscPercent >= 50 && other3NscPercent <= 59){
            this.other3NscPercent = 4;
        }else if(other3NscPercent >= 60 && other3NscPercent <= 69){
            this.other3NscPercent = 5;
        }else if(other3NscPercent >= 70 && other3NscPercent <= 79){
            this.other3NscPercent = 6;
        }else if(other3NscPercent >= 80 && other3NscPercent <= 89){
            this.other3NscPercent = 7;
        }else if(other3NscPercent >= 90 && other3NscPercent <=100){
            this.other3NscPercent = 8;
        }
    }

    //Determining the users points for their other subjects(4)
    public void uwcOther4NscPoint(double other4NscPercent){
        if(other4NscPercent < 20){
            this.other4NscPercent = 0;
        }else if(other4NscPercent >= 20 && other4NscPercent<= 29){
            this.other4NscPercent = 1;
        }else if(other4NscPercent >= 30 && other4NscPercent <= 39){
            this.other4NscPercent = 2;
        }else if(other4NscPercent >= 40 && other4NscPercent <= 49){
            this.other4NscPercent = 3;
        }else if(other4NscPercent >= 50 && other4NscPercent <= 59){
            this.other4NscPercent = 4;
        }else if(other4NscPercent >= 60 && other4NscPercent <= 69){
            this.other4NscPercent = 5;
        }else if(other4NscPercent >= 70 && other4NscPercent <= 79){
            this.other4NscPercent = 6;
        }else if(other4NscPercent >= 80 && other4NscPercent <= 89){
            this.other4NscPercent = 7;
        }else if(other4NscPercent >= 90 && other4NscPercent <=100){
            this.other4NscPercent = 8;
        }
    }

    //Determining the users points for their other subjects(5)
    public void uwcOther5NscPoint(double other5NscPercent){
        if(other5NscPercent < 20){
            this.other5NscPercent = 0;
        }else if(other5NscPercent >= 20 && other5NscPercent<= 29){
            this.other5NscPercent = 1;
        }else if(other5NscPercent >= 30 && other5NscPercent <= 39){
            this.other5NscPercent = 2;
        }else if(other5NscPercent >= 40 && other5NscPercent <= 49){
            this.other5NscPercent = 3;
        }else if(other5NscPercent >= 50 && other5NscPercent <= 59){
            this.other5NscPercent = 4;
        }else if(other5NscPercent >= 60 && other5NscPercent <= 69){
            this.other5NscPercent = 5;
        }else if(other5NscPercent >= 70 && other5NscPercent <= 79){
            this.other5NscPercent = 6;
        }else if(other5NscPercent >= 80 && other5NscPercent <= 89){
            this.other5NscPercent = 7;
        }else if(other5NscPercent >= 90 && other5NscPercent <=100){
            this.other5NscPercent = 8;
        }
    }

    //Calculating the total UWC points and returnifn the total
    public double pointTotal(){
        double total = mathNscPercent + englishNscPercent + loNscPercent + other1NscPercent + other2NscPercent + other3NscPercent +
        other4NscPercent + other5NscPercent;
        Math.round(total);
        return total;
    }
    
    //Overriding the toString method to output the details of the UWCPointsCalculation object
    @Override
    public String toString() {
        String str = "Points: " + "\n" + "Maths: " + mathNscPercent
        +"\n"+ "English: " + englishNscPercent +"\n" + "Life Orientation: " + loNscPercent + "\n" + "Other Subjects Points: " + "\n" +
        "Other subject 1: " + other1NscPercent + "\n" + "Other subject 2: " + other2NscPercent + "\n" + "Other Subject 3: " + other3NscPercent + 
        "\n" + "Other subject 4: " + other4NscPercent + "\n" + "Other subject 5: " + other5NscPercent;
        return str;
    }
    
}


package za.ac.cput.calcapsgui2;


public class UWCPointsCalculation extends StudentResults{
    
    public UWCPointsCalculation(double mathNscPercent, double languageNscPercent,
            double loNscPercent, double firstBestPercent, double secondBestPercent,
            double thirdBestPercent, double additionalSub1Percent, double additionalSub2Percent){
        super(mathNscPercent, languageNscPercent, loNscPercent, firstBestPercent, secondBestPercent, thirdBestPercent, additionalSub1Percent, additionalSub2Percent);}
    
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
     
     public void uwcLanguagePoint(double languageNscPercent){
        if(languageNscPercent < 20){
            this.languageNscPercent = 0;
        }else if(languageNscPercent >= 20 && languageNscPercent<= 29){
            this.languageNscPercent = 1;
        }else if(languageNscPercent >= 30 && languageNscPercent <= 39){
            this.languageNscPercent = 3;
        }else if(languageNscPercent >= 40 && languageNscPercent <= 49){
            this.languageNscPercent = 5;
        }else if(languageNscPercent >= 50 && languageNscPercent <= 59){
            this.languageNscPercent = 7;
        }else if(languageNscPercent >= 60 && languageNscPercent <= 59){
            this.languageNscPercent = 9;
        }else if(languageNscPercent >= 70 && languageNscPercent <= 79){
            this.languageNscPercent = 11;
        }else if(languageNscPercent >= 80 && languageNscPercent <= 89){
            this.languageNscPercent = 13;
        }else if(languageNscPercent >= 90 && languageNscPercent <=100){
            this.languageNscPercent = 15;
        }
    }
    
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
     
     public void uwcFirstBestNscPoint(double firstBestPercent){
        if(firstBestPercent < 20){
            this.firstBestPercent = 0;
        }else if(firstBestPercent >= 20 && firstBestPercent<= 29){
            this.firstBestPercent = 1;
        }else if(firstBestPercent >= 30 && firstBestPercent <= 39){
            this.firstBestPercent = 2;
        }else if(firstBestPercent >= 40 && firstBestPercent <= 49){
            this.firstBestPercent = 3;
        }else if(firstBestPercent >= 50 && firstBestPercent <= 59){
            this.firstBestPercent = 4;
        }else if(firstBestPercent >= 60 && firstBestPercent <= 69){
            this.firstBestPercent = 5;
        }else if(firstBestPercent >= 70 && firstBestPercent <= 79){
            this.firstBestPercent = 6;
        }else if(firstBestPercent >= 80 && firstBestPercent <= 89){
            this.firstBestPercent = 7;
        }else if(firstBestPercent >= 90 && firstBestPercent <=100){
            this.firstBestPercent = 8;
        }
    }
     
     public void uwcSecondBestNscPoint(double secondBestPercent){
        if(secondBestPercent < 20){
            this.secondBestPercent = 0;
        }else if(secondBestPercent >= 20 && secondBestPercent<= 29){
            this.secondBestPercent = 1;
        }else if(secondBestPercent >= 30 && secondBestPercent <= 39){
            this.secondBestPercent = 2;
        }else if(secondBestPercent >= 40 && secondBestPercent <= 49){
            this.secondBestPercent = 3;
        }else if(secondBestPercent >= 50 && secondBestPercent <= 59){
            this.secondBestPercent = 4;
        }else if(secondBestPercent >= 60 && secondBestPercent <= 69){
            this.secondBestPercent = 5;
        }else if(secondBestPercent >= 70 && secondBestPercent <= 79){
            this.secondBestPercent = 6;
        }else if(secondBestPercent >= 80 && secondBestPercent <= 89){
            this.secondBestPercent = 7;
        }else if(secondBestPercent >= 90 && secondBestPercent <=100){
            this.secondBestPercent = 8;
        }
    }
     
      public void uwcThirdBestNscPoint(double thirdBestPercent){
        if(thirdBestPercent < 20){
            this.thirdBestPercent = 0;
        }else if(thirdBestPercent >= 20 && thirdBestPercent<= 29){
            this.thirdBestPercent = 1;
        }else if(thirdBestPercent >= 30 && thirdBestPercent <= 39){
            this.thirdBestPercent = 2;
        }else if(thirdBestPercent >= 40 && thirdBestPercent <= 49){
            this.thirdBestPercent = 3;
        }else if(thirdBestPercent >= 50 && thirdBestPercent <= 59){
            this.thirdBestPercent = 4;
        }else if(thirdBestPercent >= 60 && thirdBestPercent <= 69){
            this.thirdBestPercent = 5;
        }else if(thirdBestPercent >= 70 && thirdBestPercent <= 79){
            this.thirdBestPercent = 6;
        }else if(thirdBestPercent >= 80 && thirdBestPercent <= 89){
            this.thirdBestPercent = 7;
        }else if(thirdBestPercent >= 90 && thirdBestPercent <=100){
            this.thirdBestPercent = 8;
        }
    }
     
       public void uwcAdditionalSub1NscPoint(double additionalSub1Percent){
        if(additionalSub1Percent < 20){
            this.additionalSub1Percent = 0;
        }else if(additionalSub1Percent >= 20 && additionalSub1Percent<= 29){
            this.additionalSub1Percent = 1;
        }else if(additionalSub1Percent >= 30 && additionalSub1Percent <= 39){
            this.additionalSub1Percent = 2;
        }else if(additionalSub1Percent >= 40 && additionalSub1Percent <= 49){
            this.additionalSub1Percent = 3;
        }else if(additionalSub1Percent >= 50 && additionalSub1Percent <= 59){
            this.additionalSub1Percent = 4;
        }else if(additionalSub1Percent >= 60 && additionalSub1Percent <= 69){
            this.additionalSub1Percent = 5;
        }else if(additionalSub1Percent >= 70 && additionalSub1Percent <= 79){
            this.additionalSub1Percent = 6;
        }else if(additionalSub1Percent >= 80 && additionalSub1Percent <= 89){
            this.additionalSub1Percent = 7;
        }else if(additionalSub1Percent >= 90 && additionalSub1Percent <=100){
            this.additionalSub1Percent = 8;
        }
    }
      
        public void uwcAdditionalSub2NscPoint(double additionalSub2Percent){
        if(additionalSub2Percent < 20){
            this.additionalSub2Percent = 0;
        }else if(additionalSub2Percent >= 20 && additionalSub2Percent<= 29){
            this.additionalSub2Percent = 1;
        }else if(additionalSub2Percent >= 30 && additionalSub2Percent <= 39){
            this.additionalSub2Percent = 2;
        }else if(additionalSub2Percent >= 40 && additionalSub2Percent <= 49){
            this.additionalSub2Percent = 3;
        }else if(additionalSub2Percent >= 50 && additionalSub2Percent <= 59){
            this.additionalSub2Percent = 4;
        }else if(additionalSub2Percent >= 60 && additionalSub2Percent <= 69){
            this.additionalSub2Percent = 5;
        }else if(additionalSub2Percent >= 70 && additionalSub2Percent <= 79){
            this.additionalSub2Percent = 6;
        }else if(additionalSub2Percent >= 80 && additionalSub2Percent <= 89){
            this.additionalSub2Percent = 7;
        }else if(additionalSub2Percent >= 90 && additionalSub2Percent <=100){
            this.additionalSub2Percent = 8;
        }
    }
        
         public double pointTotal(){
        double total = mathNscPercent + languageNscPercent + loNscPercent + firstBestPercent + secondBestPercent + thirdBestPercent +
        additionalSub1Percent + additionalSub2Percent;
        Math.round(total);
        return total;
    }
       
}

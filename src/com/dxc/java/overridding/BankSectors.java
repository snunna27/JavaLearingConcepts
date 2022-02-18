package com.dxc.java.overridding;

public class BankSectors {
        int RateOfInterestForHomeLone() {
            return 0;
        }
    }

    class SBI extends BankSectors{
        int RateOfInterestForHomeLone(){
            return 8;
        }
    }

    class ICICI extends BankSectors{
        int RateOfInterestForHomeLone(){
            return 7;
        }
    }
    class AXIS extends BankSectors{
        int RateOfInterestForHomeLone(){
            return 9;
        }
    }

    class TestBank{
        public static void main(String args[]){
            SBI s=new SBI();
            ICICI i=new ICICI();
            AXIS a=new AXIS();
            System.out.println("SBI Rate of Interest: "+s.RateOfInterestForHomeLone());
            System.out.println("ICICI Rate of Interest: "+i.RateOfInterestForHomeLone());
            System.out.println("AXIS Rate of Interest: "+a.RateOfInterestForHomeLone());
        }
    }

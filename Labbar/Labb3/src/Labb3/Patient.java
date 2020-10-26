package Labb3;

    class Patient {

    final String name;
    private String sickness;

    Patient(String name, String sickness){
        this.name = name;
        this.sickness = sickness;
    }

    Patient(String name){
        this.name = name;
    }

    boolean isSick(){
       return sickness != null;
    }

    String getName(){
        return this.name;
    }

    String getSickness(){
        return this.sickness;
    }

    void takeMedication(Medicine medicine) {
        if (medicine.getTreatmentName().equals(this.sickness)){
            this.sickness = null;
        }
    }
}

public class RowCounter {

private int rowCounter; //Variabel som andra klasser kan inte komma åt.
private int signCounter; //Variabel som andra klasser kan inte komma åt.

public RowCounter(){ //Vi skapar en konstruktor.
    this.rowCounter = 0; //Vi sätter startvärde till 0.
    this.signCounter = 0; //Vi sätter startvärde till 0.
}

public void rowIncrease(){
    this.rowCounter ++; //Varje gång användaren typar in nåt höjs rowcounter med 1.
}

public void signIncrease(int count){
    this.signCounter += count; //Räknar hur många tecken användaren använde i sin input.
}

    public int getRowCounter() { //Vi skapar en getter.
        return rowCounter; //Returnerar rowCounter till main class.
    }

    public int getSignCounter() { //VI skapar en getter.
        return signCounter; //Returnerar signCounter till main class.
    }
}

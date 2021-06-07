public class Printer {

    private int sheets;
    private int toner;

    public Printer(int sheets, int toner) {
        this.sheets = sheets;
        this.toner = toner;
    }

    public int checkSheets() {
        return this.sheets;
    }

    public int checkToner() {
        return this.toner;
    }

    public void print(int pages, int copies) {
         int sheetsRequired = pages*copies;
         if (this.sheets >= sheetsRequired) {
             this.sheets -= sheetsRequired;
             this.toner -= sheetsRequired;
         }
    }
}

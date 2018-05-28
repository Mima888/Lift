
public class Lift {

    int najniziSprat = 1;
    int najvisiSprat = 20;
    int trenutniSprat;

    public Lift() {
    }

    public void liftUp(int sprat) {

        if (sprat < this.trenutniSprat) {
            System.out.println("Mozete ici samo gore.");
        }  if (sprat > this.najvisiSprat) {
            System.out.println("Maksimalan broj spratova je: " + this.najvisiSprat);
        } else {

            do {
                System.out.println("Trenutno ste na " + this.trenutniSprat + "." + " spratu");

                this.trenutniSprat++;
            } while (this.trenutniSprat <= sprat);
        }
    }

    public void liftDown(int saSprata, int naSprat) {

        this.trenutniSprat = saSprata;

        if (saSprata > this.najvisiSprat) {

            System.out.println("Nalazite se na najvisem spratu. Sprat broj: " + saSprata + " ne postoji!");
        } else if (naSprat <= 0) {

            System.out.println("Nalazite se u prizemlju. Sprat broj: " + naSprat + " ne postoji!");
        } else {

            do {

                System.out.println("Trenutno ste na " + this.trenutniSprat + "." + " spratu");

                this.trenutniSprat--;

            } while (this.trenutniSprat >= naSprat);

        }
    }
}

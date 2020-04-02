import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Snake {

// głowa węża
    Coord coord = new Coord(10,10);
    Random rand = new Random();

// zmienna, która przechowuje kierunek (twarz weza)//kierunek startowy węża
    String direction = "RIGHT";

// metody, które zmieniają kierunek (zmiennej, która przechowuje początkowy kierunek)
    void directionUp(){
        this.direction = "UP";
    };
    void directionDown(){
        this.direction = "DOWN";
    };
    void directionRight(){
        this.direction = "RIGHT";
    };
    void directionLeft(){
        this.direction = "LEFT";
    };

    public Snake(Coord coord) {
        this.coord = coord;
    }

// metody do poruszania się w obranym kierunku

    void moveUp(){
        this.coord.setY(coord.getY()-1);
    };
    void moveDown(){
        this.coord.setY(coord.getY()+1);
    };
    void moveRight(){
        this.coord.setX(coord.getX()+1);
    };
    void moveLeft(){
        this.coord.setX(coord.getX()-1);
    };


// lista, która przechowuje elementy ogona
    List<Coord> tail = new ArrayList<>();

    // metoda ma liste, ktora przechowuje elementy ogona
// jak dodaje ogon? dodaje element w miejsce glowy, dlaczego tak, a nie na koncu ogona?
//unikam syt.gdy waz skreca i glowa jest w innej linii niz ogon

// do ogona, który na początku jest głową dodaję bieżącą pozycję głowy
// w skrócie - powiększenie rozmiaru węża

    public void extendTail(){
       tail.add(this.coord);
    }

// metoda, aby wąż się ruszał po zjedzeniu jabłka
    public void move(Coord move){
        System.out.println(move.getX() + " " + move.getY());
        Coord snakeTail = tail.remove(tail.size()-1); //usuwam ostatni element listy
                                                            // z elementami ogona
        this.coord = move; //pozycja glowy = ruch
        tail.add(0,this.coord); //dodaj na początku listy elementow ogona pozycje glowy
    }

// metoda na sprawdzenie, czy trafilismy na sciane planszy (Board)

    public boolean checkIfWall(Coord nextCell){
        for (Coord cell : tail){
            if(cell == nextCell){
                return true;
            }
        }
        return false;
    }









}

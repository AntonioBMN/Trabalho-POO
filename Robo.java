package Trabalho1;

public class Robo {
    public int posX;
    public int posY;
    public int contMov=0;
    public String mover = " ";
    public String collour = " ";

    public Robo(String collour){
        this.posX = 0;
        this.posY = 0;
        this.collour = collour;
    }
    public int getPosX(){
        return posX;
    }
    public void setPosY(int posY){
        this.posY = posY;
    }
    public int getPosY(){
        return posY;
    }
    public void setPosX(int posX){
        this.posX = posX;
    }

    public void setMover(String mover) {
        this.mover = mover;
    }

    public String getMover() {
        return mover;
    }

    public void mover(String mover) throws Main.MovimentoInvalidoException {
    switch(mover){
        case "up":
            posY--;
            contMov++;
            if (posY<0){
                contMov--;
                throw new Main.MovimentoInvalidoException("Movimento Invalido");
            }
            break;
        case "down":
            posY++;
            contMov++;
            if (posY>4){
                contMov--;
                throw new Main.MovimentoInvalidoException("Movimento Invalido");
            }
            break;
        case "right":
            posX++;
            contMov++;
            if (posX>4){
                contMov--;
                throw new Main.MovimentoInvalidoException("Movimento Invalido");
            }
            break;
        case "left":
            posX--;
            contMov++;
            if (posX< 0) {
                contMov--;
                throw new Main.MovimentoInvalidoException("Movimento Invalido");
            }
            break;
        }
    }
       public void mover(int mover) throws Main.MovimentoInvalidoException{
           switch(mover){
               case 1:
                   posY--;
                   contMov++;
                   if (posY<0){
                       contMov--;
                       throw new Main.MovimentoInvalidoException("Movimento Invalido");
                   }
                   break;
               case 2:
                   posY++;
                   contMov++;
                   if (posY>4){
                       contMov--;
                       throw new Main.MovimentoInvalidoException("Movimento Invalido");
                   }
                   break;
               case 3:
                   posX++;
                   contMov++;
                   if (posX>4){
                       contMov--;
                       throw new Main.MovimentoInvalidoException("Movimento Invalido");
                   }
                   break;
               case 4:
                   posX--;
                   contMov++;
                   if (posX< 0) {
                       contMov--;
                       throw new Main.MovimentoInvalidoException("Movimento Invalido");
                   }
                   break;
           }
    }
}

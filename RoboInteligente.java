    package Trabalho1;

    import java.util.Random;

    public class RoboInteligente extends Robo{
        public int movimentoInvalido = 0;
        public int ultimoMovimento = 0;

        public RoboInteligente(String collour) {
            super(collour);

    }

        public void setMovimentoInvalido(int movimentoInvalido) {
            this.movimentoInvalido = movimentoInvalido;
        }

        public int getUltimoMovimento() {
            return ultimoMovimento;
        }

        @Override
        public void mover (int mover) {
            int aux = 0;
            Random r = new Random();
            switch(mover){
                case 1:
                    ultimoMovimento=1;
                    posY--;
                    contMov++;
                if (movimentoInvalido == mover) {
                    if (posX == 0 && posY == 0) {
                        aux = r.nextInt(2)+1;
                        switch (aux) {
                            case 1:
                                posY++;
                                System.out.println("Fui para baixo");
                                movimentoInvalido = 0;
                                break;
                            case 2:
                                posX++;
                                contMov--;
                                System.out.println("Fui para direita");
                                movimentoInvalido = 0;
                                break;
                        }
                    }   else if (posX == 4 && posY == 0){
                        aux = r.nextInt(2)+1;
                        switch (aux) {
                            case 1:
                                posY++;
                                System.out.println("Fui para baixo");
                                movimentoInvalido = 0;
                                break;
                            case 2:
                                posX--;
                                contMov--;
                                System.out.println("Fui para esquerda");
                                movimentoInvalido = 0;
                                break;
                    }
                    } else if (posX<4&&posX>0) {
                        aux = r.nextInt(3)+1;
                        switch (aux) {
                            case 1:
                                posY++;
                                contMov--;
                                System.out.println("Fui para baixo");
                                movimentoInvalido = 0;
                                break;
                            case 2:
                                posX++;
                                contMov--;
                                System.out.println("Fui para direita");
                                movimentoInvalido = 0;
                                break;
                            case 3:
                                posX--;
                                contMov--;
                                System.out.println("Fui para esquerda");
                                movimentoInvalido = 0;
                                break;
                        }
                    }
                }

                    if (posY<0){
                        contMov--;
                        posY++;
                        movimentoInvalido = mover;
                        throw new Main.MovimentoInvalidoException("Movimento Invalido");
                    }


                break;
                case 2:
                    ultimoMovimento=2;
                    posY++;
                    contMov++;
                    if (movimentoInvalido == mover) {
                        if (posX == 0 && posY == 4) {
                            aux = r.nextInt(2)+1;
                            switch (aux) {
                                case 1:
                                    posY--;
                                    System.out.println("Fui para baixo");
                                    movimentoInvalido = 0;
                                    break;
                                case 2:
                                    posX++;
                                    contMov--;
                                    System.out.println("Fui para direita");
                                    movimentoInvalido = 0;
                                    break;
                            }
                        }
                        else if(posX == 4 && posY == 4){
                            aux = r.nextInt(2)+1;
                            switch (aux) {
                                case 1:
                                    posY--;
                                    System.out.println("Fui para cima");
                                    movimentoInvalido = 0;
                                    break;
                                case 2:
                                    posX--;
                                    contMov--;
                                    System.out.println("Fui para esquerda");
                                    movimentoInvalido = 0;
                                    break;
                            }
                        } else if (0<posX && posX<4) {
                            aux = r.nextInt(3)+1;
                            switch (aux) {
                                case 1:
                                    posY--;
                                    contMov--;
                                    System.out.println("Fui para cima");
                                    movimentoInvalido = 0;
                                    break;
                                case 2:
                                    posX++;
                                    contMov--;
                                    System.out.println("Fui para direita");
                                    movimentoInvalido = 0;
                                    break;
                                case 3:
                                    posX--;
                                    contMov--;
                                    System.out.println("Fui para esquerda");
                                    movimentoInvalido = 0;
                                    break;
                            }
                        }
                    }
                    if (posY>4){
                        contMov--;
                        posY--;
                        movimentoInvalido = mover;
                        throw new Main.MovimentoInvalidoException("Movimento Invalido");
                    }
                    break;
                    case 3:
                        ultimoMovimento=3;
                        posX++;
                        contMov++;
                        if (movimentoInvalido == mover) {
                            if (posY == 0 && posX == 4) {
                                aux = r.nextInt(2)+1;
                                switch (aux) {
                                    case 1:
                                        posY++;
                                        System.out.println("Fui para baixo");
                                        movimentoInvalido = 0;
                                        break;
                                    case 2:
                                        posX--;
                                        contMov--;
                                        System.out.println("Fui para esquerda");
                                        movimentoInvalido = 0;
                                        break;
                                }
                            } else if(posY == 4 && posX == 4){
                                aux = r.nextInt(2)+1;
                                switch (aux) {
                                    case 1:
                                        posY--;
                                        System.out.println("Fui para cima");
                                        movimentoInvalido = 0;
                                        break;
                                    case 2:
                                        posX--;
                                        contMov--;
                                        System.out.println("Fui para esquerda");
                                        movimentoInvalido = 0;
                                        break;
                                }

                            }
                            else if (0<posY && posY<4) {
                                aux = r.nextInt(3)+1;
                                switch (aux) {
                                    case 1:
                                        posY--;
                                        contMov--;
                                        System.out.println("Fui para cima");
                                        movimentoInvalido = 0;
                                        break;
                                    case 2:
                                        posX--;
                                        contMov--;
                                        System.out.println("Fui para esquerda");
                                        movimentoInvalido = 0;
                                        break;
                                    case 3:
                                        posY++;
                                        contMov--;
                                        System.out.println("Fui para baixo");
                                        movimentoInvalido = 0;
                                        break;
                                }
                            }
                        }
                        if (posX>4){
                            contMov--;
                            posX--;
                            movimentoInvalido = mover;
                            throw new Main.MovimentoInvalidoException("Movimento Invalido");
                        }
                    break;

                    case 4:
                        ultimoMovimento=4;
                        posX--;
                        contMov++;
                        if (movimentoInvalido == mover) {
                            if (posX == 0 && posY ==0 ) {
                                aux = r.nextInt(2)+1;
                                switch (aux) {
                                    case 1:
                                        posY++;
                                        System.out.println("Fui para baixo");
                                        movimentoInvalido = 0;
                                        break;
                                    case 2:
                                        posX++;
                                        contMov--;
                                        System.out.println("Fui para direita");
                                        movimentoInvalido = 0;
                                        break;
                                }
                            }
                        else if(posX == 0 && posY ==4) {
                            aux = r.nextInt(2)+1;
                            switch (aux) {
                                case 1:
                                    posY--;
                                    System.out.println("Fui para cima");
                                    movimentoInvalido = 0;
                                    break;
                                case 2:
                                    posX++;
                                    contMov--;
                                    System.out.println("Fui para direita");
                                    movimentoInvalido = 0;
                                    break;

                            }
                            } else if (0<posY && posY<4) {
                                aux = r.nextInt(3)+1;
                                switch (aux) {
                                    case 1:
                                        posY--;
                                        contMov--;
                                        System.out.println("Fui para cima");
                                        movimentoInvalido = 0;
                                        break;
                                    case 2:
                                        posX++;
                                        contMov--;
                                        System.out.println("Fui para direita");
                                        movimentoInvalido = 0;
                                        break;
                                    case 3:
                                        posY++;
                                        contMov--;
                                        System.out.println("Fui para baixo");
                                        movimentoInvalido = 0;
                                        break;
                                }
                            }
                        }

                        if (posX< 0) {
                            contMov--;
                            movimentoInvalido = mover;
                            posX++;
                            throw new Main.MovimentoInvalidoException("Movimento Invalido");
                        }
                default:
                    ultimoMovimento=0;
                }
            }
    }
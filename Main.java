package Trabalho1;

    import java.util.Random;
    import java.util.Scanner;

public class Main {
    public static int tamanho = 5;
    public static void mapa(int posX, int posY, int comX, int comY) {
        String mapa[][] = new String[tamanho][tamanho];
        for (int y = 0; y < tamanho; y++) {
            for (int x = 0; x < tamanho; x++) {
                if (x == posX && y == posY) {
                    mapa[x][y] = "X";
                    System.out.print(" " + mapa[x][y] + " ");
                } else if (x == comX && y == comY) {
                    mapa[x][y] = "O";
                    System.out.print(" " + mapa[x][y] + " ");
                } else {mapa[x][y]= "*";
                    System.out.print(" " + mapa[x][y]+ " " );
                }
            }
            System.out.println();
        }
    }
    public static boolean encontrouAlimento(int posX, int posY, int comX, int comY) {
        if (posX == comX && posY == comY) {
            return true;
        } else return false;
    }
    public static class MovimentoInvalidoException extends RuntimeException{
        public static final long serialVersionUID = 1L;
        MovimentoInvalidoException(String msg){
            super (msg);
        }
    }
    public static class Exemplo1 {
        public Exemplo1() {
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            System.out.println("Digite a cor que deseja atribuir ao robô");
            Robo r1 = new Robo(s.next());
            System.out.println("Digite a posição da comida horisontalmente, de 0 a 4");
            int comX = s.nextInt();
            while (comX > tamanho - 1) {
                System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                comX = s.nextInt();
            }
            System.out.println("Digite a posição da comida verticalmente, de 0 a 4");
            int comY = s.nextInt();
            while (comX > tamanho - 1) {
                System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                comY = s.nextInt();
            }

            while (!encontrouAlimento(r1.getPosX(), r1.getPosY(), comX, comY)) {
                System.out.println(r1.getPosX() + " " + r1.getPosY() + " " + comX + " " + comY);
                try {
                    mapa(r1.getPosX(), r1.getPosY(), comX, comY);
                    r1.setMover(s.next());;
                    r1.mover(r1.getMover());
                } catch (Main.MovimentoInvalidoException MovimentoInvalidoException) {
                    if (r1.getPosX() < 0) {
                        r1.posX++;
                        System.out.println("Não podes ir para esquerda");
                    } else  if (r1.getPosX() > tamanho-1) {
                        r1.posX--;
                        System.out.println("Não podes ir para direita");
                    } else if (r1.getPosY() < 0) {
                        System.out.println("Não podes ir para cima");
                        r1.posY++;
                    } else if (r1.getPosY() > tamanho-1) {
                        r1.posY--;
                        System.out.println("Não podes ir para baixo");
                    }
                }
            }
            System.out.println("Ele comeu a comida");
        }
    }

    public static class Exemplo2 {
        public Exemplo2() {
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            System.out.println("Digite a cor que deseja atribuir ao robô 1");
            Robo r1 = new Robo(s.next());
            System.out.println("Digite a cor que deseja atribuir ao robô 2");
            Robo r2 = new Robo(s.next());
                System.out.println("Digite a posição da comida horisontalmente, de 0 a 4");
                int comX = s.nextInt();
                while (comX > tamanho - 1) {
                    System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                    comX = s.nextInt();
                }
                System.out.println("Digite a posição da comida verticalmente, de 0 a 4");
                int comY = s.nextInt();
                while (comX > tamanho - 1) {
                System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                comY = s.nextInt();
            }
            while (((!encontrouAlimento(r1.getPosX(), r1.getPosY(), comX, comY)) && (!encontrouAlimento(r2.getPosX(), r2.getPosY(), comX, comY)))){
                System.out.println();
                try {
                    r1.mover(r.nextInt(4)+1);
                    System.out.println(r1.getPosX()+" "+ r1.getPosY());
                    System.out.println("Matriz robô "+r1.collour);
                    mapa(r1.getPosX(), r1.getPosY(), comX, comY);
                    System.out.println();
                    r2.mover(r.nextInt(4)+1);
                    System.out.println("Matriz robô "+ r2.collour);
                    System.out.println(r1.getPosX()+" "+ r2.getPosY());
                    mapa(r2.getPosX(), r2.getPosY(), comX, comY);

                } catch (MovimentoInvalidoException e) {
                    if (r1.getPosX()<0){
                        r1.posX++;
                        System.out.println("Ir para esquerda não é possivel neste momento " +r1.collour);
                    }
                    if (r2.getPosX()<0){
                        r2.posX++;
                        System.out.println("Ir para esquerda não é possivel neste momento "+r2.collour);
                    }
                    if (r1.getPosY()<0){
                        r1.posY++;
                        System.out.println("Ir para cima não é possivel neste momento " +r1.collour);
                    }
                    if (r2.getPosY()<0){
                        r2.posY++;
                        System.out.println("Ir para cima não é possivel neste momento "+r2.collour);
                    }
                    if(r1.getPosY()>tamanho){
                        r1.posY--;
                        System.out.println("Ir para baixo não é possivel neste momento "+r1.collour);
                    }if(r2.getPosY()>tamanho){
                        r2.posY--;
                        System.out.println("Ir para baixo não é possivel neste momento "+r2.collour);
                    }
                    if (r1.getPosX()>tamanho) {
                        r1.posX--;
                        System.out.println("Ir para direita não é possivel neste momento "+r1.collour);
                    }if (r2.getPosX()>tamanho) {
                        r2.posX++;
                        System.out.println("Ir para direita não é possivel neste momento "+r2.collour);
                    }
                }
            }
            if (encontrouAlimento(r1.getPosX(), r1.getPosY(), comX, comY)==true){
                System.out.println("o Robô "+r1.collour + " comeu a comida. E moveu-se " + r1.contMov + " vezes");
                System.out.println("o Robô "+r2.collour + " não comeu a comida. E moveu-se " + r2.contMov+ " vezes");
                mapa(r1.getPosX(), r1.getPosY(), comX, comY);
            }
            if (encontrouAlimento(r2.getPosX(), r2.getPosY(), comX, comY)==true){
                System.out.println("o Robô "+r2.collour + " comeu a comida. E moveu-se " + r2.contMov + " vezes");
                System.out.println("o Robô "+r1.collour + " não comeu a comida. E moveu-se " + r1.contMov + " vezes");
                mapa(r2.getPosX(), r2.getPosY(), comX, comY);
            }
        }
    }
    public static class Exemplo3 {
        public Exemplo3(){
            Scanner s = new Scanner(System.in);
            Random r = new Random();
            int cont1 = 0;
            int cont2 = 0;
            System.out.println("Digite a cor que deseja atribuir ao robô 1");
            Robo robo = new Robo(s.next());
            System.out.println("Digite a cor que deseja atribuir ao robô 2");
            RoboInteligente roboInteligente = new RoboInteligente(s.next());
            System.out.println("Digite a posição da comida horisontalmente, de 0 a 4");
            int comX = s.nextInt();
            while (comX > tamanho - 1) {
                System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                comX = s.nextInt();
            }
            System.out.println("Digite a posição da comida verticalmente, de 0 a 4");
            int comY = s.nextInt();
            while (comX > tamanho - 1) {
                System.out.println("Você digitou um numero maior que 4, por favor digite novamente numeros entre 0 e 4");
                comY = s.nextInt();
            }
            //item a) Criando a exceção MovimentoInvalidoException
            while (((!encontrouAlimento(robo.getPosX(), robo.getPosY(), comX, comY)) &&
                    (!encontrouAlimento(roboInteligente.getPosX(), roboInteligente.getPosY(), comX, comY)))){
                System.out.println();
                try {
                    robo.mover(r.nextInt(4)+1);
                    System.out.println("Matriz robô "+robo.collour);
                    mapa(robo.getPosX(), robo.getPosY(), comX, comY);
                    System.out.println();
                    roboInteligente.mover(r.nextInt(4)+1);
                    System.out.println("Matriz robô "+ roboInteligente.collour);
                    mapa(roboInteligente.getPosX(), roboInteligente.getPosY(), comX, comY);

                } catch (MovimentoInvalidoException MovimentoInvalidoException) {
                    if (robo.getPosX()<0){
                    robo.posX++;
                    System.out.println("Ir para esquerda não é possivel neste momento " +robo.collour);
                }
                if (roboInteligente.getUltimoMovimento()==4){
                    roboInteligente.posX++;
                    System.out.println("Ir para esquerda não é possivel neste momento "+roboInteligente.collour);
                }
                if (robo.getPosY()<0){
                    robo.posY++;
                    System.out.println("Ir para cima não é possivel neste momento "+robo.collour);
                }
                if (roboInteligente.getUltimoMovimento()==1){
                    roboInteligente.posY++;
                    System.out.println("Ir para cima não é possivel neste momento "+roboInteligente.collour);
                }
                if(robo.getPosY()>tamanho){
                    robo.posY--;
                    System.out.println("Ir para baixo não é possivel neste momento "+robo.collour);
                }if(roboInteligente.getUltimoMovimento()==2){
                    roboInteligente.posY--;
                    System.out.println("Ir para baixo não é possivel neste momento "+roboInteligente.collour);
                }
                if (robo.getPosX()>tamanho) {
                    robo.posX--;
                    System.out.println("Ir para direita não é possivel neste momento "+robo.collour);
                }if (roboInteligente.getUltimoMovimento()==3) {
                    roboInteligente.posX--;
                    System.out.println("Ir para direita não é possivel neste momento "+roboInteligente.collour);
                }
                    System.out.println("Digite novamente");
                }
            }

            if (encontrouAlimento(robo.getPosX(), robo.getPosY(), comX, comY)==true){
                System.out.println("o Robô "+robo.collour + " comeu a comida. E moveu-se " + robo.contMov + " vezes");
                System.out.println("o Robô "+roboInteligente.collour + " não comeu a comida. E moveu-se " + roboInteligente.contMov + " vezes");
                mapa(robo.getPosX(), robo.getPosY(), comX, comY);
            }
            if (encontrouAlimento(roboInteligente.getPosX(), roboInteligente.getPosY(), comX, comY)==true){
                System.out.println("o Robô "+roboInteligente.collour + " comeu a comida. E moveu-se " + robo.contMov + " vezes");
                System.out.println("o Robô Inteligente "+robo.collour + " não comeu a comida. E moveu-se " + roboInteligente.contMov + " vezes");
                mapa(roboInteligente.getPosX(), roboInteligente.getPosY(), comX, comY);
            }
        }
    }
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite 1 para controlar o robô\n" +
                    "Digite 2 para usar dois robôs que se movimentam automaticamente\n" +
                    "Digite 3 para usar dois robôs controlados pela maquina, sendo um deles um robô inteligente");
            int S = s.nextInt();
            switch (S) {
                case 1:
                    Exemplo1 e1 = new Exemplo1();
                    break;
                case 2:
                    Exemplo2 e2 = new Exemplo2();
                    break;
                case 3:
                    Exemplo3 e3 = new Exemplo3();

            }
        }

}

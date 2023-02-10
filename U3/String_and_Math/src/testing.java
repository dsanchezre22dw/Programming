public class testing {

    public static void main(String[] args){
        //String Container
        StringContainer x = new StringContainer("YzMaba");
        StringContainer a = new StringContainer("David");
        System.out.println(x.toString());
        System.out.println(x.equals(a));
        x.shiftLeft(0);
        x.show();
        x.shiftRight(0);
        x.show();
        x.rotate(0,'L');
        x.show();
        x.rotate(0,'R');
        x.show();
        x.rotate(0,'D');
        x.show();
        System.out.println(x.toString());
        System.out.println(x.encoding(3));
        System.out.println(x.encoding2());
        StringContainer y = new StringContainer("aa bb ccc");
        StringContainer z = new StringContainer("xx yyy dd");
        StringContainer.mixWords(y, z).show();


        //Dice
        Dice dado = new Dice();
        dado.show();
        dado.play();
        dado.show();
        dado.play();
        dado.show();

        //Player
        Player pl1 = new Player("David", dado);
        pl1.tryy();
        System.out.println(pl1.getDiceValue());
        pl1.show();
        pl1.showTotalPlayers();

        //Game
        Game g = new Game();
        g.main();

    }
}
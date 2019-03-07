public class PlayingCat {
    public static void main(String[] args) {
        isCatPlaying(true, 15);

    }
    public static boolean isCatPlaying(boolean summer, int temperature){

        if((summer==true) && (temperature>=25) && (temperature<=45)) {
            return true;
        }
        else if(summer!=true && temperature>=25 && temperature<=35 ) {
            return true;
        }else{
            return false;
        }

    }
}

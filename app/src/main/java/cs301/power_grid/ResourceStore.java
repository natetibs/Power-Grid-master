package cs301.power_grid;

/**
 * @author Luchini Guilian, Tibbetts Nathan, Douville Luke, Hoang Paul
 */

public class ResourceStore {

    public boolean[] coal = new boolean[15];
    public boolean[] oil = new boolean[10];
    public boolean[] trash = new boolean[15];
    public boolean[] uranium = new boolean[5];

    public ResourceStore(){
        for(int i = 0; i < 15; i++){
            coal[i] = true;
            trash[i] = true;
            if(i < 5){
                uranium[i] = true;
            }
            if(i < 10){
                oil[i] = true;
            }
        }
    }

}

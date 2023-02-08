import java.util.Arrays;

public class Machine{
    private Item[][] items;

    public Machine(int[][] items){
        this.items = new Item[items.length][items[0].length];
        for (int i = 0; i < items.length; i++) {
            for (int j = 0; j < items[i].length; j++) {
                this.items[i][j]=new Item(items[i][j]);
            }
        }
    }
    public Item getItem(int row,int spot){
       
        return new Item(this.items[row][spot]);
    }

    public void setItem(int row,int spot){
        this.items[row][spot]= new.Item(item)
    }







}
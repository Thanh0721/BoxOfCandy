public class Main {
    public static void main(String[] args) 
    {
        Candy[][] candies = 
        {
            {null, new Candy("cherry"), null},
            {new Candy("lime"), null, new Candy("grape")},
            {new Candy("cherry"), new Candy("lime"), null}
        };

        BoxOfCandy box = new BoxOfCandy(candies);

        System.out.println("Initial Box:");
        System.out.println(box);

        System.out.println("Move Candy to First Row, Column 0: " + box.moveCandyToFirstRow(0));
        System.out.println(box);

        System.out.println("Remove Candy with flavor 'lime': " + box.removeNextByFlavor("lime"));
        System.out.println(box);

        System.out.println("Remove Candy with flavor 'grape': " + box.removeNextByFlavor("grape"));
        System.out.println(box);
    }
}
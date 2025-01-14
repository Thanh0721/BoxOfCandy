public class BoxOfCandy {
    private Candy[][] box;

    public BoxOfCandy(Candy[][] box) {
        this.box = box;
    }

    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] != null) {
            return true;
        }

        for (int i = 1; i < box.length; i++) {
            if (box[i][col] != null) {
                box[0][col] = box[i][col];
                box[i][col] = null;
                return true;
            }
        }

        return false;
    }

    public Candy removeNextByFlavor(String flavor) {
        for (int i = box.length - 1; i >= 0; i--) {
            for (int j = 0; j < box[i].length; j++) {
                if (box[i][j] != null && box[i][j].getFlavor().equals(flavor)) {
                    Candy foundCandy = box[i][j];
                    box[i][j] = null;
                    return foundCandy;
                }
            }
        }

        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Candy[] row : box) {
            for (Candy candy : row) {
                sb.append(candy != null ? candy : "null").append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
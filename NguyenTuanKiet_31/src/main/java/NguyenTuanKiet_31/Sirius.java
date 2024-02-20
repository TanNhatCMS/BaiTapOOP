package NguyenTuanKiet_31;

public class Sirius extends MyMotor {
    private String color;
    public Sirius() {
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        if (color.equalsIgnoreCase("xanh") || color.equalsIgnoreCase("vàng") || color.equalsIgnoreCase("trắng")) {
            this.color = color;
        } else {
            System.out.println("Màu xe chỉ có thể là xanh, vàng hoặc trắng.");
        }
    }
    @Override
    public void InputInfo() {
        super.InputInfo();
        boolean flag;
        do {
            flag = false;
            System.out.print("Nhập màu xe(1=Xanh 2=Vàng 3=Trắng): ");
            try{
                int color = scanner.nextInt();
                if(color == 1) {
                    this.color = "xanh";
                    flag = true;
                }
                else if(color == 2) {
                    this.color = "vàng";
                    flag = true;
                }
                else if(color == 3) {
                    this.color = "trắng";
                    flag = true;
                }
                else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("Màu xe chỉ có thể là 1=xanh, 2=vàng hoặc 3=trắng.");
                scanner.nextLine();
            }
        } while (!flag);
    }
    @Override
    public void DisplayInfo() {
        super.DisplayInfo();
        System.out.println("-" + getColor());
    }
//    public static void main(String[] args) {
//        Sirius sirius = new Sirius();
//        sirius.InputInfo();
//        sirius.DisplayInfo();
//    }
}

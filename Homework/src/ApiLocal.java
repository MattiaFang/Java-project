import java.time.LocalDate;

public class ApiLocal {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        System.out.println("当前日期为："+date);
    }
}

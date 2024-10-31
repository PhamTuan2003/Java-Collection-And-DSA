package Collection.List;

import java.util.Arrays;
import java.util.List;

public class asList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list);
    }
//    Lưu ý: Danh sách được tạo bằng cách này có
//    kích thước cố định, nghĩa là bạn không thể thêm hoặc
//    xóa phần tử khỏi danh sách này sau khi đã khởi tạo.
}

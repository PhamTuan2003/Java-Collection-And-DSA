package Collection.List;

import java.util.List;

public class listOf {
    public static void main(String[] args) {
        List<String> list = List.of("a", "b", "c");
        System.out.println(list);
    }
//    Lưu ý: Danh sách được tạo ra bởi List.of()
//    là danh sách không thay đổi (immutable),
//    tức là bạn không thể thêm, sửa, hoặc xóa phần tử khỏi danh sách này.
}

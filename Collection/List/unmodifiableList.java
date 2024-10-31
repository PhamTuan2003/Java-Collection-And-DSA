package Collection.List;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class unmodifiableList {
    public static void main(String[] args) {
        List<String> list = Collections.unmodifiableList(Arrays.asList("a", "b", "c"));
        System.out.println(list);
    }

//    Danh sách này không thể thay đổi sau khi đã khởi tạo, tức là bạn không thể thêm hoặc xóa phần tử sau khi tạo.
}

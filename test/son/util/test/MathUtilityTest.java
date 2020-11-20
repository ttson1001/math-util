/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import son.uitl.MathUtility;

/**
 *
 * @author Tran Thanh Son
 */
public class MathUtilityTest {

//    public MathUtilityTest() {
    @Test // biến cái hàm ở trong class này thành psvm()
    /// nhờ bộ thư viên JUnit.
    // tại sao cần vậy, vì mặc định app từ main() chuẩn
    // tring khi đó mình cần test chạy thử hàm thoy, kkg can thiệp main()
    // vậy mình cần main() khác, @Test giúp điều đó
    // nhưng vid có nhiều main(), CPU bị bối rối khi nhất F6
    // F6 dành cho main() default
    // s + F6 dành cho bên này
    public void getFactorical_RunsWell_IfValidArgument() {
            assertEquals(1, MathUtility.getFactorial(0));
            assertEquals(120, MathUtility.getFactorial(5));
            assertEquals(720, MathUtility.getFactorial(6));
            assertEquals(24, MathUtility.getFactorial(4));
            assertEquals(6, MathUtility.getFactorial(3));
    }
        
//    bắt ngoại lệ như thế nào??
//    noai lệ Exception ko phải là 1 value để mà so sánh
//    do đó dùng hàm asserX() là ko dc, vid ko là value để so
//    ta phải dung kĩ thuật kahcs
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgumet() {
        MathUtility.getFactorial(-5);
    }

}

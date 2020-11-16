/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package son.uitl;

/**
 *
 * @author Tran Thanh Son
 */
public class MathUtility {

    // mình sẽ làm class nay fake y chang classs Mat của JDK
    // Nath.PI .abs() .pow . Sin()
    // cái gì mà đồ sài chung khg lưu trữ riêng ta sẽ chơi staticc
    public static final double PI = 3.1415;
    // xai: MathUtility.PI y chang Math.PI

    // hàm tính n! = 1.2.3.4...n
    // n phải >=0, 0! = 1! = 1; quy ước 
    // n! tăng nhanh , cho dến 21! tràn long rồi
    // ta chỉ tính n! từ 0 - 20
    // ngoài vùng này chửa éo tính chửi = Exception
    // khg thềm trả về - 1 ý giá trị kho sài
    // học cách ném ngoại lệ luôn
    // thứ 2 ông viết tiếp , cấm vắng mặt
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException(" n must be between 0..20");
        }
        if (n == 0 || n == 1) {
            return 1; // 1 lệnh trong ì kho xài ngoặc
        }        // chỗ này thằng nào sài else thăng đó bị trừ điểm
        // ngay chỗ này chính là m = 2..20;
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;

    }



}

// ta tự tin gáy hàm ta chạy ngon chạy đúng
// nhưng: team thì cần chứng minh điều đó, đẩm bảo chất lượng code, chạy test thử
// test nghĩa là đưa hàm ra xài gọi với ccasi tham số khác nhau
// ví dụ  gọi hàm getF (cvoiws các số khác nhau đưa vào đó)
// getF(-5) , getF(-1) , getF(0), ...
// các giá trị đầu vào đại điện cho việc sài hàm,
// ta còn gọi là test cases, các tính hướng cần test, các tính hướng xài hàm,
// khi ta tét hàm, ta cần quan tâm 2 việc
// 1. dự kiến hàm trả về giá trị gì khi hàm chạy với 1 dầu vào nào đó
// dự kiến hàm trả về giá trị, tui gọi là EXPECTED VALUE
// ví dụ hàm sẽ trả về 120 khi gọi getF(5)
// 2. hầm khi cahyj với 1 đầu vào nào đó, thì nó sẽ ói/ return về 1 value
// cái value tả về của hàm khi chyaj đc gọi là ACTUAL value
// nghề test chính là: SO SÁNH COI EV CÓ BÀNG VỚI AV HEM?
// NẾU CÓ BẰNG, HÀM ĐÚNG CHO CASE/ TÌNH HUỐNG NÀY
//NẾU KO BẰNG , HÀM TÍNH TOÀN SAI, HOẶC KÌ VỌNG SAI
//
//HÀM MÀ TỐT THÌ PHẢI LÀ E == A MỌI TINH HUỐNG
//NẾU TOIOT TA MỚI ĐEM RA XÀI, BÁN , PUBLIC CÔNG ĐỒNG XÀI
//
//LÀM SAO ĐỂ TEST COI CÓ TỐT KHÔNG, EXPECTED == AVTUAL
//CÓ HAI KĨ THUẬT ĐC ÁP DỤNG
//KĨ THUẬT 1: Nhìn bằng mắt và so sánh từng cập expected == avtual
//    chính là sout(ex), sout (a - hàm ói về gì khi chạy)
//kĩ thuật này đơn giản dễ làm nhưng thường mắc sai xót do dcos quá nhiều cặp e a cần so sánh bằng mắt
//
//KĨ THUẬT 2: Nhin bằng mắt, không cần xo sánh từng cặp, để máy so sánh dùm luôn
//    mắt chỉ nhifn2 màu Xanh đỏ duy nhất
//nếu hầu hết các cặp a vs e đều thảo , mầu xanh cho tất cả
//nếu hầu hết các cập a vs e dều thỏa , có 1 vaid cái ko thỏa thì kết luận ngay, hàm sai màu đỏ cho tất cả
//điều này giải thích là : đúng là phải đúng cho tất cả mọi tính huống hàm chạy
//chỉ cần 1 thằng sai hàm sai
//
//tương đương với câu hàm tui chạy ngon lắm đúng 999.99% lâu lâu SAI !!
//
//n0osi câu đó là đéo tin cậy để sài
//KĨ THUẬT 2 này dùng màu sắc mún làm vạy thì phải sài thưu viện bổ sung thêm
//CHÍNH LÀ FILE.JAR,.DLL DC CUNG CẤP THÊM NGOÀI JDK
//Các thư viện này tùy thuộc  ngôn ngữ lập trình , đc gọi chúng là
//unit test framework,
//C#: thư viên cụ thể NUnit, MSUnit, xUnit
//Java: thu vien cụ thẻ JUNit, TestNG, xUnit
//PHP: PHPUnit
//C++: CPPUnit

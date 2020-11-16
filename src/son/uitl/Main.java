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
public class Main {

    public static void main(String[] args) {
        long expected = 120; // tao hi vọng 120 ói về nếu
        long actual = MathUtility.getFactorial(5); // tao gọi hàm 5!
        System.out.println("5!? expected: " + expected + " actual: " + actual);

        expected = 720;
        actual = MathUtility.getFactorial(6);
        System.out.println("6!? expected: " + expected + " actual: " + actual);

        System.out.println("0!? expected: 1; actual: " + MathUtility.getFactorial(0));
        
        //case 4:
        // tao kì vọng gọi về ngoại lệ IllegalArgumentException
        // nếu -5
        MathUtility.getFactorial(-5);
        
        // thấy exception lại mừng vì hàm chạy như thiết kết
    }
}

//cất code lên server GitHub
//cần:
//nhớ kho minh khg GitHub, url: https://github.com/tenminh/tenkho.git
// nho u p e vào github
// cần tool để đồng bộ code từ máy minh (local) sever (GitHub, GitLad, Bith)
// tool có thể là cmd, Gui (git Desktop, Source Tree, 

//file đặt biệt để nói với git tooll rằng ai lên server ai ở lại local
//file này được gọi alf .gitignore
//nó sẽ khác nhau tùy diwj án tùy vào IDE mình xài , ngôn ngứ lập trình mình xài
//có 1 gã dev cực dễ thương, làm sẵn nhưng file unsgws với idem nnlt rồi
//xin anh ấy dem về xài
//http://gitingore.io
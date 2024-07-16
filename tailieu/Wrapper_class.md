# Wrapper classes 
Trong quá trình phát triển dự án, chúng ta thường gặp các trường hợp cần có các đối tượng thay vì các kiểu dữ liệu nguyên thủy. Để làm được điều này, Java cung cấp một khái niệm về những lớp Wrapper. Lớp Wrapper trong Java là loại lớp cung cấp một cơ chế để chuyển đổi loại dữ liệu nguyên thủy thành đối tượng và ngược lại. 

Khi một lớp Wrapper được tạo ra, một tệp mới sẽ được tạo ra và ở đó, chúng ta sẽ lưu trữ các kiểu dữ liệu nguyên thủy. Đối tượng của lớp Wrapper bọc hoặc giữ kiểu dữ liệu nguyên thủy tương ứng của nó.

Quá trình chuyển đổi các kiểu dữ liệu nguyên thủy thành một đối tượng gọi là boxing. Trong khi sử dụng một lớp wrapper, bạn chỉ cần truyền giá trị của kiểu dữ liệu nguyên thủy cho phương thức khởi tạo của lớp Wrapper.

Tất cả các lớp Wrapper Byte, Short, Integer, Long, Double và Float, là các lớ con của lớp trừu tượng Number. Trong khi các lớp của Character và Boolean wrapper là các lớp con của lớp Object. 
## Primitive Types and Corresponding Wrapper Classes

|Kiểu dữ liệu ban đầu|Wrapper|Đối số|
|--------------|---------------|---------------|
|boolean|Boolean|boolean hoặc String|
|byte|byte|byte hoặc String|
|short	|Short|short hoặc String|
|int|Integer|int hoặc String|
|char|Character|char|
|float|float|float, double, String|
|double|Double|double hoặc String|
|long|Long|long hoặc String|

## Autoboxing và Unboxing trong Java
### 1. Autoboxing

Quá trình tự động chuyển đổi các kiểu dữ liệu nguyên thủy thành các đối tượng lớp Wrapper tương ứng được gọi là Autoboxing trong Java. Đây là Autoboxing vì điều này được thực hiện tự động bởi trình biên dịch Java. 

### 2. Unboxing

Java Unboxing là quá trình ngược lại của Autoboxing. Quá trình chuyển đổi đối tượng lớp wrapper thành kiểu dữ liệu nguyên thủy tương ứng của nó được gọi là Java Unboxing.



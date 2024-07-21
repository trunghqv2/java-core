# String

Một đối tượng String là chuỗi ký tự dùng để lưu dữ các ký tự theo một dãy có thứ tự, số ký tự lưu được không hạn chế, có thể biểu diễn chuỗi trên một dòng với các ký tự trong dấu nháy kép "".

Lớp này thực hiện các giao diện Serializablevà CharSequence. Vì nó được bao gồm trong gói java.langnên không cần phải nhập.
Lớp String trong Java là lớp cuối cùng và không thể có con.
Lớp String là một lớp bất biến, nghĩa là các đối tượng của nó không thể thay đổi sau khi chúng được tạo. Bất kỳ thao tác nào trên đối tượng String dẫn đến một đối tượng của lớp String sẽ dẫn đến việc tạo ra một đối tượng mới.
Do tính bất biến của chúng, các đối tượng của lớp String là luồng an toàn và có thể được sử dụng trong môi trường đa luồng.
Mọi đối tượng trong Java đều có thể được chuyển đổi thành một chuỗi thông qua một phương thức toStringmà tất cả các lớp Java kế thừa từ lớp đó
- sử dụng equals() khi so sánh
- String: là immutable, hay sử dụng
- StringBuffer: mutable, Synchronized ==> hiệu suất kém hơn
- StringBuilder: mutable, không Synchronized (Synchronized là cho nhiều thread truy cập vào 1 lúc)
- VD 1 vai method hay dung :equals(), toUpperCase(), toLowerCase(), trim(), contains(), split(), subString(), replace(), charAt()


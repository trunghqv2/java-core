# Collection in Java

là một root interface trong hệ thống cấp bậc Collection. Java Collection cung cấp nhiều interface (Set, List, Queue, Deque vv) và các lớp (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet vv).

## Basic Interfaces
Collection interface cũng chứa một số các methods quan trọng để thao tác với dữ liệu tập hợp như add, delete, clear, size hay contains. List, Queue, Set là những sub-interfaces chính của Collection..

### List Interface:

Đây là interface con cua Collection Interface, dành cho dữ liệu kiểu list. List trong Java đại diện cho một danh sách các phần tử có thứ tự và cho phép chứa các phần tử trùng lặp

### Set Interface: 

Set Interface đại diện cho một tập hợp các phần tử duy nhất (không trùng lặp). Tuy nhiên, nó, không đảm bảo thứ tự phần tử (trừ LinkedHashSet) có nghĩa là các phần tử được thêm vào Set có thể được sắp xếp theo bất kỳ thứ tự nào.Các lớp triển khai phổ biến của Set là HashSet, LinkedHashSet và TreeSet.

### Map Interface: 

Map InterfaceKhông kế thừa từ Collection Interface, nhưng là một thành phần quan trọng trong Collections Framework. Nó lưu trữ dữ liệu dưới dạng các cặp key-value, trong đó mỗi key là duy nhất và truy xuất dữ liệu dựa trên key đó. Các lớp triển khai phổ biến của Map là HashMap, LinkedHashMap và TreeMap.

### Queue Interface: 

Queue interface duy trì thứ tự FIFO (First In First Out) tương tự như hàng đợi thực tế. Interface này dành cho việc lưu trữ tất cả các phần tử mà thứ tự của các phần tử đó quan trọng, nghĩa là các phần tử được thêm vào đầu tiên sẽ được xử lý đầu tiên. Các lớp triển khai phổ biến của Queue là LinkedList, PriorityQueue và ArrayBlockingQueue.


## Các lớp triển khai phổ biến
1. ArrayList: Thích hợp cho việc truy cập ngẫu nhiên và thêm phần tử vào cuối danh sách.
2. LinkedList: Thích hợp cho việc thêm và xóa phần tử ở đầu và cuối danh sách hơn so với ArrayList
3. HashSet:
Lưu trữ các phần tử duy nhất (không trùng lặp).
Không đảm bảo thứ tự phần tử.
Thích hợp cho việc kiểm tra tính duy nhất của phần tử và thao tác tập hợp.
4. HashMap: Thích hợp cho việc tra cứu và thao tác dữ liệu dựa trên khóa
5. TreeSet: Thích hợp cho việc kiểm tra tính duy nhất của phần tử và thao tác tập hợp có thứ tự.
6. TreeMap: Thích hợp cho việc tra cứu và thao tác dữ liệu dựa trên khóa.
                     
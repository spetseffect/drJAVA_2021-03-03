<h1>Обобщающий класс Methods&lt;T extends Number&gt;</h1>
<p>Класс содержит 5 основных и 4 дополнительных метода.<br>
Основные:</p>
<ul>
<li><b><i>public static &lt;T&gt; T Max(T ... args) throws Exception</i></b><br>
Поиск максимального значения в массиве. 
Если массив пустой, выбрасывает простое исключение с текстом "Array is empty. Search of Max is impossible."</li>
<li><b><i>public static &lt;T&gt; T Min(T... args) throws Exception</i></b><br>
Поиск минимального значения в массиве. 
Если массив пустой, выбрасывает простое исключение с текстом "Array is empty. Search of Min is impossible."</li>
<li><b><i>public static &lt;T&gt; double Avg(T ... args) throws Exception</i></b><br>
Получение среднего арифметического значения среди элементов массива. 
Если массив пустой, выбрасывает простое исключение с текстом "Array is empty. Getting of Avg is impossible."</li>
<li><b><i>public static &lt;T&gt; void InsertSort(T[] array, boolean increase) throws Exception</i></b><br>
Сортирует массив array по возрастанию если <i>increase=true</i> и по убыванию если <i>increase=false</i>. 
Если массив пустой, выбрасывает простое исключение с текстом "Array is empty. Sorting is impossible."</li>
<li><b><i>public static &lt;T&gt; int BinSearch(T[] array, T value) throws Exception</i></b><br>
Сортирует массив array по возрастанию и выполняет бинарный поиск индекса элемента со значением value.
Если элемент не найден, то возвращает -1. 
Если массив пустой, выбрасывает простое исключение с текстом 
"Array is empty. Execution of binary search is impossible."</li>
</ul>
<p>Дополнительные:</p>
<ul>
<li><b><i>public static &lt;T&gt; void InsertSort(T[] array)</i></b><br>
Перегрузка метода InsertSort, уже с одним параметром. При этом <i>increase=true</i>.</li>
<li><b><i>public static &lt;T&gt; void OutputToConsole(T[] array, String margin)</i></b><br>
Выводит элементы массива через разделитель <i>margin</i>. После последнего элемента разделитель не ставится.</li>
<li><b><i>private static &lt;T&gt; double Convert(T value)</i></b><br>
Конвертирует значение типа <i>Т</i> в <i>double</i>. Поддерживаемые типы: Byte, Short, Integer, Long, Float, Double. 
В противном случае выбрасывается простое исключение с текстом "Unsupported data type."</li>
<li><b><i>private static &lt;T&gt; T UnConvert(double value, String className)</i></b><br>
Конвертирует значение типа <i>double</i> в <i>Т</i>. Поддерживаемые типы: Byte, Short, Integer, Long, Float, Double. 
В противном случае выбрасывается простое исключение с текстом "Unsupported data type."</li>
</ul>
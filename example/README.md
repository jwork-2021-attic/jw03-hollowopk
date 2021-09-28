1.首先，在SteganographyFactory中，传入java文件并编译得到class文件。然后，调用SteganographyEncoder中的编码函数，将class文件的字节码以及名称、长度等信息读取到byte数组中，再将字节信息保存到源图片的rgb值当中，并重新写回图片，以此来将类信息保存到图片中。在Scene中，将隐写术图的url传入classloader。在classloader中，调用SteganographyEncoder中的解码方法，按照编码的方式逆向将图片中保存的字节取出，并以此来加载类。



2.

编码了快速排序的图片：

![](https://github.com/jwork-2021/jw03-hollowopk/blob/main/example.QuickSorter.png?raw=true)

编码了选择排序的图片：

![](https://github.com/jwork-2021/jw03-hollowopk/blob/main/example.SelectSorter.png?raw=true)



3.

快速排序：

[![asciicast](https://asciinema.org/a/2Wzi3YvX5R2K3TkS8McdKIqUY.svg)](https://asciinema.org/a/2Wzi3YvX5R2K3TkS8McdKIqUY)



选择排序：

[![asciicast](https://asciinema.org/a/UoOWdLsl9HIIxJg3wgl2qEE8O.svg)](https://asciinema.org/a/UoOWdLsl9HIIxJg3wgl2qEE8O)



4.

使用191220042蒋梓栩的图片

![](https://github.com/jwork-2021/jw03-hollowopk/blob/main/example.JZXQuickSorter.png?raw=true)

得到快速排序，录屏如下：

[![asciicast](https://asciinema.org/a/5QKvDNo0y4vQ9sdSN3nK8pQt3.svg)](https://asciinema.org/a/5QKvDNo0y4vQ9sdSN3nK8pQt3)

结果正确。

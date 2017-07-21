import java.io.File

println("HelloWorld")

File(".").list().forEach(::println) //遍历当前目录下的文件名
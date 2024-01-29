package day240106;

/**
 * 文档注释
 * <p>
 * <a href="https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html">javadoc-tool</a>
 * <p>
 * cd src/day03
 * javadoc -d doc JavaDoc.java
 * javadoc -d doc -author JavaDoc.java
 * <p>
 * Tools -> Generate JavaDoc
 *
 * @author 作者1
 * @author 作者2
 * @author <a href="https://gitee.com/iae666" target="_black">iae666</a>
 * @since 1.0
 * @see java.io.PrintStream
 *
 * API: Application Programming Interface
 * Java® Platform, Standard Edition &amp; Java Development Kit Version 21 API Specification
 * <a href="https://docs.oracle.com/en/java/javase/21/docs/api/index.html">JDK 21 API</a>
 *
 * Next: Naming
 */
public class JavaDoc {
    /**
     * 注释格式三：文档注释
     * <p>
     * main 方法
     * @param args 参数名
     */

    /*
    注释格式二：
    多行注释
     */
    public static void main(String[] args) {
        // 注释格式一：单行注释
        // 在控制台输出 Hello World! 字符串
        System.out.println("Hello World!");
    }
}
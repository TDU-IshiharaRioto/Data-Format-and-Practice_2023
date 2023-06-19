import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * CSVファイルの読み書きを支援するツールクラスです。
 */
public class CsvUtils {

    /**
     * このクラス固有の文字コードを指定しています。
     * Shift-JISのWindows拡張であるWindows-31Jが指定されています。
     */
    public static final Charset CHARSET = Charset.forName("Windows-31J");
    
    /**
     * CSVファイルの全行を読み込みます。
     * @param path CSVファイルのパス
     * @return 
     */
    public static List<String> readAllLines (Path path) {
        String all = readAll (path);
        return Arrays.asList(all.split(PathUtils.CRLF));
    }

    /**
     * CSVファイルの全内容を読み込みます。
     * このクラス固有の文字コード（Windows-31J）に従って、{@link PathUtils#readAll(java.nio.file.Path, java.nio.charset.Charset) }を呼び出し、ファイルの全行を読み込みます。
     * 読み込んだ結果は、String型として返却します。
     * このため、ファイルは{@link CsvUtils#CHARSET}でエンコーディングされた、テキストデータである必要があります。
     * @param path CSVファイルのパス
     * @return 読み込んだファイルの内容
     */
    public static String readAll (Path path) {
        return PathUtils.readAll(path, CHARSET);
    }
}

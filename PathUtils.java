import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * ファイルの読み書きを支援するツールクラスです。
 * @author 小濱隆司
 */
public class PathUtils {

    /**
     * テスト用のメインメソッドです。
     * @deprecated
     * @param args コマンドライン引数（未使用）
     */
    public static void main(String[] args) {
        String pathName = "data2.csv";
        Charset charset = Charset.forName("Windows-31J");
        List<String> lines = readAllLines(Paths.get(pathName), charset);
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            System.out.println ((i + 1) + ":" + line);
        }
    }

    /**
     * 改行コードを指定する定数です。「\r\n」であるCRLFが指定されています。
     */
    public static final String CRLF = "\r\n";

    /**
     * 指定された文字コードに従って、ファイルの全行を読み込みます。
     * 読み込む際、改行コードによって複数の要素に分割されたListになります。
     * ファイルはテキストデータである必要があります。
     * @param path ファイルのパス
     * @param charset 読み込む際に利用する文字コード
     * @return ファイルの内容（改行で分割された行のリスト）
     */
    public static List<String> readAllLines (Path path, Charset charset) {
        String all = readAll(path, charset);
        return Arrays.asList(all.split(CRLF));
    }

    /**
     * 指定された文字コードに従って、ファイルの全内容を読み込みます。
     * ファイルはテキストデータである必要があります。
     * @param path ファイルのパス
     * @param charset 読み込む際に利用する文字コード
     * @return ファイルの内容
     */
    public static String readAll (Path path, Charset charset) {
        try {
            return new String(Files.readAllBytes(path), charset);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 指定された文字コードに従って、ファイルに文字列を書き込みます。
     * @param path 作成または上書きするファイルのパス
     * @param all ファイルに書き込む文字列
     * @param charset 書き込む際に利用する文字コード
     * @return 作成または上書きしたファイルのパス
     */
    public static Path writeString (Path path, String all, Charset charset) {
        try {
            return Files.write(path, all.getBytes(charset));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }
}

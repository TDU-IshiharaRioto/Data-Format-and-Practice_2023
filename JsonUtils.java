import java.nio.charset.Charset;
import java.nio.file.Path;

/**
 * JSONファイルの読み書きを支援するツールクラスです。
 */
public class JsonUtils {

    /**
     * このクラス固有の文字コードを指定しています。
     * UTF-8が指定されています。
     */
    public static final Charset CHARSET = Charset.forName("UTF-8");
    
    /**
     * JSONファイルの全行を読み込みます。
     * @param path Jsonファイルのパス
     * @return 読みこんだJsonファイルの内容（String）
     */
    public static String readAll (Path path) {
        return PathUtils.readAll(path, CHARSET);
    }

    /**
     * JSONファイルを作成し、書き込みます。
     * 同一のファイルが存在する場合は、上書きします。
     * @param path 書き込み先ファイルパス
     * @param all 書き込む内容
     * @return 書き込んだファイルのパス
     */
    public static Path writeString (Path path, String all) {
        return PathUtils.writeString(path, all, CHARSET);
    }
}

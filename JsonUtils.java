import java.nio.charset.Charset;
import java.nio.file.Path;

/**
 * JSON�t�@�C���̓ǂݏ������x������c�[���N���X�ł��B
 */
public class JsonUtils {

    /**
     * ���̃N���X�ŗL�̕����R�[�h���w�肵�Ă��܂��B
     * UTF-8���w�肳��Ă��܂��B
     */
    public static final Charset CHARSET = Charset.forName("UTF-8");
    
    /**
     * JSON�t�@�C���̑S�s��ǂݍ��݂܂��B
     * @param path Json�t�@�C���̃p�X
     * @return �ǂ݂���Json�t�@�C���̓��e�iString�j
     */
    public static String readAll (Path path) {
        return PathUtils.readAll(path, CHARSET);
    }

    /**
     * JSON�t�@�C�����쐬���A�������݂܂��B
     * ����̃t�@�C�������݂���ꍇ�́A�㏑�����܂��B
     * @param path �������ݐ�t�@�C���p�X
     * @param all �������ޓ��e
     * @return �������񂾃t�@�C���̃p�X
     */
    public static Path writeString (Path path, String all) {
        return PathUtils.writeString(path, all, CHARSET);
    }
}

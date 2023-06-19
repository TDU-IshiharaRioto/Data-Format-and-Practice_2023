import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * CSV�t�@�C���̓ǂݏ������x������c�[���N���X�ł��B
 */
public class CsvUtils {

    /**
     * ���̃N���X�ŗL�̕����R�[�h���w�肵�Ă��܂��B
     * Shift-JIS��Windows�g���ł���Windows-31J���w�肳��Ă��܂��B
     */
    public static final Charset CHARSET = Charset.forName("Windows-31J");
    
    /**
     * CSV�t�@�C���̑S�s��ǂݍ��݂܂��B
     * @param path CSV�t�@�C���̃p�X
     * @return 
     */
    public static List<String> readAllLines (Path path) {
        String all = readAll (path);
        return Arrays.asList(all.split(PathUtils.CRLF));
    }

    /**
     * CSV�t�@�C���̑S���e��ǂݍ��݂܂��B
     * ���̃N���X�ŗL�̕����R�[�h�iWindows-31J�j�ɏ]���āA{@link PathUtils#readAll(java.nio.file.Path, java.nio.charset.Charset) }���Ăяo���A�t�@�C���̑S�s��ǂݍ��݂܂��B
     * �ǂݍ��񂾌��ʂ́AString�^�Ƃ��ĕԋp���܂��B
     * ���̂��߁A�t�@�C����{@link CsvUtils#CHARSET}�ŃG���R�[�f�B���O���ꂽ�A�e�L�X�g�f�[�^�ł���K�v������܂��B
     * @param path CSV�t�@�C���̃p�X
     * @return �ǂݍ��񂾃t�@�C���̓��e
     */
    public static String readAll (Path path) {
        return PathUtils.readAll(path, CHARSET);
    }
}

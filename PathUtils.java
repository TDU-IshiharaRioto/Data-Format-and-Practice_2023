import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;

/**
 * �t�@�C���̓ǂݏ������x������c�[���N���X�ł��B
 * @author ���_���i
 */
public class PathUtils {

    /**
     * �e�X�g�p�̃��C�����\�b�h�ł��B
     * @deprecated
     * @param args �R�}���h���C�������i���g�p�j
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
     * ���s�R�[�h���w�肷��萔�ł��B�u\r\n�v�ł���CRLF���w�肳��Ă��܂��B
     */
    public static final String CRLF = "\r\n";

    /**
     * �w�肳�ꂽ�����R�[�h�ɏ]���āA�t�@�C���̑S�s��ǂݍ��݂܂��B
     * �ǂݍ��ލہA���s�R�[�h�ɂ���ĕ����̗v�f�ɕ������ꂽList�ɂȂ�܂��B
     * �t�@�C���̓e�L�X�g�f�[�^�ł���K�v������܂��B
     * @param path �t�@�C���̃p�X
     * @param charset �ǂݍ��ލۂɗ��p���镶���R�[�h
     * @return �t�@�C���̓��e�i���s�ŕ������ꂽ�s�̃��X�g�j
     */
    public static List<String> readAllLines (Path path, Charset charset) {
        String all = readAll(path, charset);
        return Arrays.asList(all.split(CRLF));
    }

    /**
     * �w�肳�ꂽ�����R�[�h�ɏ]���āA�t�@�C���̑S���e��ǂݍ��݂܂��B
     * �t�@�C���̓e�L�X�g�f�[�^�ł���K�v������܂��B
     * @param path �t�@�C���̃p�X
     * @param charset �ǂݍ��ލۂɗ��p���镶���R�[�h
     * @return �t�@�C���̓��e
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
     * �w�肳�ꂽ�����R�[�h�ɏ]���āA�t�@�C���ɕ�������������݂܂��B
     * @param path �쐬�܂��͏㏑������t�@�C���̃p�X
     * @param all �t�@�C���ɏ������ޕ�����
     * @param charset �������ލۂɗ��p���镶���R�[�h
     * @return �쐬�܂��͏㏑�������t�@�C���̃p�X
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

package androidx.multidex;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;
import p000a.C0000a;

/* loaded from: classes.dex */
final class ZipUtil {

    public static class CentralDirectory {

        /* renamed from: a */
        public long f4894a;

        /* renamed from: b */
        public long f4895b;
    }

    /* renamed from: a */
    public static CentralDirectory m3335a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder m24u = C0000a.m24u("File too short to be a zip file: ");
            m24u.append(randomAccessFile.length());
            throw new ZipException(m24u.toString());
        }
        long j2 = length - 65536;
        long j3 = j2 >= 0 ? j2 : 0L;
        int reverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == reverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                CentralDirectory centralDirectory = new CentralDirectory();
                centralDirectory.f4895b = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                centralDirectory.f4894a = Integer.reverseBytes(randomAccessFile.readInt()) & 4294967295L;
                return centralDirectory;
            }
            length--;
        } while (length >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }
}

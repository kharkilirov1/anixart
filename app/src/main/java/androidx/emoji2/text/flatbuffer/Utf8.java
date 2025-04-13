package androidx.emoji2.text.flatbuffer;

/* loaded from: classes.dex */
public abstract class Utf8 {

    /* renamed from: a */
    public static Utf8 f4107a;

    public static class DecodeUtil {
        /* renamed from: a */
        public static void m2867a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i2) throws IllegalArgumentException {
            if (!m2870d(b2)) {
                if ((((b2 + 112) + (b << 28)) >> 30) == 0 && !m2870d(b3) && !m2870d(b4)) {
                    int i3 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                    cArr[i2] = (char) ((i3 >>> 10) + 55232);
                    cArr[i2 + 1] = (char) ((i3 & 1023) + 56320);
                    return;
                }
            }
            throw new IllegalArgumentException("Invalid UTF-8");
        }

        /* renamed from: b */
        public static void m2868b(byte b, byte b2, byte b3, char[] cArr, int i2) throws IllegalArgumentException {
            if (m2870d(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m2870d(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i2] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
        }

        /* renamed from: c */
        public static void m2869c(byte b, byte b2, char[] cArr, int i2) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            }
            if (m2870d(b2)) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
            cArr[i2] = (char) (((b & 31) << 6) | (b2 & 63));
        }

        /* renamed from: d */
        public static boolean m2870d(byte b) {
            return b > -65;
        }

        /* renamed from: e */
        public static boolean m2871e(byte b) {
            return b >= 0;
        }
    }

    public static class UnpairedSurrogateException extends IllegalArgumentException {
    }

    /* renamed from: a */
    public static Utf8 m2866a() {
        if (f4107a == null) {
            f4107a = new Utf8Safe();
        }
        return f4107a;
    }
}

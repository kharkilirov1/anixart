package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParser {

    /* renamed from: androidx.constraintlayout.core.parser.CLParser$1 */
    public static /* synthetic */ class C01811 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2087a;

        static {
            int[] iArr = new int[TYPE.values().length];
            f2087a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2087a[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2087a[4] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2087a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2087a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2087a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum TYPE {
        /* JADX INFO: Fake field, exist only in values array */
        UNKNOWN,
        /* JADX INFO: Fake field, exist only in values array */
        OBJECT,
        /* JADX INFO: Fake field, exist only in values array */
        ARRAY,
        /* JADX INFO: Fake field, exist only in values array */
        NUMBER,
        /* JADX INFO: Fake field, exist only in values array */
        STRING,
        /* JADX INFO: Fake field, exist only in values array */
        KEY,
        /* JADX INFO: Fake field, exist only in values array */
        TOKEN
    }
}

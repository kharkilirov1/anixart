package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.State;
import java.util.HashMap;

/* loaded from: classes.dex */
public class ConstraintReference implements Reference {

    /* renamed from: androidx.constraintlayout.core.state.ConstraintReference$1 */
    public static /* synthetic */ class C01831 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2091a;

        static {
            int[] iArr = new int[State.Constraint.values().length];
            f2091a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2091a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2091a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2091a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2091a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2091a[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2091a[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2091a[7] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2091a[8] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2091a[9] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2091a[10] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2091a[11] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f2091a[14] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f2091a[13] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f2091a[12] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f2091a[17] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f2091a[15] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f2091a[16] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    public interface ConstraintReferenceFactory {
    }

    public static class IncorrectConstraintException extends Exception {
        @Override // java.lang.Throwable
        public String toString() {
            new StringBuilder().append("IncorrectConstraintException: ");
            throw null;
        }
    }

    public ConstraintReference(State state) {
        Object obj = Dimension.f2093c;
        Object obj2 = Dimension.f2092b;
        new Dimension(obj2).f2094a = obj;
        boolean z = obj instanceof Integer;
        if (z) {
            ((Integer) obj).intValue();
        }
        new Dimension(obj2).f2094a = obj;
        if (z) {
            ((Integer) obj).intValue();
        }
        new HashMap();
        new HashMap();
    }
}

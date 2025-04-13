package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class KeyFrameArray {

    public static class CustomArray {

        /* renamed from: a */
        public int[] f2037a;

        /* renamed from: b */
        public CustomAttribute[] f2038b = new CustomAttribute[101];

        public CustomArray() {
            int[] iArr = new int[101];
            this.f2037a = iArr;
            Arrays.fill(iArr, 999);
            Arrays.fill(this.f2038b, (Object) null);
        }
    }

    public static class CustomVar {

        /* renamed from: a */
        public int[] f2039a;

        /* renamed from: b */
        public CustomVariable[] f2040b = new CustomVariable[101];

        public CustomVar() {
            int[] iArr = new int[101];
            this.f2039a = iArr;
            Arrays.fill(iArr, 999);
            Arrays.fill(this.f2040b, (Object) null);
        }
    }

    public static class FloatArray {

        /* renamed from: a */
        public int[] f2041a;

        /* renamed from: b */
        public float[][] f2042b = new float[101][];

        public FloatArray() {
            int[] iArr = new int[101];
            this.f2041a = iArr;
            Arrays.fill(iArr, 999);
            Arrays.fill(this.f2042b, (Object) null);
        }
    }
}

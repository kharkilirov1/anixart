package com.google.firebase.firestore.core;

/* loaded from: classes2.dex */
public class UserData {

    /* renamed from: com.google.firebase.firestore.core.UserData$1 */
    public static /* synthetic */ class C20901 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22750a;

        static {
            int[] iArr = new int[Source.values().length];
            f22750a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22750a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22750a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22750a[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22750a[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static class ParseAccumulator {
    }

    public static class ParseContext {
    }

    public static class ParsedSetData {
    }

    public static class ParsedUpdateData {
    }

    public enum Source {
        /* JADX INFO: Fake field, exist only in values array */
        Set,
        /* JADX INFO: Fake field, exist only in values array */
        MergeSet,
        /* JADX INFO: Fake field, exist only in values array */
        Update,
        /* JADX INFO: Fake field, exist only in values array */
        Argument,
        /* JADX INFO: Fake field, exist only in values array */
        ArrayArgument
    }
}

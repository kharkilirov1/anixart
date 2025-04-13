package com.google.firebase.firestore;

import com.google.firebase.firestore.core.FieldFilter;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Query {

    /* renamed from: com.google.firebase.firestore.Query$1 */
    public static /* synthetic */ class C20801 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22661a;

        static {
            int[] iArr = new int[FieldFilter.Operator.values().length];
            f22661a = iArr;
            try {
                iArr[3] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22661a[6] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22661a[8] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22661a[7] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22661a[9] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum Direction {
        /* JADX INFO: Fake field, exist only in values array */
        ASCENDING,
        /* JADX INFO: Fake field, exist only in values array */
        DESCENDING
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Query)) {
            return false;
        }
        Objects.requireNonNull((Query) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }
}

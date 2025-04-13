package com.google.firebase.firestore;

import androidx.annotation.Nullable;
import com.google.firebase.firestore.core.DocumentViewChange;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DocumentChange {

    /* renamed from: com.google.firebase.firestore.DocumentChange$1 */
    public static /* synthetic */ class C20781 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22619a;

        static {
            int[] iArr = new int[DocumentViewChange.Type.values().length];
            f22619a = iArr;
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22619a[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22619a[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22619a[0] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum Type {
        /* JADX INFO: Fake field, exist only in values array */
        ADDED,
        /* JADX INFO: Fake field, exist only in values array */
        MODIFIED,
        /* JADX INFO: Fake field, exist only in values array */
        REMOVED
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DocumentChange)) {
            return false;
        }
        Objects.requireNonNull((DocumentChange) obj);
        throw null;
    }

    public int hashCode() {
        throw null;
    }
}

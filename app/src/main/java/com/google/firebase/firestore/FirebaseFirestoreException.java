package com.google.firebase.firestore;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.FirebaseException;
import com.google.firebase.firestore.util.Assert;
import com.google.firebase.firestore.util.Preconditions;

/* loaded from: classes2.dex */
public class FirebaseFirestoreException extends FirebaseException {

    /* renamed from: b */
    @NonNull
    public final Code f22627b;

    public enum Code {
        OK(0),
        CANCELLED(1),
        UNKNOWN(2),
        INVALID_ARGUMENT(3),
        DEADLINE_EXCEEDED(4),
        NOT_FOUND(5),
        ALREADY_EXISTS(6),
        PERMISSION_DENIED(7),
        RESOURCE_EXHAUSTED(8),
        FAILED_PRECONDITION(9),
        ABORTED(10),
        OUT_OF_RANGE(11),
        UNIMPLEMENTED(12),
        INTERNAL(13),
        UNAVAILABLE(14),
        DATA_LOSS(15),
        UNAUTHENTICATED(16);


        /* renamed from: t */
        public static final SparseArray<Code> f22645t;

        /* renamed from: b */
        public final int f22647b;

        static {
            SparseArray<Code> sparseArray = new SparseArray<>();
            for (Code code : values()) {
                Code code2 = sparseArray.get(code.f22647b);
                if (code2 != null) {
                    throw new IllegalStateException("Code value duplication between " + code2 + "&" + code.name());
                }
                sparseArray.put(code.f22647b, code);
            }
            f22645t = sparseArray;
        }

        Code(int i2) {
            this.f22647b = i2;
        }

        @NonNull
        /* renamed from: a */
        public static Code m12388a(int i2) {
            return f22645t.get(i2, UNKNOWN);
        }
    }

    public FirebaseFirestoreException(@NonNull String str, @NonNull Code code, @Nullable Throwable th) {
        super(str, th);
        Preconditions.m12496b(str, "Provided message must not be null.");
        Assert.m12490b(code != Code.OK, "A FirebaseFirestoreException should never be thrown for OK", new Object[0]);
        Preconditions.m12496b(code, "Provided code must not be null.");
        this.f22627b = code;
    }
}

package com.google.firebase.firestore.util;

import com.google.android.exoplayer2.trackselection.C1136a;
import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.FirebaseFirestoreException;
import com.google.protobuf.ByteString;
import io.grpc.Status;
import io.grpc.StatusException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Util {

    /* renamed from: a */
    public static final /* synthetic */ int f23027a = 0;

    /* renamed from: com.google.firebase.firestore.util.Util$1 */
    class C21321 implements Iterator {
        @Override // java.util.Iterator
        public boolean hasNext() {
            throw null;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw null;
        }
    }

    static {
        new SecureRandom();
        C1136a c1136a = C1136a.f14047n;
    }

    /* renamed from: a */
    public static int m12497a(byte[] bArr, byte[] bArr2) {
        int min = Math.min(bArr.length, bArr2.length);
        for (int i2 = 0; i2 < min; i2++) {
            int i3 = bArr[i2] & 255;
            int i4 = bArr2[i2] & 255;
            if (i3 < i4) {
                return -1;
            }
            if (i3 > i4) {
                return 1;
            }
        }
        return m12499c(bArr.length, bArr2.length);
    }

    /* renamed from: b */
    public static int m12498b(ByteString byteString, ByteString byteString2) {
        int min = Math.min(byteString.size(), byteString2.size());
        for (int i2 = 0; i2 < min; i2++) {
            int mo13159d = byteString.mo13159d(i2) & 255;
            int mo13159d2 = byteString2.mo13159d(i2) & 255;
            if (mo13159d < mo13159d2) {
                return -1;
            }
            if (mo13159d > mo13159d2) {
                return 1;
            }
        }
        return m12499c(byteString.size(), byteString2.size());
    }

    /* renamed from: c */
    public static int m12499c(int i2, int i3) {
        if (i2 < i3) {
            return -1;
        }
        return i2 > i3 ? 1 : 0;
    }

    /* renamed from: d */
    public static int m12500d(double d, long j2) {
        if (Double.isNaN(d) || d < -9.223372036854776E18d) {
            return -1;
        }
        if (d >= 9.223372036854776E18d) {
            return 1;
        }
        long j3 = (long) d;
        int i2 = j3 >= j2 ? j3 > j2 ? 1 : 0 : -1;
        return i2 != 0 ? i2 : NumberComparisonHelper.m11116a(d, j2);
    }

    /* renamed from: e */
    public static FirebaseFirestoreException m12501e(Status status) {
        Objects.requireNonNull(status);
        StatusException statusException = new StatusException(status);
        return new FirebaseFirestoreException(statusException.getMessage(), FirebaseFirestoreException.Code.m12388a(status.f58291a.f58312b), statusException);
    }

    /* renamed from: f */
    public static String m12502f(ByteString byteString) {
        int size = byteString.size();
        StringBuilder sb = new StringBuilder(size * 2);
        for (int i2 = 0; i2 < size; i2++) {
            int mo13159d = byteString.mo13159d(i2) & 255;
            sb.append(Character.forDigit(mo13159d >>> 4, 16));
            sb.append(Character.forDigit(mo13159d & 15, 16));
        }
        return sb.toString();
    }
}

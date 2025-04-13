package kotlin.collections;

import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Arrays.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"kotlin-stdlib"}, m31885k = 5, m31886mv = {1, 7, 1}, m31889xs = "kotlin/collections/ArraysKt")
/* loaded from: classes3.dex */
class ArraysKt__ArraysKt extends ArraysKt__ArraysJVMKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static final <T> void m31978b(T[] tArr, StringBuilder sb, List<Object[]> list) {
        if (list.contains(tArr)) {
            sb.append("[...]");
            return;
        }
        list.add(tArr);
        sb.append('[');
        int length = tArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i2 != 0) {
                sb.append(", ");
            }
            Object[] objArr = tArr[i2];
            if (objArr == 0) {
                sb.append("null");
            } else if (objArr instanceof Object[]) {
                m31978b(objArr, sb, list);
            } else if (objArr instanceof byte[]) {
                String arrays = Arrays.toString((byte[]) objArr);
                Intrinsics.m32178g(arrays, "toString(this)");
                sb.append(arrays);
            } else if (objArr instanceof short[]) {
                String arrays2 = Arrays.toString((short[]) objArr);
                Intrinsics.m32178g(arrays2, "toString(this)");
                sb.append(arrays2);
            } else if (objArr instanceof int[]) {
                String arrays3 = Arrays.toString((int[]) objArr);
                Intrinsics.m32178g(arrays3, "toString(this)");
                sb.append(arrays3);
            } else if (objArr instanceof long[]) {
                String arrays4 = Arrays.toString((long[]) objArr);
                Intrinsics.m32178g(arrays4, "toString(this)");
                sb.append(arrays4);
            } else if (objArr instanceof float[]) {
                String arrays5 = Arrays.toString((float[]) objArr);
                Intrinsics.m32178g(arrays5, "toString(this)");
                sb.append(arrays5);
            } else if (objArr instanceof double[]) {
                String arrays6 = Arrays.toString((double[]) objArr);
                Intrinsics.m32178g(arrays6, "toString(this)");
                sb.append(arrays6);
            } else if (objArr instanceof char[]) {
                String arrays7 = Arrays.toString((char[]) objArr);
                Intrinsics.m32178g(arrays7, "toString(this)");
                sb.append(arrays7);
            } else if (objArr instanceof boolean[]) {
                String arrays8 = Arrays.toString((boolean[]) objArr);
                Intrinsics.m32178g(arrays8, "toString(this)");
                sb.append(arrays8);
            } else if (objArr instanceof UByteArray) {
                byte[] bArr = ((UByteArray) objArr).f63072b;
                sb.append(bArr != null ? CollectionsKt.m31989B(new UByteArray(bArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (objArr instanceof UShortArray) {
                short[] sArr = ((UShortArray) objArr).f63085b;
                sb.append(sArr != null ? CollectionsKt.m31989B(new UShortArray(sArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (objArr instanceof UIntArray) {
                int[] iArr = ((UIntArray) objArr).f63076b;
                sb.append(iArr != null ? CollectionsKt.m31989B(new UIntArray(iArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else if (objArr instanceof ULongArray) {
                long[] jArr = ((ULongArray) objArr).f63080b;
                sb.append(jArr != null ? CollectionsKt.m31989B(new ULongArray(jArr), ", ", "[", "]", 0, null, null, 56, null) : "null");
            } else {
                sb.append(objArr.toString());
            }
        }
        sb.append(']');
        list.remove(CollectionsKt.m32047x(list));
    }
}

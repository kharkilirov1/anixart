package okio.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.SegmentedByteString;
import org.jetbrains.annotations.NotNull;

/* compiled from: SegmentedByteString.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, m31884d2 = {"okio"}, m31885k = 2, m31886mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class SegmentedByteStringKt {
    /* renamed from: a */
    public static final int m34627a(@NotNull SegmentedByteString segmentedByteString, int i2) {
        int i3;
        int[] binarySearch = segmentedByteString.f68805h;
        int i4 = i2 + 1;
        int length = segmentedByteString.f68804g.length;
        Intrinsics.m32179h(binarySearch, "$this$binarySearch");
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = binarySearch[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }
}

package com.google.protobuf;

import java.util.Objects;

/* loaded from: classes2.dex */
final class FieldInfo implements Comparable<FieldInfo> {

    /* renamed from: com.google.protobuf.FieldInfo$1 */
    public static /* synthetic */ class C23711 {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24152a;

        static {
            int[] iArr = new int[FieldType.values().length];
            f24152a = iArr;
            try {
                iArr[FieldType.f24160d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24152a[FieldType.f24161e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24152a[FieldType.f24162f.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f24152a[FieldType.f24165i.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class Builder {
    }

    @Override // java.lang.Comparable
    public int compareTo(FieldInfo fieldInfo) {
        Objects.requireNonNull(fieldInfo);
        return 0;
    }
}

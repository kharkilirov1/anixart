package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum NullValue implements Internal.EnumLite {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f24305b;

    /* renamed from: com.google.protobuf.NullValue$1 */
    public static class C23901 implements Internal.EnumLiteMap<NullValue> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public NullValue mo11029a(int i2) {
            if (i2 != 0) {
                return null;
            }
            return NullValue.NULL_VALUE;
        }
    }

    public static final class NullValueVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return (i2 != 0 ? null : NullValue.NULL_VALUE) != null;
        }
    }

    NullValue(int i2) {
        this.f24305b = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f24305b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

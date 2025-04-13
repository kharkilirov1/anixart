package com.google.protobuf;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Syntax implements Internal.EnumLite {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f24371b;

    /* renamed from: com.google.protobuf.Syntax$1 */
    public static class C23991 implements Internal.EnumLiteMap<Syntax> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public Syntax mo11029a(int i2) {
            if (i2 == 0) {
                return Syntax.SYNTAX_PROTO2;
            }
            if (i2 != 1) {
                return null;
            }
            return Syntax.SYNTAX_PROTO3;
        }
    }

    public static final class SyntaxVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return (i2 != 0 ? i2 != 1 ? null : Syntax.SYNTAX_PROTO3 : Syntax.SYNTAX_PROTO2) != null;
        }
    }

    Syntax(int i2) {
        this.f24371b = i2;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f24371b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

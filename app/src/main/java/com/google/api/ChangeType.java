package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes.dex */
public enum ChangeType implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f20353b;

    /* renamed from: com.google.api.ChangeType$1 */
    public class C14981 implements Internal.EnumLiteMap<ChangeType> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public ChangeType mo11029a(int i2) {
            return ChangeType.m11033a(i2);
        }
    }

    public static final class ChangeTypeVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return ChangeType.m11033a(i2) != null;
        }
    }

    ChangeType(int i2) {
        this.f20353b = i2;
    }

    /* renamed from: a */
    public static ChangeType m11033a(int i2) {
        if (i2 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i2 == 1) {
            return ADDED;
        }
        if (i2 == 2) {
            return REMOVED;
        }
        if (i2 != 3) {
            return null;
        }
        return MODIFIED;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f20353b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

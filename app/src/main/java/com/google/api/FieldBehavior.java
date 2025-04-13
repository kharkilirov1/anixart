package com.google.api;

import com.google.protobuf.Internal;

/* loaded from: classes.dex */
public enum FieldBehavior implements Internal.EnumLite {
    FIELD_BEHAVIOR_UNSPECIFIED(0),
    OPTIONAL(1),
    REQUIRED(2),
    OUTPUT_ONLY(3),
    INPUT_ONLY(4),
    IMMUTABLE(5),
    UNRECOGNIZED(-1);


    /* renamed from: j */
    public static final Internal.EnumLiteMap<FieldBehavior> f20371j = new Internal.EnumLiteMap<FieldBehavior>() { // from class: com.google.api.FieldBehavior.1
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public FieldBehavior mo11029a(int i2) {
            return FieldBehavior.m11049a(i2);
        }
    };

    /* renamed from: b */
    public final int f20373b;

    public static final class FieldBehaviorVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return FieldBehavior.m11049a(i2) != null;
        }
    }

    FieldBehavior(int i2) {
        this.f20373b = i2;
    }

    /* renamed from: a */
    public static FieldBehavior m11049a(int i2) {
        if (i2 == 0) {
            return FIELD_BEHAVIOR_UNSPECIFIED;
        }
        if (i2 == 1) {
            return OPTIONAL;
        }
        if (i2 == 2) {
            return REQUIRED;
        }
        if (i2 == 3) {
            return OUTPUT_ONLY;
        }
        if (i2 == 4) {
            return INPUT_ONLY;
        }
        if (i2 != 5) {
            return null;
        }
        return IMMUTABLE;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f20373b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

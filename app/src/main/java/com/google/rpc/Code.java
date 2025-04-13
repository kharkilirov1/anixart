package com.google.rpc;

import com.google.protobuf.Internal;

/* loaded from: classes2.dex */
public enum Code implements Internal.EnumLite {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    UNAUTHENTICATED(16),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNRECOGNIZED(-1);


    /* renamed from: b */
    public final int f24457b;

    /* renamed from: com.google.rpc.Code$1 */
    public class C24191 implements Internal.EnumLiteMap<Code> {
        @Override // com.google.protobuf.Internal.EnumLiteMap
        /* renamed from: a */
        public Code mo11029a(int i2) {
            return Code.m13757a(i2);
        }
    }

    public static final class CodeVerifier implements Internal.EnumVerifier {
        @Override // com.google.protobuf.Internal.EnumVerifier
        /* renamed from: a */
        public boolean mo11030a(int i2) {
            return Code.m13757a(i2) != null;
        }
    }

    Code(int i2) {
        this.f24457b = i2;
    }

    /* renamed from: a */
    public static Code m13757a(int i2) {
        switch (i2) {
            case 0:
                return OK;
            case 1:
                return CANCELLED;
            case 2:
                return UNKNOWN;
            case 3:
                return INVALID_ARGUMENT;
            case 4:
                return DEADLINE_EXCEEDED;
            case 5:
                return NOT_FOUND;
            case 6:
                return ALREADY_EXISTS;
            case 7:
                return PERMISSION_DENIED;
            case 8:
                return RESOURCE_EXHAUSTED;
            case 9:
                return FAILED_PRECONDITION;
            case 10:
                return ABORTED;
            case 11:
                return OUT_OF_RANGE;
            case 12:
                return UNIMPLEMENTED;
            case 13:
                return INTERNAL;
            case 14:
                return UNAVAILABLE;
            case 15:
                return DATA_LOSS;
            case 16:
                return UNAUTHENTICATED;
            default:
                return null;
        }
    }

    @Override // com.google.protobuf.Internal.EnumLite
    /* renamed from: x */
    public final int mo11028x() {
        if (this != UNRECOGNIZED) {
            return this.f24457b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}

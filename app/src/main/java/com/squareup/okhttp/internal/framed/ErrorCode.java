package com.squareup.okhttp.internal.framed;

/* loaded from: classes2.dex */
public enum ErrorCode {
    NO_ERROR(0, -1, 0),
    PROTOCOL_ERROR(1, 1, 1),
    INVALID_STREAM(1, 2, -1),
    /* JADX INFO: Fake field, exist only in values array */
    UNSUPPORTED_VERSION(1, 4, -1),
    STREAM_IN_USE(1, 8, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_ALREADY_CLOSED(1, 9, -1),
    INTERNAL_ERROR(2, 6, 2),
    FLOW_CONTROL_ERROR(3, 7, -1),
    /* JADX INFO: Fake field, exist only in values array */
    STREAM_CLOSED(5, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    FRAME_TOO_LARGE(6, 11, -1),
    REFUSED_STREAM(7, 3, -1),
    CANCEL(8, 5, -1),
    /* JADX INFO: Fake field, exist only in values array */
    COMPRESSION_ERROR(9, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    CONNECT_ERROR(10, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    INADEQUATE_SECURITY(12, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13, -1, -1),
    /* JADX INFO: Fake field, exist only in values array */
    INVALID_CREDENTIALS(-1, 10, -1);


    /* renamed from: b */
    public final int f24990b;

    /* renamed from: c */
    public final int f24991c;

    /* renamed from: d */
    public final int f24992d;

    ErrorCode(int i2, int i3, int i4) {
        this.f24990b = i2;
        this.f24991c = i3;
        this.f24992d = i4;
    }

    /* renamed from: a */
    public static ErrorCode m13943a(int i2) {
        for (ErrorCode errorCode : values()) {
            if (errorCode.f24990b == i2) {
                return errorCode;
            }
        }
        return null;
    }
}

package com.google.android.datatransport.runtime.firebase.transport;

import com.google.firebase.encoders.proto.ProtoEnum;

/* loaded from: classes.dex */
public final class LogEventDropped {

    /* renamed from: a */
    public final long f9223a;

    /* renamed from: b */
    public final Reason f9224b;

    public static final class Builder {

        /* renamed from: a */
        public long f9225a = 0;

        /* renamed from: b */
        public Reason f9226b = Reason.REASON_UNKNOWN;
    }

    public enum Reason implements ProtoEnum {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);


        /* renamed from: b */
        public final int f9235b;

        Reason(int i2) {
            this.f9235b = i2;
        }

        @Override // com.google.firebase.encoders.proto.ProtoEnum
        /* renamed from: x */
        public int mo5543x() {
            return this.f9235b;
        }
    }

    public LogEventDropped(long j2, Reason reason) {
        this.f9223a = j2;
        this.f9224b = reason;
    }
}

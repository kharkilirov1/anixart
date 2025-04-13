package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes2.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: b */
    public MessageLite f24221b;

    /* renamed from: c */
    public boolean f24222c;

    public static class InvalidWireTypeException extends InvalidProtocolBufferException {
        public InvalidWireTypeException(String str) {
            super(str);
        }
    }

    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    /* renamed from: a */
    public static InvalidProtocolBufferException m13456a() {
        return new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
    }

    /* renamed from: b */
    public static InvalidProtocolBufferException m13457b() {
        return new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    /* renamed from: c */
    public static InvalidProtocolBufferException m13458c() {
        return new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    /* renamed from: d */
    public static InvalidWireTypeException m13459d() {
        return new InvalidWireTypeException("Protocol message tag had invalid wire type.");
    }

    /* renamed from: e */
    public static InvalidProtocolBufferException m13460e() {
        return new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    /* renamed from: f */
    public static InvalidProtocolBufferException m13461f() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: g */
    public static InvalidProtocolBufferException m13462g() {
        return new InvalidProtocolBufferException("Failed to parse the message.");
    }

    /* renamed from: h */
    public static InvalidProtocolBufferException m13463h() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public InvalidProtocolBufferException(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }
}

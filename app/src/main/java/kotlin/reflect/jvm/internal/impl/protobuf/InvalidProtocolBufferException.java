package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public class InvalidProtocolBufferException extends IOException {

    /* renamed from: b */
    public MessageLite f65674b;

    public InvalidProtocolBufferException(String str) {
        super(str);
        this.f65674b = null;
    }

    /* renamed from: a */
    public static InvalidProtocolBufferException m33327a() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* renamed from: b */
    public static InvalidProtocolBufferException m33328b() {
        return new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* renamed from: d */
    public static InvalidProtocolBufferException m33329d() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    /* renamed from: c */
    public InvalidProtocolBufferException m33330c(MessageLite messageLite) {
        this.f65674b = messageLite;
        return this;
    }
}

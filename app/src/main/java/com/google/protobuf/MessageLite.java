package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends MessageLiteOrBuilder, Cloneable {
        /* renamed from: A */
        MessageLite mo13437A();

        /* renamed from: F0 */
        Builder mo12982F0(MessageLite messageLite);

        /* renamed from: K0 */
        MessageLite mo13438K0();
    }

    /* renamed from: b */
    Builder mo13429b();

    /* renamed from: c */
    int mo13430c();

    /* renamed from: d */
    Builder mo13431d();

    /* renamed from: f */
    void mo12975f(OutputStream outputStream) throws IOException;

    /* renamed from: g */
    void mo13433g(CodedOutputStream codedOutputStream) throws IOException;

    /* renamed from: h */
    ByteString mo12976h();

    /* renamed from: i */
    byte[] mo12977i();
}

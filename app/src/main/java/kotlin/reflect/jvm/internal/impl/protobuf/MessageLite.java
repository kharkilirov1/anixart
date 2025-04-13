package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public interface MessageLite extends MessageLiteOrBuilder {

    public interface Builder extends Cloneable, MessageLiteOrBuilder {
        /* renamed from: A */
        MessageLite mo32962A();

        /* renamed from: b0 */
        Builder mo32963b0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException;
    }

    /* renamed from: b */
    Builder mo32956b();

    /* renamed from: c */
    int mo32957c();

    /* renamed from: d */
    Builder mo32958d();

    /* renamed from: f */
    void mo32960f(CodedOutputStream codedOutputStream) throws IOException;
}

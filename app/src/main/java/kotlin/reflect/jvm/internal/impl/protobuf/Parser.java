package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.InputStream;

/* loaded from: classes3.dex */
public interface Parser<MessageType> {
    /* renamed from: a */
    MessageType mo32961a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;

    /* renamed from: b */
    MessageType mo33216b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException;
}

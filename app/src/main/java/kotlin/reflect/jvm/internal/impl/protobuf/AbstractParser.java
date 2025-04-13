package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;

/* loaded from: classes3.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {

    /* renamed from: a */
    public static final ExtensionRegistryLite f65617a = ExtensionRegistryLite.f65645b;

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.Parser
    /* renamed from: b */
    public Object mo33216b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        MessageType m33218d;
        try {
            int read = inputStream.read();
            if (read == -1) {
                m33218d = null;
            } else {
                if ((read & 128) != 0) {
                    read &= 127;
                    int i2 = 7;
                    while (true) {
                        if (i2 >= 32) {
                            while (i2 < 64) {
                                int read2 = inputStream.read();
                                if (read2 == -1) {
                                    throw InvalidProtocolBufferException.m33329d();
                                }
                                if ((read2 & 128) != 0) {
                                    i2 += 7;
                                }
                            }
                            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
                        }
                        int read3 = inputStream.read();
                        if (read3 == -1) {
                            throw InvalidProtocolBufferException.m33329d();
                        }
                        read |= (read3 & 127) << i2;
                        if ((read3 & 128) == 0) {
                            break;
                        }
                        i2 += 7;
                    }
                }
                m33218d = m33218d(new AbstractMessageLite.Builder.LimitedInputStream(inputStream, read), extensionRegistryLite);
            }
            m33217c(m33218d);
            return m33218d;
        } catch (IOException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        }
    }

    /* renamed from: c */
    public final MessageType m33217c(MessageType messagetype) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.mo32959e()) {
            return messagetype;
        }
        if (messagetype instanceof AbstractMessageLite) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.f65674b = messagetype;
        throw invalidProtocolBufferException;
    }

    /* renamed from: d */
    public MessageType m33218d(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        CodedInputStream codedInputStream = new CodedInputStream(inputStream);
        MessageType messagetype = (MessageType) mo32961a(codedInputStream, extensionRegistryLite);
        try {
            codedInputStream.m33241a(0);
            return messagetype;
        } catch (InvalidProtocolBufferException e2) {
            e2.f65674b = messagetype;
            throw e2;
        }
    }
}

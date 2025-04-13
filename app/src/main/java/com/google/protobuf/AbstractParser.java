package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;

/* loaded from: classes2.dex */
public abstract class AbstractParser<MessageType extends MessageLite> implements Parser<MessageType> {
    static {
        ExtensionRegistryLite.m13368a();
    }

    @Override // com.google.protobuf.Parser
    /* renamed from: a */
    public Object mo12985a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        GeneratedMessageLite m13415D = GeneratedMessageLite.m13415D(((GeneratedMessageLite.DefaultInstanceBasedParser) this).f24187a, codedInputStream, extensionRegistryLite);
        m12986b(m13415D);
        return m13415D;
    }

    /* renamed from: b */
    public final MessageType m12986b(MessageType messagetype) throws InvalidProtocolBufferException {
        UninitializedMessageException uninitializedMessageException;
        if (messagetype == null || messagetype.mo13432e()) {
            return messagetype;
        }
        if (messagetype instanceof AbstractMessageLite) {
            uninitializedMessageException = new UninitializedMessageException();
        } else {
            uninitializedMessageException = new UninitializedMessageException();
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(uninitializedMessageException.getMessage());
        invalidProtocolBufferException.f24221b = messagetype;
        throw invalidProtocolBufferException;
    }
}

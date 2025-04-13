package com.google.protobuf;

import java.nio.charset.Charset;
import p000a.C0000a;

/* loaded from: classes2.dex */
final class ManifestSchemaFactory implements SchemaFactory {

    /* renamed from: b */
    public static final MessageInfoFactory f24258b = new MessageInfoFactory() { // from class: com.google.protobuf.ManifestSchemaFactory.1
        @Override // com.google.protobuf.MessageInfoFactory
        /* renamed from: a */
        public MessageInfo mo13411a(Class<?> cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.MessageInfoFactory
        /* renamed from: b */
        public boolean mo13412b(Class<?> cls) {
            return false;
        }
    };

    /* renamed from: a */
    public final MessageInfoFactory f24259a;

    public static class CompositeMessageInfoFactory implements MessageInfoFactory {

        /* renamed from: a */
        public MessageInfoFactory[] f24260a;

        public CompositeMessageInfoFactory(MessageInfoFactory... messageInfoFactoryArr) {
            this.f24260a = messageInfoFactoryArr;
        }

        @Override // com.google.protobuf.MessageInfoFactory
        /* renamed from: a */
        public MessageInfo mo13411a(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.f24260a) {
                if (messageInfoFactory.mo13412b(cls)) {
                    return messageInfoFactory.mo13411a(cls);
                }
            }
            StringBuilder m24u = C0000a.m24u("No factory is available for message type: ");
            m24u.append(cls.getName());
            throw new UnsupportedOperationException(m24u.toString());
        }

        @Override // com.google.protobuf.MessageInfoFactory
        /* renamed from: b */
        public boolean mo13412b(Class<?> cls) {
            for (MessageInfoFactory messageInfoFactory : this.f24260a) {
                if (messageInfoFactory.mo13412b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        MessageInfoFactory[] messageInfoFactoryArr = new MessageInfoFactory[2];
        messageInfoFactoryArr[0] = GeneratedMessageInfoFactory.f24182a;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            messageInfoFactory = f24258b;
        }
        messageInfoFactoryArr[1] = messageInfoFactory;
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory(messageInfoFactoryArr);
        Charset charset = Internal.f24210a;
        this.f24259a = compositeMessageInfoFactory;
    }

    @Override // com.google.protobuf.SchemaFactory
    /* renamed from: a */
    public <T> Schema<T> mo13487a(Class<T> cls) {
        Class<?> cls2;
        Class<?> cls3 = SchemaUtil.f24337a;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = SchemaUtil.f24337a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
        MessageInfo mo13411a = this.f24259a.mo13411a(cls);
        if (mo13411a.mo13501a()) {
            if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
                UnknownFieldSchema<?, ?> unknownFieldSchema = SchemaUtil.f24340d;
                ExtensionSchema<?> extensionSchema = ExtensionSchemas.f24120a;
                return new MessageSetSchema(unknownFieldSchema, ExtensionSchemas.f24120a, mo13411a.mo13502b());
            }
            UnknownFieldSchema<?, ?> unknownFieldSchema2 = SchemaUtil.f24338b;
            ExtensionSchema<?> extensionSchema2 = ExtensionSchemas.f24121b;
            if (extensionSchema2 != null) {
                return new MessageSetSchema(unknownFieldSchema2, extensionSchema2, mo13411a.mo13502b());
            }
            throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
        }
        ProtoSyntax protoSyntax = ProtoSyntax.PROTO2;
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            if (!(mo13411a.mo13503c() == protoSyntax)) {
                return MessageSchema.m13507B(mo13411a, NewInstanceSchemas.f24300b, ListFieldSchema.f24252b, SchemaUtil.f24340d, null, MapFieldSchemas.f24272b);
            }
            NewInstanceSchema newInstanceSchema = NewInstanceSchemas.f24300b;
            ListFieldSchema listFieldSchema = ListFieldSchema.f24252b;
            UnknownFieldSchema<?, ?> unknownFieldSchema3 = SchemaUtil.f24340d;
            ExtensionSchema<?> extensionSchema3 = ExtensionSchemas.f24120a;
            return MessageSchema.m13507B(mo13411a, newInstanceSchema, listFieldSchema, unknownFieldSchema3, ExtensionSchemas.f24120a, MapFieldSchemas.f24272b);
        }
        if (!(mo13411a.mo13503c() == protoSyntax)) {
            return MessageSchema.m13507B(mo13411a, NewInstanceSchemas.f24299a, ListFieldSchema.f24251a, SchemaUtil.f24339c, null, MapFieldSchemas.f24271a);
        }
        NewInstanceSchema newInstanceSchema2 = NewInstanceSchemas.f24299a;
        ListFieldSchema listFieldSchema2 = ListFieldSchema.f24251a;
        UnknownFieldSchema<?, ?> unknownFieldSchema4 = SchemaUtil.f24338b;
        ExtensionSchema<?> extensionSchema4 = ExtensionSchemas.f24121b;
        if (extensionSchema4 != null) {
            return MessageSchema.m13507B(mo13411a, newInstanceSchema2, listFieldSchema2, unknownFieldSchema4, extensionSchema4, MapFieldSchemas.f24271a);
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}

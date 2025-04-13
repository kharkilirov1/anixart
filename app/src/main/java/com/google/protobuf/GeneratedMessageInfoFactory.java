package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import p000a.C0000a;

/* loaded from: classes2.dex */
class GeneratedMessageInfoFactory implements MessageInfoFactory {

    /* renamed from: a */
    public static final GeneratedMessageInfoFactory f24182a = new GeneratedMessageInfoFactory();

    @Override // com.google.protobuf.MessageInfoFactory
    /* renamed from: a */
    public MessageInfo mo13411a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            StringBuilder m24u = C0000a.m24u("Unsupported message type: ");
            m24u.append(cls.getName());
            throw new IllegalArgumentException(m24u.toString());
        }
        try {
            return (MessageInfo) GeneratedMessageLite.m13423u(cls.asSubclass(GeneratedMessageLite.class)).mo11020p(GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO, null, null);
        } catch (Exception e2) {
            StringBuilder m24u2 = C0000a.m24u("Unable to get message info for ");
            m24u2.append(cls.getName());
            throw new RuntimeException(m24u2.toString(), e2);
        }
    }

    @Override // com.google.protobuf.MessageInfoFactory
    /* renamed from: b */
    public boolean mo13412b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}

package com.google.protobuf;

/* loaded from: classes2.dex */
final class RawMessageInfo implements MessageInfo {

    /* renamed from: a */
    public final MessageLite f24316a;

    /* renamed from: b */
    public final String f24317b;

    /* renamed from: c */
    public final Object[] f24318c;

    /* renamed from: d */
    public final int f24319d;

    public RawMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        this.f24316a = messageLite;
        this.f24317b = str;
        this.f24318c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f24319d = charAt;
            return;
        }
        int i2 = charAt & 8191;
        int i3 = 13;
        int i4 = 1;
        while (true) {
            int i5 = i4 + 1;
            char charAt2 = str.charAt(i4);
            if (charAt2 < 55296) {
                this.f24319d = i2 | (charAt2 << i3);
                return;
            } else {
                i2 |= (charAt2 & 8191) << i3;
                i3 += 13;
                i4 = i5;
            }
        }
    }

    @Override // com.google.protobuf.MessageInfo
    /* renamed from: a */
    public boolean mo13501a() {
        return (this.f24319d & 2) == 2;
    }

    @Override // com.google.protobuf.MessageInfo
    /* renamed from: b */
    public MessageLite mo13502b() {
        return this.f24316a;
    }

    @Override // com.google.protobuf.MessageInfo
    /* renamed from: c */
    public ProtoSyntax mo13503c() {
        return (this.f24319d & 1) == 1 ? ProtoSyntax.PROTO2 : ProtoSyntax.PROTO3;
    }
}

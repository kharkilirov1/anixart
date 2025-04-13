package com.google.protobuf;

/* loaded from: classes2.dex */
public class LazyFieldLite {

    /* renamed from: a */
    public volatile MessageLite f24247a;

    /* renamed from: b */
    public volatile ByteString f24248b;

    static {
        ExtensionRegistryLite.m13368a();
    }

    /* renamed from: a */
    public MessageLite m13467a(MessageLite messageLite) {
        if (this.f24247a == null) {
            synchronized (this) {
                if (this.f24247a == null) {
                    try {
                        this.f24247a = messageLite;
                        this.f24248b = ByteString.f23981c;
                    } catch (InvalidProtocolBufferException unused) {
                        this.f24247a = messageLite;
                        this.f24248b = ByteString.f23981c;
                    }
                }
            }
        }
        return this.f24247a;
    }

    /* renamed from: b */
    public ByteString m13468b() {
        if (this.f24248b != null) {
            return this.f24248b;
        }
        synchronized (this) {
            if (this.f24248b != null) {
                return this.f24248b;
            }
            if (this.f24247a == null) {
                this.f24248b = ByteString.f23981c;
            } else {
                this.f24248b = this.f24247a.mo12976h();
            }
            return this.f24248b;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyFieldLite)) {
            return false;
        }
        LazyFieldLite lazyFieldLite = (LazyFieldLite) obj;
        MessageLite messageLite = this.f24247a;
        MessageLite messageLite2 = lazyFieldLite.f24247a;
        return (messageLite == null && messageLite2 == null) ? m13468b().equals(lazyFieldLite.m13468b()) : (messageLite == null || messageLite2 == null) ? messageLite != null ? messageLite.equals(lazyFieldLite.m13467a(messageLite.mo13428a())) : m13467a(messageLite2.mo13428a()).equals(messageLite2) : messageLite.equals(messageLite2);
    }

    public int hashCode() {
        return 1;
    }
}

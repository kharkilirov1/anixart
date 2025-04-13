package com.yandex.mobile.ads.impl;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.sb */
/* loaded from: classes3.dex */
public interface InterfaceC5737sb {

    /* renamed from: a */
    public static final ByteBuffer f54551a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    /* renamed from: com.yandex.mobile.ads.impl.sb$a */
    public static final class a {

        /* renamed from: e */
        public static final a f54552e = new a(-1, -1, -1);

        /* renamed from: a */
        public final int f54553a;

        /* renamed from: b */
        public final int f54554b;

        /* renamed from: c */
        public final int f54555c;

        /* renamed from: d */
        public final int f54556d;

        public a(int i2, int i3, int i4) {
            this.f54553a = i2;
            this.f54554b = i3;
            this.f54555c = i4;
            this.f54556d = s91.m28134e(i4) ? s91.m28117b(i4, i3) : -1;
        }

        public final String toString() {
            StringBuilder m26356a = l60.m26356a("AudioFormat[sampleRate=");
            m26356a.append(this.f54553a);
            m26356a.append(", channelCount=");
            m26356a.append(this.f54554b);
            m26356a.append(", encoding=");
            return C0000a.m17n(m26356a, this.f54555c, ']');
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.sb$b */
    public static final class b extends Exception {
        public b(a aVar) {
            super("Unhandled format: " + aVar);
        }
    }

    /* renamed from: a */
    a mo25433a(a aVar) throws b;

    /* renamed from: a */
    void mo25200a(ByteBuffer byteBuffer);

    /* renamed from: a */
    boolean mo25435a();

    /* renamed from: b */
    ByteBuffer mo25436b();

    /* renamed from: c */
    void mo25438c();

    /* renamed from: d */
    boolean mo25439d();

    void flush();

    void reset();
}

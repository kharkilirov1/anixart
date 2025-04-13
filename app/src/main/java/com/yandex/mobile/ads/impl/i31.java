package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Objects;
import okhttp3.internal.p038ws.RealWebSocket;

/* loaded from: classes3.dex */
public final class i31 implements InterfaceC5737sb {

    /* renamed from: b */
    private int f51195b;

    /* renamed from: c */
    private float f51196c = 1.0f;

    /* renamed from: d */
    private float f51197d = 1.0f;

    /* renamed from: e */
    private InterfaceC5737sb.a f51198e;

    /* renamed from: f */
    private InterfaceC5737sb.a f51199f;

    /* renamed from: g */
    private InterfaceC5737sb.a f51200g;

    /* renamed from: h */
    private InterfaceC5737sb.a f51201h;

    /* renamed from: i */
    private boolean f51202i;

    /* renamed from: j */
    @Nullable
    private h31 f51203j;

    /* renamed from: k */
    private ByteBuffer f51204k;

    /* renamed from: l */
    private ShortBuffer f51205l;

    /* renamed from: m */
    private ByteBuffer f51206m;

    /* renamed from: n */
    private long f51207n;

    /* renamed from: o */
    private long f51208o;

    /* renamed from: p */
    private boolean f51209p;

    public i31() {
        InterfaceC5737sb.a aVar = InterfaceC5737sb.a.f54552e;
        this.f51198e = aVar;
        this.f51199f = aVar;
        this.f51200g = aVar;
        this.f51201h = aVar;
        ByteBuffer byteBuffer = InterfaceC5737sb.f54551a;
        this.f51204k = byteBuffer;
        this.f51205l = byteBuffer.asShortBuffer();
        this.f51206m = byteBuffer;
        this.f51195b = -1;
    }

    /* renamed from: a */
    public final void m25434a(float f2) {
        if (this.f51197d != f2) {
            this.f51197d = f2;
            this.f51202i = true;
        }
    }

    /* renamed from: b */
    public final void m25437b(float f2) {
        if (this.f51196c != f2) {
            this.f51196c = f2;
            this.f51202i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: c */
    public final void mo25438c() {
        h31 h31Var = this.f51203j;
        if (h31Var != null) {
            h31Var.m25048e();
        }
        this.f51209p = true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: d */
    public final boolean mo25439d() {
        return this.f51199f.f54553a != -1 && (Math.abs(this.f51196c - 1.0f) >= 1.0E-4f || Math.abs(this.f51197d - 1.0f) >= 1.0E-4f || this.f51199f.f54553a != this.f51198e.f54553a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    public final void flush() {
        if (mo25439d()) {
            InterfaceC5737sb.a aVar = this.f51198e;
            this.f51200g = aVar;
            InterfaceC5737sb.a aVar2 = this.f51199f;
            this.f51201h = aVar2;
            if (this.f51202i) {
                this.f51203j = new h31(aVar.f54553a, aVar.f54554b, this.f51196c, this.f51197d, aVar2.f54553a);
            } else {
                h31 h31Var = this.f51203j;
                if (h31Var != null) {
                    h31Var.m25043a();
                }
            }
        }
        this.f51206m = InterfaceC5737sb.f54551a;
        this.f51207n = 0L;
        this.f51208o = 0L;
        this.f51209p = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    public final void reset() {
        this.f51196c = 1.0f;
        this.f51197d = 1.0f;
        InterfaceC5737sb.a aVar = InterfaceC5737sb.a.f54552e;
        this.f51198e = aVar;
        this.f51199f = aVar;
        this.f51200g = aVar;
        this.f51201h = aVar;
        ByteBuffer byteBuffer = InterfaceC5737sb.f54551a;
        this.f51204k = byteBuffer;
        this.f51205l = byteBuffer.asShortBuffer();
        this.f51206m = byteBuffer;
        this.f51195b = -1;
        this.f51202i = false;
        this.f51203j = null;
        this.f51207n = 0L;
        this.f51208o = 0L;
        this.f51209p = false;
    }

    /* renamed from: a */
    public final long m25432a(long j2) {
        if (this.f51208o >= RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            long j3 = this.f51207n;
            Objects.requireNonNull(this.f51203j);
            long m25047c = j3 - r3.m25047c();
            int i2 = this.f51201h.f54553a;
            int i3 = this.f51200g.f54553a;
            if (i2 == i3) {
                return s91.m28097a(j2, m25047c, this.f51208o);
            }
            return s91.m28097a(j2, m25047c * i2, this.f51208o * i3);
        }
        return (long) (this.f51196c * j2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: b */
    public final ByteBuffer mo25436b() {
        int m25045b;
        h31 h31Var = this.f51203j;
        if (h31Var != null && (m25045b = h31Var.m25045b()) > 0) {
            if (this.f51204k.capacity() < m25045b) {
                ByteBuffer order = ByteBuffer.allocateDirect(m25045b).order(ByteOrder.nativeOrder());
                this.f51204k = order;
                this.f51205l = order.asShortBuffer();
            } else {
                this.f51204k.clear();
                this.f51205l.clear();
            }
            h31Var.m25044a(this.f51205l);
            this.f51208o += m25045b;
            this.f51204k.limit(m25045b);
            this.f51206m = this.f51204k;
        }
        ByteBuffer byteBuffer = this.f51206m;
        this.f51206m = InterfaceC5737sb.f54551a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final InterfaceC5737sb.a mo25433a(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        if (aVar.f54555c == 2) {
            int i2 = this.f51195b;
            if (i2 == -1) {
                i2 = aVar.f54553a;
            }
            this.f51198e = aVar;
            InterfaceC5737sb.a aVar2 = new InterfaceC5737sb.a(i2, aVar.f54554b, 2);
            this.f51199f = aVar2;
            this.f51202i = true;
            return aVar2;
        }
        throw new InterfaceC5737sb.b(aVar);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final void mo25200a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            h31 h31Var = this.f51203j;
            Objects.requireNonNull(h31Var);
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f51207n += remaining;
            h31Var.m25046b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final boolean mo25435a() {
        h31 h31Var;
        return this.f51209p && ((h31Var = this.f51203j) == null || h31Var.m25045b() == 0);
    }
}

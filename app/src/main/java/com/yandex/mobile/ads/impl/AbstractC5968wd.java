package com.yandex.mobile.ads.impl;

import androidx.annotation.CallSuper;
import com.yandex.mobile.ads.impl.InterfaceC5737sb;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* renamed from: com.yandex.mobile.ads.impl.wd */
/* loaded from: classes3.dex */
public abstract class AbstractC5968wd implements InterfaceC5737sb {

    /* renamed from: b */
    public InterfaceC5737sb.a f56110b;

    /* renamed from: c */
    public InterfaceC5737sb.a f56111c;

    /* renamed from: d */
    private InterfaceC5737sb.a f56112d;

    /* renamed from: e */
    private InterfaceC5737sb.a f56113e;

    /* renamed from: f */
    private ByteBuffer f56114f;

    /* renamed from: g */
    private ByteBuffer f56115g;

    /* renamed from: h */
    private boolean f56116h;

    public AbstractC5968wd() {
        ByteBuffer byteBuffer = InterfaceC5737sb.f54551a;
        this.f56114f = byteBuffer;
        this.f56115g = byteBuffer;
        InterfaceC5737sb.a aVar = InterfaceC5737sb.a.f54552e;
        this.f56112d = aVar;
        this.f56113e = aVar;
        this.f56110b = aVar;
        this.f56111c = aVar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: a */
    public final InterfaceC5737sb.a mo25433a(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b {
        this.f56112d = aVar;
        this.f56113e = mo25202b(aVar);
        return mo25439d() ? this.f56113e : InterfaceC5737sb.a.f54552e;
    }

    /* renamed from: b */
    public abstract InterfaceC5737sb.a mo25202b(InterfaceC5737sb.a aVar) throws InterfaceC5737sb.b;

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    @CallSuper
    /* renamed from: b */
    public ByteBuffer mo25436b() {
        ByteBuffer byteBuffer = this.f56115g;
        this.f56115g = InterfaceC5737sb.f54551a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: c */
    public final void mo25438c() {
        this.f56116h = true;
        mo29472g();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    /* renamed from: d */
    public boolean mo25439d() {
        return this.f56113e != InterfaceC5737sb.a.f54552e;
    }

    /* renamed from: e */
    public final boolean m29471e() {
        return this.f56115g.hasRemaining();
    }

    /* renamed from: f */
    public void mo25203f() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    public final void flush() {
        this.f56115g = InterfaceC5737sb.f54551a;
        this.f56116h = false;
        this.f56110b = this.f56112d;
        this.f56111c = this.f56113e;
        mo25203f();
    }

    /* renamed from: g */
    public void mo29472g() {
    }

    /* renamed from: h */
    public void mo25204h() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    public final void reset() {
        flush();
        this.f56114f = InterfaceC5737sb.f54551a;
        InterfaceC5737sb.a aVar = InterfaceC5737sb.a.f54552e;
        this.f56112d = aVar;
        this.f56113e = aVar;
        this.f56110b = aVar;
        this.f56111c = aVar;
        mo25204h();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5737sb
    @CallSuper
    /* renamed from: a */
    public boolean mo25435a() {
        return this.f56116h && this.f56115g == InterfaceC5737sb.f54551a;
    }

    /* renamed from: a */
    public final ByteBuffer m29470a(int i2) {
        if (this.f56114f.capacity() < i2) {
            this.f56114f = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.f56114f.clear();
        }
        ByteBuffer byteBuffer = this.f56114f;
        this.f56115g = byteBuffer;
        return byteBuffer;
    }
}

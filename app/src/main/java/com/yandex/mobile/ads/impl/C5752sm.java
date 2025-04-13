package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import p000a.C0000a;

/* renamed from: com.yandex.mobile.ads.impl.sm */
/* loaded from: classes3.dex */
public class C5752sm extends AbstractC5438mf {

    /* renamed from: b */
    public final C5695rl f54756b;

    /* renamed from: c */
    @Nullable
    public ByteBuffer f54757c;

    /* renamed from: d */
    public boolean f54758d;

    /* renamed from: e */
    public long f54759e;

    /* renamed from: f */
    @Nullable
    public ByteBuffer f54760f;

    /* renamed from: g */
    private final int f54761g;

    /* renamed from: h */
    private final int f54762h;

    /* renamed from: com.yandex.mobile.ads.impl.sm$a */
    public static final class a extends IllegalStateException {
        public a(int i2, int i3) {
            super(C0000a.m10g("Buffer too small (", i2, " < ", i3, ")"));
        }
    }

    static {
        C5411ls.m26526a("goog.exo.decoder");
    }

    public C5752sm(int i2) {
        this(i2, 0);
    }

    /* renamed from: j */
    public static C5752sm m28322j() {
        return new C5752sm(0, 0);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC5438mf
    /* renamed from: b */
    public void mo22727b() {
        super.mo22727b();
        ByteBuffer byteBuffer = this.f54757c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f54760f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f54758d = false;
    }

    @EnsuresNonNull({"data"})
    /* renamed from: e */
    public final void m28323e(int i2) {
        ByteBuffer allocateDirect;
        ByteBuffer allocateDirect2;
        int i3 = i2 + this.f54762h;
        ByteBuffer byteBuffer = this.f54757c;
        if (byteBuffer == null) {
            int i4 = this.f54761g;
            if (i4 == 1) {
                allocateDirect2 = ByteBuffer.allocate(i3);
            } else {
                if (i4 != 2) {
                    throw new a(byteBuffer != null ? byteBuffer.capacity() : 0, i3);
                }
                allocateDirect2 = ByteBuffer.allocateDirect(i3);
            }
            this.f54757c = allocateDirect2;
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i5 = i3 + position;
        if (capacity >= i5) {
            this.f54757c = byteBuffer;
            return;
        }
        int i6 = this.f54761g;
        if (i6 == 1) {
            allocateDirect = ByteBuffer.allocate(i5);
        } else {
            if (i6 != 2) {
                ByteBuffer byteBuffer2 = this.f54757c;
                throw new a(byteBuffer2 != null ? byteBuffer2.capacity() : 0, i5);
            }
            allocateDirect = ByteBuffer.allocateDirect(i5);
        }
        allocateDirect.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            allocateDirect.put(byteBuffer);
        }
        this.f54757c = allocateDirect;
    }

    /* renamed from: h */
    public final void m28324h() {
        ByteBuffer byteBuffer = this.f54757c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f54760f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    /* renamed from: i */
    public final boolean m28325i() {
        return m26634c(1073741824);
    }

    public C5752sm(int i2, int i3) {
        this.f54756b = new C5695rl();
        this.f54761g = i2;
        this.f54762h = 0;
    }
}

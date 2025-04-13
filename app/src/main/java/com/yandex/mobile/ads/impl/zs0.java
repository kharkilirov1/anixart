package com.yandex.mobile.ads.impl;

import android.opengl.GLES20;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.xs0;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes3.dex */
final class zs0 {

    /* renamed from: i */
    private static final float[] f57304i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j */
    private static final float[] f57305j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    private static final float[] f57306k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: a */
    private int f57307a;

    /* renamed from: b */
    @Nullable
    private C6139a f57308b;

    /* renamed from: c */
    private C5608px f57309c;

    /* renamed from: d */
    private int f57310d;

    /* renamed from: e */
    private int f57311e;

    /* renamed from: f */
    private int f57312f;

    /* renamed from: g */
    private int f57313g;

    /* renamed from: h */
    private int f57314h;

    /* renamed from: com.yandex.mobile.ads.impl.zs0$a */
    public static class C6139a {

        /* renamed from: a */
        private final int f57315a;

        /* renamed from: b */
        private final FloatBuffer f57316b;

        /* renamed from: c */
        private final FloatBuffer f57317c;

        /* renamed from: d */
        private final int f57318d;

        public C6139a(xs0.C6040b c6040b) {
            this.f57315a = c6040b.m29809a();
            this.f57316b = C5660qx.m27791a(c6040b.f56563c);
            this.f57317c = C5660qx.m27791a(c6040b.f56564d);
            int i2 = c6040b.f56562b;
            if (i2 == 1) {
                this.f57318d = 5;
            } else if (i2 != 2) {
                this.f57318d = 4;
            } else {
                this.f57318d = 6;
            }
        }
    }

    /* renamed from: a */
    public final void m30295a(xs0 xs0Var) {
        xs0.C6039a c6039a = xs0Var.f56556a;
        xs0.C6039a c6039a2 = xs0Var.f56557b;
        if (c6039a.m29808b() == 1 && c6039a.m29807a().f56561a == 0 && c6039a2.m29808b() == 1 && c6039a2.m29807a().f56561a == 0) {
            this.f57307a = xs0Var.f56558c;
            this.f57308b = new C6139a(xs0Var.f56556a.m29807a());
            if (xs0Var.f56559d) {
                return;
            }
            new C6139a(xs0Var.f56557b.m29807a());
        }
    }

    /* renamed from: a */
    public final void m30293a() {
        C5608px c5608px = new C5608px();
        this.f57309c = c5608px;
        this.f57310d = c5608px.m27576b("uMvpMatrix");
        this.f57311e = this.f57309c.m27576b("uTexMatrix");
        this.f57312f = this.f57309c.m27575a("aPosition");
        this.f57313g = this.f57309c.m27575a("aTexCoords");
        this.f57314h = this.f57309c.m27576b("uTexture");
    }

    /* renamed from: a */
    public final void m30294a(int i2, float[] fArr) {
        float[] fArr2;
        C6139a c6139a = this.f57308b;
        if (c6139a == null) {
            return;
        }
        int i3 = this.f57307a;
        if (i3 == 1) {
            fArr2 = f57305j;
        } else if (i3 == 2) {
            fArr2 = f57306k;
        } else {
            fArr2 = f57304i;
        }
        GLES20.glUniformMatrix3fv(this.f57311e, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f57310d, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.f57314h, 0);
        C5660qx.m27792a();
        GLES20.glVertexAttribPointer(this.f57312f, 3, 5126, false, 12, (Buffer) c6139a.f57316b);
        C5660qx.m27792a();
        GLES20.glVertexAttribPointer(this.f57313g, 2, 5126, false, 8, (Buffer) c6139a.f57317c);
        C5660qx.m27792a();
        GLES20.glDrawArrays(c6139a.f57318d, 0, c6139a.f57315a);
        C5660qx.m27792a();
    }
}

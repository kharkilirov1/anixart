package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.nativeads.MediaView;
import java.util.List;

/* loaded from: classes3.dex */
public final class na0 implements InterfaceC5330ka<jc0>, InterfaceC5504no<jc0> {

    /* renamed from: a */
    @Nullable
    private final h20 f52889a;

    /* renamed from: b */
    @Nullable
    private final nc0 f52890b;

    public na0(@Nullable h20 h20Var, @Nullable nc0 nc0Var) {
        this.f52889a = h20Var;
        this.f52890b = nc0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final boolean mo23911a(@NonNull jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        h20 h20Var = this.f52889a;
        List<z10> m25863a = jc0Var2.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        View m26826a = m26826a((dg1) h20Var);
        boolean z = (m26826a == null || z10Var == null || !h20Var.mo22388a((ImageView) m26826a, z10Var)) ? false : true;
        nc0 nc0Var = this.f52890b;
        View m26826a2 = m26826a((dg1) nc0Var);
        return z || (m26826a2 != null && nc0Var.mo22388a((nc0) m26826a2, (View) jc0Var2));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5504no
    /* renamed from: b */
    public final void mo26788b(@NonNull jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        List<z10> m25863a = jc0Var2.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        ImageView imageView = (ImageView) m26826a((dg1) this.f52889a);
        if (imageView != null && z10Var != null) {
            this.f52889a.mo22389b(imageView, z10Var);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) m26826a((dg1) this.f52890b);
        if (mediaView != null) {
            this.f52890b.mo22543a(jc0Var2);
            mediaView.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: c */
    public final void mo23914c(@NonNull jc0 jc0Var) {
        jc0 jc0Var2 = jc0Var;
        List<z10> m25863a = jc0Var2.m25863a();
        z10 z10Var = (m25863a == null || m25863a.isEmpty()) ? null : m25863a.get(0);
        ImageView imageView = (ImageView) m26826a((dg1) this.f52889a);
        if (imageView != null && z10Var != null) {
            this.f52889a.mo22389b(imageView, z10Var);
            imageView.setVisibility(0);
        }
        MediaView mediaView = (MediaView) m26826a((dg1) this.f52890b);
        if (mediaView != null) {
            this.f52890b.mo22389b(mediaView, jc0Var2);
            mediaView.setVisibility(0);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: d */
    public final boolean mo23915d() {
        nc0 nc0Var = this.f52890b;
        boolean z = nc0Var != null && tg1.m28655a(nc0Var.m23881b(), 100);
        h20 h20Var = this.f52889a;
        return z || (h20Var != null && tg1.m28655a(h20Var.m23881b(), 100));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    public final void destroy() {
        nc0 nc0Var = this.f52890b;
        if (nc0Var != null) {
            nc0Var.mo23312a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058 A[ADDED_TO_REGION] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo23916e() {
        /*
            r5 = this;
            com.yandex.mobile.ads.impl.nc0 r0 = r5.f52890b
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            android.view.View r0 = r0.m23881b()
            if (r0 == 0) goto L26
            boolean r3 = com.yandex.mobile.ads.impl.tg1.m28660d(r0)
            if (r3 != 0) goto L26
            int r3 = r0.getHeight()
            int r0 = r0.getWidth()
            if (r0 < r2) goto L21
            if (r3 >= r2) goto L1f
            goto L21
        L1f:
            r0 = 0
            goto L22
        L21:
            r0 = 1
        L22:
            if (r0 != 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            com.yandex.mobile.ads.impl.h20 r3 = r5.f52889a
            if (r3 == 0) goto L55
            android.view.View r3 = r3.m23881b()
            if (r3 == 0) goto L50
            boolean r4 = com.yandex.mobile.ads.impl.tg1.m28660d(r3)
            if (r4 != 0) goto L50
            int r4 = r3.getHeight()
            int r3 = r3.getWidth()
            if (r3 < r2) goto L4b
            if (r4 >= r2) goto L49
            goto L4b
        L49:
            r3 = 0
            goto L4c
        L4b:
            r3 = 1
        L4c:
            if (r3 != 0) goto L50
            r3 = 1
            goto L51
        L50:
            r3 = 0
        L51:
            if (r3 == 0) goto L55
            r3 = 1
            goto L56
        L55:
            r3 = 0
        L56:
            if (r0 != 0) goto L5a
            if (r3 == 0) goto L5b
        L5a:
            r1 = 1
        L5b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.na0.mo23916e():boolean");
    }

    @Nullable
    /* renamed from: f */
    public final int m26827f() {
        nc0 nc0Var = this.f52890b;
        return nc0Var != null ? nc0Var.mo22545c() : this.f52889a != null ? 4 : 0;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final void mo23909a() {
        ImageView imageView = (ImageView) m26826a((dg1) this.f52889a);
        if (imageView != null) {
            this.f52889a.a2(imageView);
        }
        MediaView mediaView = (MediaView) m26826a((dg1) this.f52890b);
        if (mediaView != null) {
            this.f52890b.mo22387a((nc0) mediaView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0028 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean mo23912b() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.nc0 r0 = r4.f52890b
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.m23881b()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            com.yandex.mobile.ads.impl.h20 r3 = r4.f52889a
            if (r3 == 0) goto L25
            android.view.View r3 = r3.m23881b()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = 0
        L21:
            if (r3 == 0) goto L25
            r3 = 1
            goto L26
        L25:
            r3 = 0
        L26:
            if (r0 != 0) goto L2c
            if (r3 == 0) goto L2b
            goto L2c
        L2b:
            r1 = 0
        L2c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.na0.mo23912b():boolean");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    @Nullable
    /* renamed from: c */
    public final jg1 mo23913c() {
        MediaView mediaView = (MediaView) m26826a((dg1) this.f52890b);
        ImageView imageView = (ImageView) m26826a((dg1) this.f52889a);
        if (mediaView != null) {
            return new jg1(mediaView);
        }
        if (imageView != null) {
            return new jg1(imageView);
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5330ka
    /* renamed from: a */
    public final void mo23910a(@NonNull C5276ja<jc0> c5276ja, @NonNull gg1 gg1Var) {
        jc0 m25826d = c5276ja.m25826d();
        h20 h20Var = this.f52889a;
        if (h20Var != null) {
            List<z10> m25863a = m25826d.m25863a();
            z10 z10Var = null;
            if (m25863a != null && !m25863a.isEmpty()) {
                z10Var = m25863a.get(0);
            }
            h20Var.mo22499a(c5276ja, gg1Var, z10Var);
        }
        nc0 nc0Var = this.f52890b;
        if (nc0Var != null) {
            nc0Var.mo22499a(c5276ja, gg1Var, m25826d);
        }
    }

    @Nullable
    /* renamed from: a */
    private static View m26826a(@Nullable dg1 dg1Var) {
        if (dg1Var != null) {
            return dg1Var.m23881b();
        }
        return null;
    }
}

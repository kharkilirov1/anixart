package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.F7 */
/* loaded from: classes2.dex */
public class C3289F7 implements InterfaceC3920ea<C4203p7, C3447Lf> {

    /* renamed from: a */
    @NonNull
    private final C3264E7 f42869a;

    /* renamed from: b */
    @NonNull
    private final C4255r7 f42870b;

    /* renamed from: c */
    @NonNull
    private final C4307t7 f42871c;

    /* renamed from: d */
    @NonNull
    private final C3189B7 f42872d;

    /* renamed from: e */
    @NonNull
    private final C4437y7 f42873e;

    /* renamed from: f */
    @NonNull
    private final C4463z7 f42874f;

    public C3289F7() {
        this(new C3264E7(), new C4255r7(new C3239D7()), new C4307t7(), new C3189B7(), new C4437y7(), new C4463z7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4203p7 mo17817a(@NonNull C3447Lf c3447Lf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3289F7(@NonNull C3264E7 c3264e7, @NonNull C4255r7 c4255r7, @NonNull C4307t7 c4307t7, @NonNull C3189B7 c3189b7, @NonNull C4437y7 c4437y7, @NonNull C4463z7 c4463z7) {
        this.f42870b = c4255r7;
        this.f42869a = c3264e7;
        this.f42871c = c4307t7;
        this.f42872d = c3189b7;
        this.f42873e = c4437y7;
        this.f42874f = c4463z7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3447Lf mo17818b(@NonNull C4203p7 c4203p7) {
        C3447Lf c3447Lf = new C3447Lf();
        C4151n7 c4151n7 = c4203p7.f46120a;
        if (c4151n7 != null) {
            c3447Lf.f43338b = this.f42869a.mo17818b(c4151n7);
        }
        C3917e7 c3917e7 = c4203p7.f46121b;
        if (c3917e7 != null) {
            c3447Lf.f43339c = this.f42870b.mo17818b(c3917e7);
        }
        List<C4099l7> list = c4203p7.f46122c;
        if (list != null) {
            c3447Lf.f43342f = this.f42872d.mo17818b(list);
        }
        String str = c4203p7.f46126g;
        if (str != null) {
            c3447Lf.f43340d = str;
        }
        c3447Lf.f43341e = this.f42871c.m19491a(c4203p7.f46127h);
        if (!TextUtils.isEmpty(c4203p7.f46123d)) {
            c3447Lf.f43345i = this.f42873e.mo17818b(c4203p7.f46123d);
        }
        if (!TextUtils.isEmpty(c4203p7.f46124e)) {
            c3447Lf.f43346j = c4203p7.f46124e.getBytes();
        }
        if (!C3658U2.m19218b(c4203p7.f46125f)) {
            c3447Lf.f43347k = this.f42874f.m21292a(c4203p7.f46125f);
        }
        return c3447Lf;
    }
}

package com.yandex.metrica.impl.p023ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.A7 */
/* loaded from: classes2.dex */
public class C3164A7 implements InterfaceC3920ea<C4047j7, C3472Mf> {

    /* renamed from: a */
    @NonNull
    private final C3264E7 f42528a;

    /* renamed from: b */
    @NonNull
    private final C4255r7 f42529b;

    /* renamed from: c */
    @NonNull
    private final C4307t7 f42530c;

    /* renamed from: d */
    @NonNull
    private final C3189B7 f42531d;

    /* renamed from: e */
    @NonNull
    private final C4437y7 f42532e;

    /* renamed from: f */
    @NonNull
    private final C4463z7 f42533f;

    public C3164A7() {
        this(new C3264E7(), new C4255r7(new C3239D7()), new C4307t7(), new C3189B7(), new C4437y7(), new C4463z7());
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a */
    public C4047j7 mo17817a(@NonNull C3472Mf c3472Mf) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C3164A7(@NonNull C3264E7 c3264e7, @NonNull C4255r7 c4255r7, @NonNull C4307t7 c4307t7, @NonNull C3189B7 c3189b7, @NonNull C4437y7 c4437y7, @NonNull C4463z7 c4463z7) {
        this.f42528a = c3264e7;
        this.f42529b = c4255r7;
        this.f42530c = c4307t7;
        this.f42531d = c3189b7;
        this.f42532e = c4437y7;
        this.f42533f = c4463z7;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3920ea
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C3472Mf mo17818b(@NonNull C4047j7 c4047j7) {
        C3472Mf c3472Mf = new C3472Mf();
        String str = c4047j7.f45398a;
        String str2 = c3472Mf.f43437g;
        if (str == null) {
            str = str2;
        }
        c3472Mf.f43437g = str;
        C4203p7 c4203p7 = c4047j7.f45399b;
        if (c4203p7 != null) {
            C4151n7 c4151n7 = c4203p7.f46120a;
            if (c4151n7 != null) {
                c3472Mf.f43432b = this.f42528a.mo17818b(c4151n7);
            }
            C3917e7 c3917e7 = c4203p7.f46121b;
            if (c3917e7 != null) {
                c3472Mf.f43433c = this.f42529b.mo17818b(c3917e7);
            }
            List<C4099l7> list = c4203p7.f46122c;
            if (list != null) {
                c3472Mf.f43436f = this.f42531d.mo17818b(list);
            }
            String str3 = c4203p7.f46126g;
            String str4 = c3472Mf.f43434d;
            if (str3 == null) {
                str3 = str4;
            }
            c3472Mf.f43434d = str3;
            c3472Mf.f43435e = this.f42530c.m19491a(c4203p7.f46127h);
            if (!TextUtils.isEmpty(c4203p7.f46123d)) {
                c3472Mf.f43440j = this.f42532e.mo17818b(c4203p7.f46123d);
            }
            if (!TextUtils.isEmpty(c4203p7.f46124e)) {
                c3472Mf.f43441k = c4203p7.f46124e.getBytes();
            }
            if (!C3658U2.m19218b(c4203p7.f46125f)) {
                c3472Mf.f43442l = this.f42533f.m21292a(c4203p7.f46125f);
            }
        }
        return c3472Mf;
    }
}

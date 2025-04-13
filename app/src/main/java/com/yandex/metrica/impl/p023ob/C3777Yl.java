package com.yandex.metrica.impl.p023ob;

import android.R;
import android.app.Activity;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.Yl */
/* loaded from: classes2.dex */
public class C3777Yl {

    /* renamed from: a */
    @NonNull
    private final b f44596a;

    /* renamed from: b */
    @NonNull
    private final a f44597b;

    /* renamed from: com.yandex.metrica.impl.ob.Yl$a */
    public static class a {
    }

    /* renamed from: com.yandex.metrica.impl.ob.Yl$b */
    public static class b {
    }

    public C3777Yl() {
        this(new b(), new a());
    }

    @NonNull
    /* renamed from: a */
    public C3328Gl m19486a(@NonNull Activity activity, @NonNull InterfaceC4035il interfaceC4035il, @NonNull C3854bm c3854bm, @NonNull C3853bl c3853bl, @NonNull C3906dm c3906dm, @NonNull C3752Xl c3752Xl) {
        ViewGroup viewGroup;
        C3328Gl c3328Gl = new C3328Gl();
        try {
            viewGroup = (ViewGroup) activity.findViewById(R.id.content);
        } catch (Throwable th) {
            c3906dm.m19773a("ui_parsing_root", th);
            viewGroup = null;
        }
        if (viewGroup != null) {
            Objects.requireNonNull(this.f44596a);
            C4321tl c4321tl = new C4321tl(c3854bm, new C4088km(c3906dm), new C3651Tk(c3854bm.f44843c), c3853bl, Collections.singletonList(new C4191ol()), Arrays.asList(new C3253Dl(c3854bm.f44842b)), c3906dm, c3752Xl, new C4140mm());
            c3328Gl.m18178a(c4321tl, viewGroup, interfaceC4035il);
            if (c3854bm.f44845e) {
                Objects.requireNonNull(this.f44597b);
                C3626Sk c3626Sk = new C3626Sk(c4321tl.m20845a());
                Iterator<C3278El> it = c4321tl.m20847b().iterator();
                while (it.hasNext()) {
                    c3626Sk.m19106a(it.next());
                }
            }
        }
        return c3328Gl;
    }

    @VisibleForTesting
    public C3777Yl(@NonNull b bVar, @NonNull a aVar) {
        this.f44596a = bVar;
        this.f44597b = aVar;
    }
}

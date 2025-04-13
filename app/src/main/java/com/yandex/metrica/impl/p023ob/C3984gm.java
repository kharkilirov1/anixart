package com.yandex.metrica.impl.p023ob;

import android.app.Activity;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C3879cl;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.gm */
/* loaded from: classes2.dex */
class C3984gm {

    /* renamed from: a */
    @Nullable
    private Runnable f45224a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f45225b;

    /* renamed from: c */
    @NonNull
    private final C3477Mk f45226c;

    /* renamed from: d */
    @NonNull
    private final C3353Hl f45227d;

    /* renamed from: e */
    @NonNull
    private final C3827al f45228e;

    /* renamed from: f */
    @NonNull
    private final a f45229f;

    /* renamed from: g */
    @NonNull
    private final List<InterfaceC3880cm> f45230g;

    /* renamed from: h */
    @NonNull
    private final List<C4425xl> f45231h;

    /* renamed from: i */
    @NonNull
    private final C3879cl.a f45232i;

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.gm$a */
    public static class a {
    }

    public C3984gm(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3477Mk c3477Mk, @NonNull C3827al c3827al) {
        this(interfaceExecutorC4297sn, c3477Mk, c3827al, new C3353Hl(), new a(), Collections.emptyList(), new C3879cl.a());
    }

    /* renamed from: a */
    public static void m19978a(C3984gm c3984gm, List list, Throwable th, C3854bm c3854bm) {
        Objects.requireNonNull(c3984gm);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3828am) it.next()).mo18238a(th, c3854bm);
        }
        Iterator<InterfaceC3880cm> it2 = c3984gm.f45230g.iterator();
        while (it2.hasNext()) {
            it2.next().mo18238a(th, c3854bm);
        }
    }

    @VisibleForTesting
    public C3984gm(@NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3477Mk c3477Mk, @NonNull C3827al c3827al, @NonNull C3353Hl c3353Hl, @NonNull a aVar, @NonNull List<C4425xl> list, @NonNull C3879cl.a aVar2) {
        this.f45230g = new ArrayList();
        this.f45225b = interfaceExecutorC4297sn;
        this.f45226c = c3477Mk;
        this.f45228e = c3827al;
        this.f45227d = c3353Hl;
        this.f45229f = aVar;
        this.f45231h = list;
        this.f45232i = aVar2;
    }

    /* renamed from: a */
    public static void m19977a(C3984gm c3984gm, List list, C3328Gl c3328Gl, List list2, Activity activity, C3378Il c3378Il, C3879cl c3879cl, long j2) {
        Objects.requireNonNull(c3984gm);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC3828am) it.next()).mo18237a(j2, activity, c3328Gl, list2, c3378Il, c3879cl);
        }
        Iterator<InterfaceC3880cm> it2 = c3984gm.f45230g.iterator();
        while (it2.hasNext()) {
            it2.next().mo18237a(j2, activity, c3328Gl, list2, c3378Il, c3879cl);
        }
    }

    /* renamed from: a */
    public void m19983a(@NonNull InterfaceC3880cm... interfaceC3880cmArr) {
        this.f45230g.addAll(Arrays.asList(interfaceC3880cmArr));
    }

    /* renamed from: a */
    public static void m19976a(C3984gm c3984gm, Activity activity, long j2) {
        Iterator<InterfaceC3880cm> it = c3984gm.f45230g.iterator();
        while (it.hasNext()) {
            it.next().mo18640a(activity, j2);
        }
    }

    /* renamed from: a */
    public void m19982a(@NonNull Activity activity, long j2, @NonNull C3378Il c3378Il, @NonNull C3854bm c3854bm, @NonNull List<InterfaceC3828am> list) {
        boolean z;
        Iterator<C4425xl> it = this.f45231h.iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (it.next().m21162a(activity, c3854bm)) {
                z = true;
                break;
            }
        }
        WeakReference weakReference = new WeakReference(activity);
        C3879cl.a aVar = this.f45232i;
        C3827al c3827al = this.f45228e;
        Objects.requireNonNull(aVar);
        RunnableC3958fm runnableC3958fm = new RunnableC3958fm(this, weakReference, list, c3378Il, c3854bm, new C3879cl(c3827al, c3378Il), z);
        Runnable runnable = this.f45224a;
        if (runnable != null) {
            ((C4271rn) this.f45225b).m20672a(runnable);
        }
        this.f45224a = runnableC3958fm;
        Iterator<InterfaceC3880cm> it2 = this.f45230g.iterator();
        while (it2.hasNext()) {
            it2.next().mo18641a(activity, z);
        }
        ((C4271rn) this.f45225b).m20673a(runnableC3958fm, j2);
    }
}

package com.yandex.div.core.view2.errors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: ErrorCollector.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/view2/errors/ErrorCollector;", "", "div_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public class ErrorCollector {

    /* renamed from: a */
    @NotNull
    public final Set<Function2<List<? extends Throwable>, List<? extends Throwable>, Unit>> f32875a = new LinkedHashSet();

    /* renamed from: b */
    @NotNull
    public final List<Throwable> f32876b = new ArrayList();

    /* renamed from: c */
    @NotNull
    public List<Throwable> f32877c = new ArrayList();

    /* renamed from: d */
    @NotNull
    public List<Throwable> f32878d = new ArrayList();

    /* renamed from: e */
    @NotNull
    public List<Throwable> f32879e = new ArrayList();

    /* renamed from: a */
    public void m17112a(@NotNull Throwable th) {
        this.f32876b.add(th);
        m17114c();
    }

    /* renamed from: b */
    public void m17113b(@NotNull Throwable th) {
        this.f32879e.add(th);
        m17114c();
    }

    /* renamed from: c */
    public final void m17114c() {
        this.f32878d.clear();
        this.f32878d.addAll(this.f32877c);
        this.f32878d.addAll(this.f32876b);
        Iterator<T> it = this.f32875a.iterator();
        while (it.hasNext()) {
            ((Function2) it.next()).invoke(this.f32878d, this.f32879e);
        }
    }
}

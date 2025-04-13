package com.yandex.div.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: CompositeDisposable.kt */
@Metadata(m31882bv = {}, m31883d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m31884d2 = {"Lcom/yandex/div/core/CompositeDisposable;", "Lcom/yandex/div/core/Disposable;", "div-core_release"}, m31885k = 1, m31886mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class CompositeDisposable implements Disposable {

    /* renamed from: b */
    @NotNull
    public final List<Disposable> f30866b = new ArrayList();

    /* renamed from: c */
    public boolean f30867c;

    @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
    public void close() {
        Iterator<T> it = this.f30866b.iterator();
        while (it.hasNext()) {
            ((Disposable) it.next()).close();
        }
        this.f30866b.clear();
        this.f30867c = true;
    }
}

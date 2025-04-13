package io.reactivex.internal.util;

import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes3.dex */
public final class ConnectConsumer implements Consumer<Disposable> {

    /* renamed from: b */
    public Disposable f62786b;

    @Override // io.reactivex.functions.Consumer
    public void accept(Disposable disposable) throws Exception {
        this.f62786b = disposable;
    }
}

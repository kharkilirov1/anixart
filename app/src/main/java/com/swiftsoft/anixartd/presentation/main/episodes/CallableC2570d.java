package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.database.entity.episode.Episode;
import com.swiftsoft.anixartd.parser.Parser;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import io.reactivex.internal.operators.observable.ObservableJust;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.episodes.d */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2570d implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f26346b;

    /* renamed from: c */
    public final /* synthetic */ Episode f26347c;

    public /* synthetic */ CallableC2570d(Episode episode, int i2) {
        this.f26346b = i2;
        this.f26347c = episode;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f26346b) {
            case 0:
                Episode episode = this.f26347c;
                Intrinsics.m32179h(episode, "$episode");
                return new ObservableFromCallable(new CallableC2570d(episode, 1));
            case 1:
                Episode episode2 = this.f26347c;
                Intrinsics.m32179h(episode2, "$episode");
                return Parser.f25796e.m14183b(episode2.getUrl());
            default:
                Episode episode3 = this.f26347c;
                Intrinsics.m32179h(episode3, "$episode");
                return new ObservableJust(Parser.f25796e.m14183b(episode3.getUrl()));
        }
    }
}

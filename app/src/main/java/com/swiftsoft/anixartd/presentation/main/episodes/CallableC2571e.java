package com.swiftsoft.anixartd.presentation.main.episodes;

import com.swiftsoft.anixartd.parser.Parser;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.jsoup.helper.HttpConnection;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.episodes.e */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2571e implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f26348b;

    /* renamed from: c */
    public final /* synthetic */ String f26349c;

    public /* synthetic */ CallableC2571e(String str, int i2) {
        this.f26348b = i2;
        this.f26349c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i2 = 1;
        switch (this.f26348b) {
            case 0:
                String url = this.f26349c;
                Intrinsics.m32179h(url, "$url");
                return new ObservableFromCallable(new CallableC2571e(url, i2));
            case 1:
                String url2 = this.f26349c;
                Intrinsics.m32179h(url2, "$url");
                return Parser.f25796e.m14183b(url2);
            case 2:
                String magnetLink = this.f26349c;
                Intrinsics.m32179h(magnetLink, "$magnetLink");
                return new ObservableFromCallable(new CallableC2571e(magnetLink, 3));
            default:
                String magnetLink2 = this.f26349c;
                Intrinsics.m32179h(magnetLink2, "$magnetLink");
                String node = ((HttpConnection) HttpConnection.m34671a(magnetLink2)).m34675d().toString();
                Intrinsics.m32178g(node, "connect(magnetLink).get().toString()");
                MatchResult m33870a = new Regex("html\\(\"<a href='(.*)'>").m33870a(node, 0);
                return m33870a != null ? m33870a.mo33868b().get(1) : "";
        }
    }
}

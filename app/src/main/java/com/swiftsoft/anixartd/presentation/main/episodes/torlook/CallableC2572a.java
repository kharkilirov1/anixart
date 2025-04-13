package com.swiftsoft.anixartd.presentation.main.episodes.torlook;

import com.swiftsoft.anixartd.App;
import com.swiftsoft.anixartd.database.entity.Torlook;
import com.swiftsoft.anixartd.network.response.TorlookPageableResponse;
import com.swiftsoft.anixartd.p015ui.logic.main.episodes.torlook.TorlookUiLogic;
import com.swiftsoft.anixartd.parser.torlook.TorlookParser;
import io.reactivex.internal.operators.observable.ObservableFromCallable;
import java.net.URLEncoder;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.jsoup.Connection;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Collector;
import org.jsoup.select.Elements;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;

/* compiled from: R8$$SyntheticClass */
/* renamed from: com.swiftsoft.anixartd.presentation.main.episodes.torlook.a */
/* loaded from: classes2.dex */
public final /* synthetic */ class CallableC2572a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ int f26366b;

    /* renamed from: c */
    public final /* synthetic */ TorlookPresenter f26367c;

    public /* synthetic */ CallableC2572a(TorlookPresenter torlookPresenter, int i2) {
        this.f26366b = i2;
        this.f26367c = torlookPresenter;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        boolean z;
        int i2 = 1;
        switch (this.f26366b) {
            case 0:
                TorlookPresenter this$0 = this.f26367c;
                Intrinsics.m32179h(this$0, "this$0");
                return new ObservableFromCallable(new CallableC2572a(this$0, i2));
            default:
                TorlookPresenter this$02 = this.f26367c;
                Intrinsics.m32179h(this$02, "this$0");
                TorlookParser torlookParser = new TorlookParser();
                String m14619a = this$02.m14619a();
                TorlookUiLogic torlookUiLogic = this$02.f26352c;
                int i3 = torlookUiLogic.f29063d;
                boolean z2 = torlookUiLogic.f29064e;
                boolean z3 = torlookUiLogic.f29065f;
                String string = App.f25340b.m14044b().f25344a.getString("TORLOOK_URL", "");
                String str = string != null ? string : "";
                String encode = URLEncoder.encode(m14619a);
                if (i3 == 1) {
                    encode = encode + "/size";
                } else if (i3 == 2) {
                    encode = encode + "/date";
                }
                if (z2) {
                    encode = encode + "?forced=1";
                }
                Connection m34671a = HttpConnection.m34671a(str + encode);
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                Intrinsics.m32178g(sSLContext, "getInstance(\"TLS\")");
                sSLContext.init(null, new TrustManager[]{new X509TrustManager() { // from class: com.swiftsoft.anixartd.parser.torlook.TorlookParser$getSSLSocketFactory$1
                    @Override // javax.net.ssl.X509TrustManager
                    public void checkClientTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str2) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    public void checkServerTrusted(@Nullable X509Certificate[] x509CertificateArr, @Nullable String str2) {
                    }

                    @Override // javax.net.ssl.X509TrustManager
                    @NotNull
                    public X509Certificate[] getAcceptedIssuers() {
                        return new X509Certificate[0];
                    }
                }}, new SecureRandom());
                SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
                Intrinsics.m32178g(socketFactory, "sc.socketFactory");
                HttpConnection httpConnection = (HttpConnection) m34671a;
                httpConnection.f68902a.f68917n = socketFactory;
                httpConnection.m34674b("show_cinema", "0");
                httpConnection.m34674b("proxy_trackers", String.valueOf(z3 ? 1 : 0));
                Document m34675d = httpConnection.m34675d();
                Objects.requireNonNull(m34675d);
                Elements m34978a = Selector.m34978a("span.resultsDate", m34675d);
                Iterator<Element> it = m34978a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                    } else if (it.next().m34760P("tooOld")) {
                        z = true;
                    }
                }
                ArrayList arrayList = new ArrayList();
                Validate.m34692e("webResult item");
                Iterator<Element> it2 = Collector.m34958a(new Evaluator.Class("webResult item"), m34675d).iterator();
                while (it2.hasNext()) {
                    Element next = it2.next();
                    Objects.requireNonNull(next);
                    String sTitle = Selector.m34978a("p > a.dl", next).m34964b();
                    String sLink = Selector.m34978a("p > a.dl", next).m34963a("href");
                    String sTrackerIcon = Selector.m34978a("div.h2 > noindex > img.trackerIcon", next).m34963a("src");
                    String sTrackerDomain = Selector.m34978a("div.h2 > noindex > a", next).m34964b();
                    String sSize = Selector.m34978a("span.webResultTitle > span.size", next).m34964b();
                    String sDate = Selector.m34978a("span.webResultTitle > span.date", next).m34964b();
                    String sSeedCount = Selector.m34978a("span.webResultTitle > span.torstat > span.seeders", next).m34964b();
                    String sLeechCount = Selector.m34978a("span.webResultTitle > span.torstat > span.leechers", next).m34964b();
                    String sMagnetLink = Selector.m34978a("span.webResultTitle > span.magnet > a", next).m34963a("data-src");
                    Torlook torlook = new Torlook();
                    Iterator<Element> it3 = it2;
                    Intrinsics.m32178g(sTitle, "sTitle");
                    torlook.setTitle(sTitle);
                    Intrinsics.m32178g(sLink, "sLink");
                    torlook.setLink(sLink);
                    Intrinsics.m32178g(sSize, "sSize");
                    torlook.setSize(sSize);
                    Intrinsics.m32178g(sDate, "sDate");
                    torlook.setDate(torlookParser.m14186a(sDate));
                    Intrinsics.m32178g(sTrackerDomain, "sTrackerDomain");
                    torlook.setTrackerDomain(sTrackerDomain);
                    Intrinsics.m32178g(sTrackerIcon, "sTrackerIcon");
                    if (!StringsKt.m33879E(sTrackerIcon)) {
                        torlook.setTrackerIcon(str + sTrackerIcon);
                    }
                    Intrinsics.m32178g(sSeedCount, "sSeedCount");
                    torlook.setSeedCount(sSeedCount);
                    Intrinsics.m32178g(sLeechCount, "sLeechCount");
                    torlook.setLeechCount(sLeechCount);
                    Intrinsics.m32178g(sMagnetLink, "sMagnetLink");
                    if (!StringsKt.m33879E(sMagnetLink)) {
                        torlook.setMagnetLink(str + sMagnetLink);
                    }
                    arrayList.add(torlook);
                    it2 = it3;
                }
                TorlookPageableResponse torlookPageableResponse = new TorlookPageableResponse();
                torlookPageableResponse.setTotalCount(arrayList.size());
                torlookPageableResponse.setTotalPageCount(0);
                String m34964b = m34978a.m34964b();
                Intrinsics.m32178g(m34964b, "resultDate.text()");
                torlookPageableResponse.setResultDate(torlookParser.m14186a(StringsKt.m33891Q(StringsKt.m33891Q(m34964b, "(", "", false, 4, null), ")", "", false, 4, null)));
                torlookPageableResponse.setNeedForce(z);
                torlookPageableResponse.setContent(arrayList);
                return torlookPageableResponse;
        }
    }
}

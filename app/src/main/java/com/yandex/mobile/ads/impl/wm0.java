package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.yandex.mobile.ads.impl.C5245ir;
import com.yandex.mobile.ads.impl.td0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes3.dex */
final class wm0 {

    /* renamed from: a */
    @NonNull
    private final td0 f56159a;

    /* renamed from: b */
    @NonNull
    private final Object f56160b = new Object();

    /* renamed from: c */
    @NonNull
    private final Handler f56161c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    @NonNull
    private final Executor f56162d = o80.m27018a().m27019b();

    /* renamed from: com.yandex.mobile.ads.impl.wm0$a */
    public class C5979a implements td0.InterfaceC5796b {

        /* renamed from: a */
        public final /* synthetic */ List f56163a;

        /* renamed from: b */
        public final /* synthetic */ CountDownLatch f56164b;

        public C5979a(ArrayList arrayList, CountDownLatch countDownLatch) {
            this.f56163a = arrayList;
            this.f56164b = countDownLatch;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.wm0$b */
    public interface InterfaceC5980b {
    }

    public wm0(@NonNull ed0 ed0Var) {
        this.f56159a = new td0(ed0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @MainThread
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m29497a(@NonNull Context context, @NonNull List<qd0> list, @NonNull InterfaceC5980b interfaceC5980b) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        C5535oe c5535oe = new C5535oe();
        Iterator<qd0> it = list.iterator();
        while (it.hasNext()) {
            this.f56159a.m28633a(context, it.next(), c5535oe, new C5979a(arrayList, countDownLatch));
        }
        this.f56162d.execute(new mq1(this, countDownLatch, arrayList, c5535oe, interfaceC5980b, 0));
    }

    @WorkerThread
    /* renamed from: b */
    public final void m29502b(@NonNull Context context, @NonNull List<qd0> list, @NonNull InterfaceC5980b interfaceC5980b) {
        this.f56161c.post(new lq1(this, context, list, interfaceC5980b, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public void m29499a(CountDownLatch countDownLatch, List list, C5535oe c5535oe, InterfaceC5980b interfaceC5980b) {
        JSONArray jSONArray;
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                n60.m26810c("Some of mediation networks didn't provide bidder token after timeout", new Object[0]);
            }
            c5535oe.m27081b();
            synchronized (this.f56160b) {
                jSONArray = new JSONArray((Collection) list);
            }
            ((C5245ir.a) interfaceC5980b).m25604a(jSONArray);
        } catch (InterruptedException e2) {
            n60.m26808a(e2, "Networks bidding data collecting thread was interrupted", new Object[0]);
        }
    }
}

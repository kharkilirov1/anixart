package retrofit2.adapter.rxjava2;

import io.reactivex.Scheduler;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;

/* loaded from: classes3.dex */
final class RxJava2CallAdapter<R> implements CallAdapter<R, Object> {

    /* renamed from: a */
    public final Type f69605a;

    /* renamed from: b */
    @Nullable
    public final Scheduler f69606b;

    /* renamed from: c */
    public final boolean f69607c;

    /* renamed from: d */
    public final boolean f69608d;

    /* renamed from: e */
    public final boolean f69609e;

    /* renamed from: f */
    public final boolean f69610f;

    /* renamed from: g */
    public final boolean f69611g;

    /* renamed from: h */
    public final boolean f69612h;

    /* renamed from: i */
    public final boolean f69613i;

    public RxJava2CallAdapter(Type type, @Nullable Scheduler scheduler, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f69605a = type;
        this.f69606b = scheduler;
        this.f69607c = z;
        this.f69608d = z2;
        this.f69609e = z3;
        this.f69610f = z4;
        this.f69611g = z5;
        this.f69612h = z6;
        this.f69613i = z7;
    }

    @Override // retrofit2.CallAdapter
    /* renamed from: a */
    public Type mo35011a() {
        return this.f69605a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    @Override // retrofit2.CallAdapter
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo35012b(retrofit2.Call<R> r3) {
        /*
            r2 = this;
            boolean r0 = r2.f69607c
            if (r0 == 0) goto La
            retrofit2.adapter.rxjava2.CallEnqueueObservable r0 = new retrofit2.adapter.rxjava2.CallEnqueueObservable
            r0.<init>(r3)
            goto Lf
        La:
            retrofit2.adapter.rxjava2.CallExecuteObservable r0 = new retrofit2.adapter.rxjava2.CallExecuteObservable
            r0.<init>(r3)
        Lf:
            boolean r3 = r2.f69608d
            if (r3 == 0) goto L1a
            retrofit2.adapter.rxjava2.ResultObservable r3 = new retrofit2.adapter.rxjava2.ResultObservable
            r3.<init>(r0)
        L18:
            r0 = r3
            goto L24
        L1a:
            boolean r3 = r2.f69609e
            if (r3 == 0) goto L24
            retrofit2.adapter.rxjava2.BodyObservable r3 = new retrofit2.adapter.rxjava2.BodyObservable
            r3.<init>(r0)
            goto L18
        L24:
            io.reactivex.Scheduler r3 = r2.f69606b
            if (r3 == 0) goto L2c
            io.reactivex.Observable r0 = r0.m31372n(r3)
        L2c:
            boolean r3 = r2.f69610f
            if (r3 == 0) goto L3b
            io.reactivex.internal.operators.flowable.FlowableFromObservable r3 = new io.reactivex.internal.operators.flowable.FlowableFromObservable
            r3.<init>(r0)
            io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest r0 = new io.reactivex.internal.operators.flowable.FlowableOnBackpressureLatest
            r0.<init>(r3)
            return r0
        L3b:
            boolean r3 = r2.f69611g
            if (r3 == 0) goto L46
            io.reactivex.internal.operators.observable.ObservableSingleSingle r3 = new io.reactivex.internal.operators.observable.ObservableSingleSingle
            r1 = 0
            r3.<init>(r0, r1)
            return r3
        L46:
            boolean r3 = r2.f69612h
            if (r3 == 0) goto L50
            io.reactivex.internal.operators.observable.ObservableSingleMaybe r3 = new io.reactivex.internal.operators.observable.ObservableSingleMaybe
            r3.<init>(r0)
            return r3
        L50:
            boolean r3 = r2.f69613i
            if (r3 == 0) goto L5a
            io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable r3 = new io.reactivex.internal.operators.observable.ObservableIgnoreElementsCompletable
            r3.<init>(r0)
            return r3
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: retrofit2.adapter.rxjava2.RxJava2CallAdapter.mo35012b(retrofit2.Call):java.lang.Object");
    }
}

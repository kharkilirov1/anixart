package androidx.room;

import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0569d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5906b;

    /* renamed from: c */
    public final /* synthetic */ QueryInterceptorDatabase f5907c;

    public /* synthetic */ RunnableC0569d(QueryInterceptorDatabase queryInterceptorDatabase, int i2) {
        this.f5906b = i2;
        this.f5907c = queryInterceptorDatabase;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5906b) {
            case 0:
                this.f5907c.f5830c.m4076a("TRANSACTION SUCCESSFUL", Collections.emptyList());
                break;
            case 1:
                this.f5907c.f5830c.m4076a("BEGIN EXCLUSIVE TRANSACTION", Collections.emptyList());
                break;
            case 2:
                this.f5907c.f5830c.m4076a("BEGIN DEFERRED TRANSACTION", Collections.emptyList());
                break;
            default:
                this.f5907c.f5830c.m4076a("END TRANSACTION", Collections.emptyList());
                break;
        }
    }
}

package androidx.room;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0571f implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5912b;

    /* renamed from: c */
    public final /* synthetic */ QueryInterceptorDatabase f5913c;

    /* renamed from: d */
    public final /* synthetic */ String f5914d;

    public /* synthetic */ RunnableC0571f(QueryInterceptorDatabase queryInterceptorDatabase, String str, int i2) {
        this.f5912b = i2;
        this.f5913c = queryInterceptorDatabase;
        this.f5914d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5912b) {
            case 0:
                QueryInterceptorDatabase queryInterceptorDatabase = this.f5913c;
                queryInterceptorDatabase.f5830c.m4076a(this.f5914d, Collections.emptyList());
                break;
            default:
                QueryInterceptorDatabase queryInterceptorDatabase2 = this.f5913c;
                queryInterceptorDatabase2.f5830c.m4076a(this.f5914d, new ArrayList(0));
                break;
        }
    }
}

package androidx.room;

import androidx.sqlite.p004db.SupportSQLiteQuery;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0570e implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5908b;

    /* renamed from: c */
    public final /* synthetic */ QueryInterceptorDatabase f5909c;

    /* renamed from: d */
    public final /* synthetic */ SupportSQLiteQuery f5910d;

    /* renamed from: e */
    public final /* synthetic */ QueryInterceptorProgram f5911e;

    public /* synthetic */ RunnableC0570e(QueryInterceptorDatabase queryInterceptorDatabase, SupportSQLiteQuery supportSQLiteQuery, QueryInterceptorProgram queryInterceptorProgram, int i2) {
        this.f5908b = i2;
        this.f5909c = queryInterceptorDatabase;
        this.f5910d = supportSQLiteQuery;
        this.f5911e = queryInterceptorProgram;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5908b) {
            case 0:
                this.f5909c.f5830c.m4076a(this.f5910d.mo4084a(), this.f5911e.f5838b);
                break;
            default:
                this.f5909c.f5830c.m4076a(this.f5910d.mo4084a(), this.f5911e.f5838b);
                break;
        }
    }
}

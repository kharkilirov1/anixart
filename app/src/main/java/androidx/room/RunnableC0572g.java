package androidx.room;

import androidx.room.InvalidationTracker;
import java.util.Arrays;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.g */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0572g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f5915b;

    /* renamed from: c */
    public final /* synthetic */ Object f5916c;

    public /* synthetic */ RunnableC0572g(Object obj, int i2) {
        this.f5915b = i2;
        this.f5916c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5915b) {
            case 0:
                QueryInterceptorStatement queryInterceptorStatement = (QueryInterceptorStatement) this.f5916c;
                queryInterceptorStatement.f5840c.m4076a(queryInterceptorStatement.f5841d, queryInterceptorStatement.f5842e);
                return;
            case 1:
                QueryInterceptorStatement queryInterceptorStatement2 = (QueryInterceptorStatement) this.f5916c;
                queryInterceptorStatement2.f5840c.m4076a(queryInterceptorStatement2.f5841d, queryInterceptorStatement2.f5842e);
                return;
            default:
                InvalidationTracker invalidationTracker = (InvalidationTracker) this.f5916c;
                synchronized (invalidationTracker) {
                    invalidationTracker.f5785g = false;
                    InvalidationTracker.ObservedTableTracker observedTableTracker = invalidationTracker.f5787i;
                    synchronized (observedTableTracker) {
                        Arrays.fill(observedTableTracker.f5794b, false);
                        observedTableTracker.f5796d = true;
                    }
                }
                return;
        }
    }
}

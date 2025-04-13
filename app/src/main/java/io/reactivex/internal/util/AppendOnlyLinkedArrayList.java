package io.reactivex.internal.util;

import io.reactivex.functions.Predicate;

/* loaded from: classes3.dex */
public class AppendOnlyLinkedArrayList<T> {

    /* renamed from: a */
    public final int f62781a;

    /* renamed from: b */
    public final Object[] f62782b;

    /* renamed from: c */
    public Object[] f62783c;

    /* renamed from: d */
    public int f62784d;

    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        /* renamed from: b */
        boolean mo31407b(T t);
    }

    public AppendOnlyLinkedArrayList(int i2) {
        this.f62781a = i2;
        Object[] objArr = new Object[i2 + 1];
        this.f62782b = objArr;
        this.f62783c = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003b, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[LOOP:1: B:5:0x0008->B:13:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <U> boolean m31805a(org.reactivestreams.Subscriber<? super U> r8) {
        /*
            r7 = this;
            java.lang.Object[] r0 = r7.f62782b
            int r1 = r7.f62781a
        L4:
            r2 = 0
            if (r0 == 0) goto L40
            r3 = 0
        L8:
            if (r3 >= r1) goto L3b
            r4 = r0[r3]
            if (r4 != 0) goto Lf
            goto L3b
        Lf:
            io.reactivex.internal.util.NotificationLite r5 = io.reactivex.internal.util.NotificationLite.COMPLETE
            r6 = 1
            if (r4 != r5) goto L19
            r8.onComplete()
        L17:
            r4 = 1
            goto L35
        L19:
            boolean r5 = r4 instanceof io.reactivex.internal.util.NotificationLite.ErrorNotification
            if (r5 == 0) goto L25
            io.reactivex.internal.util.NotificationLite$ErrorNotification r4 = (io.reactivex.internal.util.NotificationLite.ErrorNotification) r4
            java.lang.Throwable r4 = r4.f62799b
            r8.onError(r4)
            goto L17
        L25:
            boolean r5 = r4 instanceof io.reactivex.internal.util.NotificationLite.SubscriptionNotification
            if (r5 == 0) goto L31
            io.reactivex.internal.util.NotificationLite$SubscriptionNotification r4 = (io.reactivex.internal.util.NotificationLite.SubscriptionNotification) r4
            org.reactivestreams.Subscription r4 = r4.f62800b
            r8.mo31352d(r4)
            goto L34
        L31:
            r8.onNext(r4)
        L34:
            r4 = 0
        L35:
            if (r4 == 0) goto L38
            return r6
        L38:
            int r3 = r3 + 1
            goto L8
        L3b:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L40:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.m31805a(org.reactivestreams.Subscriber):boolean");
    }

    /* renamed from: b */
    public void m31806b(T t) {
        int i2 = this.f62781a;
        int i3 = this.f62784d;
        if (i3 == i2) {
            Object[] objArr = new Object[i2 + 1];
            this.f62783c[i2] = objArr;
            this.f62783c = objArr;
            i3 = 0;
        }
        this.f62783c[i3] = t;
        this.f62784d = i3 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m31807c(io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<? super T> r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f62782b
            int r1 = r4.f62781a
        L4:
            if (r0 == 0) goto L1d
            r2 = 0
        L7:
            if (r2 >= r1) goto L18
            r3 = r0[r2]
            if (r3 != 0) goto Le
            goto L18
        Le:
            boolean r3 = r5.mo31407b(r3)
            if (r3 == 0) goto L15
            return
        L15:
            int r2 = r2 + 1
            goto L7
        L18:
            r0 = r0[r1]
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            goto L4
        L1d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.util.AppendOnlyLinkedArrayList.m31807c(io.reactivex.internal.util.AppendOnlyLinkedArrayList$NonThrowingPredicate):void");
    }
}

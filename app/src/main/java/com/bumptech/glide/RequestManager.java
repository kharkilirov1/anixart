package com.bumptech.glide;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.annotation.CheckResult;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.manager.ConnectivityMonitor;
import com.bumptech.glide.manager.ConnectivityMonitorFactory;
import com.bumptech.glide.manager.Lifecycle;
import com.bumptech.glide.manager.LifecycleListener;
import com.bumptech.glide.manager.RequestManagerTreeNode;
import com.bumptech.glide.manager.RequestTracker;
import com.bumptech.glide.manager.TargetTracker;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.target.ViewTarget;
import com.bumptech.glide.request.transition.Transition;
import com.bumptech.glide.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class RequestManager implements LifecycleListener, ModelTypes<RequestBuilder<Drawable>> {

    /* renamed from: m */
    public static final RequestOptions f7944m = new RequestOptions().mo5256e(Bitmap.class).mo5259i();

    /* renamed from: b */
    public final Glide f7945b;

    /* renamed from: c */
    public final Context f7946c;

    /* renamed from: d */
    public final Lifecycle f7947d;

    /* renamed from: e */
    @GuardedBy
    public final RequestTracker f7948e;

    /* renamed from: f */
    @GuardedBy
    public final RequestManagerTreeNode f7949f;

    /* renamed from: g */
    @GuardedBy
    public final TargetTracker f7950g;

    /* renamed from: h */
    public final Runnable f7951h;

    /* renamed from: i */
    public final Handler f7952i;

    /* renamed from: j */
    public final ConnectivityMonitor f7953j;

    /* renamed from: k */
    public final CopyOnWriteArrayList<RequestListener<Object>> f7954k;

    /* renamed from: l */
    @GuardedBy
    public RequestOptions f7955l;

    public static class ClearTarget extends ViewTarget<View, Object> {
        @Override // com.bumptech.glide.request.target.Target
        /* renamed from: c */
        public void mo4877c(@NonNull Object obj, @Nullable Transition<? super Object> transition) {
        }
    }

    public class RequestManagerConnectivityListener implements ConnectivityMonitor.ConnectivityListener {

        /* renamed from: a */
        @GuardedBy
        public final RequestTracker f7957a;

        public RequestManagerConnectivityListener(@NonNull RequestTracker requestTracker) {
            this.f7957a = requestTracker;
        }

        @Override // com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener
        /* renamed from: a */
        public void mo4905a(boolean z) {
            if (z) {
                synchronized (RequestManager.this) {
                    RequestTracker requestTracker = this.f7957a;
                    Iterator it = ((ArrayList) Util.m5348e(requestTracker.f8677a)).iterator();
                    while (it.hasNext()) {
                        Request request = (Request) it.next();
                        if (!request.mo5287k() && !request.mo5283g()) {
                            request.clear();
                            if (requestTracker.f8679c) {
                                requestTracker.f8678b.add(request);
                            } else {
                                request.mo5285i();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new RequestOptions().mo5256e(GifDrawable.class).mo5259i();
        new RequestOptions().mo5257f(DiskCacheStrategy.f8204b).mo5267q(Priority.LOW).mo5271u(true);
    }

    public RequestManager(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
        RequestTracker requestTracker = new RequestTracker();
        ConnectivityMonitorFactory connectivityMonitorFactory = glide.f7887h;
        this.f7950g = new TargetTracker();
        Runnable runnable = new Runnable() { // from class: com.bumptech.glide.RequestManager.1
            @Override // java.lang.Runnable
            public void run() {
                RequestManager requestManager = RequestManager.this;
                requestManager.f7947d.mo5217a(requestManager);
            }
        };
        this.f7951h = runnable;
        Handler handler = new Handler(Looper.getMainLooper());
        this.f7952i = handler;
        this.f7945b = glide;
        this.f7947d = lifecycle;
        this.f7949f = requestManagerTreeNode;
        this.f7948e = requestTracker;
        this.f7946c = context;
        ConnectivityMonitor mo5222a = connectivityMonitorFactory.mo5222a(context.getApplicationContext(), new RequestManagerConnectivityListener(requestTracker));
        this.f7953j = mo5222a;
        if (Util.m5350g()) {
            handler.post(runnable);
        } else {
            lifecycle.mo5217a(this);
        }
        lifecycle.mo5217a(mo5222a);
        this.f7954k = new CopyOnWriteArrayList<>(glide.f7883d.f7908e);
        mo4902q(glide.f7883d.f7907d);
        synchronized (glide.f7888i) {
            if (glide.f7888i.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            glide.f7888i.add(this);
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: b */
    public synchronized void mo4894b() {
        m4901p();
        this.f7950g.mo4894b();
    }

    @NonNull
    @CheckResult
    /* renamed from: e */
    public <ResourceType> RequestBuilder<ResourceType> mo4895e(@NonNull Class<ResourceType> cls) {
        return new RequestBuilder<>(this.f7945b, this, cls, this.f7946c);
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    /* renamed from: g */
    public synchronized void mo4896g() {
        m4900o();
        this.f7950g.mo4896g();
    }

    @NonNull
    @CheckResult
    /* renamed from: h */
    public RequestBuilder<Bitmap> mo4897h() {
        return mo4895e(Bitmap.class).mo4892a(f7944m);
    }

    @NonNull
    @CheckResult
    /* renamed from: m */
    public RequestBuilder<Drawable> mo4898m() {
        return mo4895e(Drawable.class);
    }

    /* renamed from: n */
    public synchronized void m4899n(@Nullable Target<?> target) {
        if (target == null) {
            return;
        }
        m4904s(target);
    }

    /* renamed from: o */
    public synchronized void m4900o() {
        RequestTracker requestTracker = this.f7948e;
        requestTracker.f8679c = true;
        Iterator it = ((ArrayList) Util.m5348e(requestTracker.f8677a)).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (request.isRunning()) {
                request.clear();
                requestTracker.f8678b.add(request);
            }
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public synchronized void onDestroy() {
        this.f7950g.onDestroy();
        Iterator it = Util.m5348e(this.f7950g.f8687b).iterator();
        while (it.hasNext()) {
            m4899n((Target) it.next());
        }
        this.f7950g.f8687b.clear();
        RequestTracker requestTracker = this.f7948e;
        Iterator it2 = ((ArrayList) Util.m5348e(requestTracker.f8677a)).iterator();
        while (it2.hasNext()) {
            requestTracker.m5236a((Request) it2.next(), false);
        }
        requestTracker.f8678b.clear();
        this.f7947d.mo5218b(this);
        this.f7947d.mo5218b(this.f7953j);
        this.f7952i.removeCallbacks(this.f7951h);
        Glide glide = this.f7945b;
        synchronized (glide.f7888i) {
            if (!glide.f7888i.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            glide.f7888i.remove(this);
        }
    }

    /* renamed from: p */
    public synchronized void m4901p() {
        RequestTracker requestTracker = this.f7948e;
        requestTracker.f8679c = false;
        Iterator it = ((ArrayList) Util.m5348e(requestTracker.f8677a)).iterator();
        while (it.hasNext()) {
            Request request = (Request) it.next();
            if (!request.mo5287k() && !request.isRunning()) {
                request.mo5285i();
            }
        }
        requestTracker.f8678b.clear();
    }

    /* renamed from: q */
    public synchronized void mo4902q(@NonNull RequestOptions requestOptions) {
        this.f7955l = requestOptions.clone().mo5254b();
    }

    /* renamed from: r */
    public synchronized boolean m4903r(@NonNull Target<?> target) {
        Request mo5295j = target.mo5295j();
        if (mo5295j == null) {
            return true;
        }
        if (!this.f7948e.m5236a(mo5295j, true)) {
            return false;
        }
        this.f7950g.f8687b.remove(target);
        target.mo5290d(null);
        return true;
    }

    /* renamed from: s */
    public final void m4904s(@NonNull Target<?> target) {
        boolean z;
        if (m4903r(target)) {
            return;
        }
        Glide glide = this.f7945b;
        synchronized (glide.f7888i) {
            Iterator<RequestManager> it = glide.f7888i.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (it.next().m4903r(target)) {
                    z = true;
                    break;
                }
            }
        }
        if (z || target.mo5295j() == null) {
            return;
        }
        Request mo5295j = target.mo5295j();
        target.mo5290d(null);
        mo5295j.clear();
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f7948e + ", treeNode=" + this.f7949f + "}";
    }
}

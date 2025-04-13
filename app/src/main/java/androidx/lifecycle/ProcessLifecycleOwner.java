package androidx.lifecycle;

import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ReportFragment;

/* loaded from: classes.dex */
public class ProcessLifecycleOwner implements LifecycleOwner {

    /* renamed from: j */
    public static final ProcessLifecycleOwner f4640j = new ProcessLifecycleOwner();

    /* renamed from: f */
    public Handler f4645f;

    /* renamed from: b */
    public int f4641b = 0;

    /* renamed from: c */
    public int f4642c = 0;

    /* renamed from: d */
    public boolean f4643d = true;

    /* renamed from: e */
    public boolean f4644e = true;

    /* renamed from: g */
    public final LifecycleRegistry f4646g = new LifecycleRegistry(this);

    /* renamed from: h */
    public Runnable f4647h = new Runnable() { // from class: androidx.lifecycle.ProcessLifecycleOwner.1
        @Override // java.lang.Runnable
        public void run() {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.this;
            if (processLifecycleOwner.f4642c == 0) {
                processLifecycleOwner.f4643d = true;
                processLifecycleOwner.f4646g.m3199f(Lifecycle.Event.ON_PAUSE);
            }
            ProcessLifecycleOwner processLifecycleOwner2 = ProcessLifecycleOwner.this;
            if (processLifecycleOwner2.f4641b == 0 && processLifecycleOwner2.f4643d) {
                processLifecycleOwner2.f4646g.m3199f(Lifecycle.Event.ON_STOP);
                processLifecycleOwner2.f4644e = true;
            }
        }
    };

    /* renamed from: i */
    public ReportFragment.ActivityInitializationListener f4648i = new ReportFragment.ActivityInitializationListener() { // from class: androidx.lifecycle.ProcessLifecycleOwner.2
        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        /* renamed from: a */
        public void mo3226a() {
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        /* renamed from: b */
        public void mo3227b() {
            ProcessLifecycleOwner.this.m3225b();
        }

        @Override // androidx.lifecycle.ReportFragment.ActivityInitializationListener
        /* renamed from: c */
        public void mo3228c() {
            ProcessLifecycleOwner.this.m3224a();
        }
    };

    /* renamed from: a */
    public void m3224a() {
        int i2 = this.f4642c + 1;
        this.f4642c = i2;
        if (i2 == 1) {
            if (!this.f4643d) {
                this.f4645f.removeCallbacks(this.f4647h);
            } else {
                this.f4646g.m3199f(Lifecycle.Event.ON_RESUME);
                this.f4643d = false;
            }
        }
    }

    /* renamed from: b */
    public void m3225b() {
        int i2 = this.f4641b + 1;
        this.f4641b = i2;
        if (i2 == 1 && this.f4644e) {
            this.f4646g.m3199f(Lifecycle.Event.ON_START);
            this.f4644e = false;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.f4646g;
    }
}

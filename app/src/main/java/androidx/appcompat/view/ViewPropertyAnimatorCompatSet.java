package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import java.util.ArrayList;
import java.util.Iterator;

@RestrictTo
/* loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {

    /* renamed from: c */
    public Interpolator f741c;

    /* renamed from: d */
    public ViewPropertyAnimatorListener f742d;

    /* renamed from: e */
    public boolean f743e;

    /* renamed from: b */
    public long f740b = -1;

    /* renamed from: f */
    public final ViewPropertyAnimatorListenerAdapter f744f = new ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1

        /* renamed from: a */
        public boolean f745a = false;

        /* renamed from: b */
        public int f746b = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: b */
        public void mo436b(View view) {
            int i2 = this.f746b + 1;
            this.f746b = i2;
            if (i2 == ViewPropertyAnimatorCompatSet.this.f739a.size()) {
                ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f742d;
                if (viewPropertyAnimatorListener != null) {
                    viewPropertyAnimatorListener.mo436b(null);
                }
                this.f746b = 0;
                this.f745a = false;
                ViewPropertyAnimatorCompatSet.this.f743e = false;
            }
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        /* renamed from: c */
        public void mo437c(View view) {
            if (this.f745a) {
                return;
            }
            this.f745a = true;
            ViewPropertyAnimatorListener viewPropertyAnimatorListener = ViewPropertyAnimatorCompatSet.this.f742d;
            if (viewPropertyAnimatorListener != null) {
                viewPropertyAnimatorListener.mo437c(null);
            }
        }
    };

    /* renamed from: a */
    public final ArrayList<ViewPropertyAnimatorCompat> f739a = new ArrayList<>();

    /* renamed from: a */
    public void m539a() {
        if (this.f743e) {
            Iterator<ViewPropertyAnimatorCompat> it = this.f739a.iterator();
            while (it.hasNext()) {
                it.next().m2389b();
            }
            this.f743e = false;
        }
    }

    /* renamed from: b */
    public void m540b() {
        View view;
        if (this.f743e) {
            return;
        }
        Iterator<ViewPropertyAnimatorCompat> it = this.f739a.iterator();
        while (it.hasNext()) {
            ViewPropertyAnimatorCompat next = it.next();
            long j2 = this.f740b;
            if (j2 >= 0) {
                next.m2390c(j2);
            }
            Interpolator interpolator = this.f741c;
            if (interpolator != null && (view = next.f3672a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f742d != null) {
                next.m2391d(this.f744f);
            }
            View view2 = next.f3672a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f743e = true;
    }
}

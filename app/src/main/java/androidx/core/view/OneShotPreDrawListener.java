package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes.dex */
public final class OneShotPreDrawListener implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    public final View f3634b;

    /* renamed from: c */
    public ViewTreeObserver f3635c;

    /* renamed from: d */
    public final Runnable f3636d;

    public OneShotPreDrawListener(View view, Runnable runnable) {
        this.f3634b = view;
        this.f3635c = view.getViewTreeObserver();
        this.f3636d = runnable;
    }

    @NonNull
    /* renamed from: a */
    public static OneShotPreDrawListener m2149a(@NonNull View view, @NonNull Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        OneShotPreDrawListener oneShotPreDrawListener = new OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    /* renamed from: b */
    public void m2150b() {
        if (this.f3635c.isAlive()) {
            this.f3635c.removeOnPreDrawListener(this);
        } else {
            this.f3634b.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f3634b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        m2150b();
        this.f3636d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(@NonNull View view) {
        this.f3635c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(@NonNull View view) {
        m2150b();
    }
}

package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;

@SuppressLint
/* loaded from: classes.dex */
class GhostViewPort extends ViewGroup implements GhostView {

    /* renamed from: h */
    public static final /* synthetic */ int f6230h = 0;

    /* renamed from: b */
    public ViewGroup f6231b;

    /* renamed from: c */
    public View f6232c;

    /* renamed from: d */
    public final View f6233d;

    /* renamed from: e */
    public int f6234e;

    /* renamed from: f */
    @Nullable
    public Matrix f6235f;

    /* renamed from: g */
    public final ViewTreeObserver.OnPreDrawListener f6236g;

    public GhostViewPort(View view) {
        super(view.getContext());
        this.f6236g = new ViewTreeObserver.OnPreDrawListener() { // from class: androidx.transition.GhostViewPort.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                View view2;
                ViewCompat.m2183W(GhostViewPort.this);
                GhostViewPort ghostViewPort = GhostViewPort.this;
                ViewGroup viewGroup = ghostViewPort.f6231b;
                if (viewGroup == null || (view2 = ghostViewPort.f6232c) == null) {
                    return true;
                }
                viewGroup.endViewTransition(view2);
                ViewCompat.m2183W(GhostViewPort.this.f6231b);
                GhostViewPort ghostViewPort2 = GhostViewPort.this;
                ghostViewPort2.f6231b = null;
                ghostViewPort2.f6232c = null;
                return true;
            }
        };
        this.f6233d = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    /* renamed from: b */
    public static void m4215b(View view, View view2) {
        ViewUtils.m4273b(view2, view2.getLeft(), view2.getTop(), view.getWidth() + view2.getLeft(), view.getHeight() + view2.getTop());
    }

    /* renamed from: c */
    public static GhostViewPort m4216c(View view) {
        return (GhostViewPort) view.getTag(C2507R.id.ghost_view);
    }

    @Override // androidx.transition.GhostView
    /* renamed from: a */
    public void mo4212a(ViewGroup viewGroup, View view) {
        this.f6231b = viewGroup;
        this.f6232c = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f6233d.setTag(C2507R.id.ghost_view, this);
        this.f6233d.getViewTreeObserver().addOnPreDrawListener(this.f6236g);
        ViewUtils.f6341a.mo4282g(this.f6233d, 4);
        if (this.f6233d.getParent() != null) {
            ((View) this.f6233d.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f6233d.getViewTreeObserver().removeOnPreDrawListener(this.f6236g);
        ViewUtils.f6341a.mo4282g(this.f6233d, 0);
        this.f6233d.setTag(C2507R.id.ghost_view, null);
        if (this.f6233d.getParent() != null) {
            ((View) this.f6233d.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        CanvasUtils.m4185a(canvas, true);
        canvas.setMatrix(this.f6235f);
        View view = this.f6233d;
        ViewUtilsBase viewUtilsBase = ViewUtils.f6341a;
        viewUtilsBase.mo4282g(view, 0);
        this.f6233d.invalidate();
        viewUtilsBase.mo4282g(this.f6233d, 4);
        drawChild(canvas, this.f6233d, getDrawingTime());
        CanvasUtils.m4185a(canvas, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View, androidx.transition.GhostView
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        if (m4216c(this.f6233d) == this) {
            ViewUtils.f6341a.mo4282g(this.f6233d, i2 == 0 ? 4 : 0);
        }
    }
}

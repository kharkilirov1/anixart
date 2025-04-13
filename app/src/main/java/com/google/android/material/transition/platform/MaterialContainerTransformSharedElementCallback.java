package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeColorFilterCompat;
import androidx.core.graphics.BlendModeCompat;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.swiftsoft.anixartd.C2507R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

@RequiresApi
/* loaded from: classes.dex */
public class MaterialContainerTransformSharedElementCallback extends SharedElementCallback {

    /* renamed from: e */
    @Nullable
    public static WeakReference<View> f19560e;

    /* renamed from: c */
    @Nullable
    public Rect f19563c;

    /* renamed from: a */
    public boolean f19561a = true;

    /* renamed from: b */
    public boolean f19562b = true;

    /* renamed from: d */
    @Nullable
    public ShapeProvider f19564d = new ShapeableViewShapeProvider();

    public interface ShapeProvider {
        @Nullable
        /* renamed from: a */
        ShapeAppearanceModel mo10626a(@NonNull View view);
    }

    public static class ShapeableViewShapeProvider implements ShapeProvider {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.ShapeProvider
        @Nullable
        /* renamed from: a */
        public ShapeAppearanceModel mo10626a(@NonNull View view) {
            if (view instanceof Shapeable) {
                return ((Shapeable) view).getShapeAppearanceModel();
            }
            return null;
        }
    }

    /* renamed from: a */
    public static void m10625a(Window window) {
        Drawable background = window.getDecorView().getBackground();
        if (background == null) {
            return;
        }
        background.mutate().setColorFilter(BlendModeColorFilterCompat.m1769a(0, BlendModeCompat.CLEAR));
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public Parcelable onCaptureSharedElementSnapshot(@NonNull View view, @NonNull Matrix matrix, @NonNull RectF rectF) {
        f19560e = new WeakReference<>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    @Override // android.app.SharedElementCallback
    @Nullable
    public View onCreateSnapshotView(@NonNull Context context, @Nullable Parcelable parcelable) {
        WeakReference<View> weakReference;
        View view;
        ShapeAppearanceModel mo10626a;
        View onCreateSnapshotView = super.onCreateSnapshotView(context, parcelable);
        if (onCreateSnapshotView != null && (weakReference = f19560e) != null && this.f19564d != null && (view = weakReference.get()) != null && (mo10626a = this.f19564d.mo10626a(view)) != null) {
            onCreateSnapshotView.setTag(C2507R.id.mtrl_motion_snapshot_view, mo10626a);
        }
        return onCreateSnapshotView;
    }

    @Override // android.app.SharedElementCallback
    public void onMapSharedElements(@NonNull List<String> list, @NonNull Map<String, View> map) {
        View view;
        final Activity m10142a;
        if (list.isEmpty() || map.isEmpty() || (view = map.get(list.get(0))) == null || (m10142a = ContextUtils.m10142a(view.getContext())) == null) {
            return;
        }
        final Window window = m10142a.getWindow();
        if (this.f19561a) {
            Transition sharedElementEnterTransition = window.getSharedElementEnterTransition();
            if (sharedElementEnterTransition instanceof MaterialContainerTransform) {
                MaterialContainerTransform materialContainerTransform = (MaterialContainerTransform) sharedElementEnterTransition;
                window.setSharedElementReenterTransition(null);
                if (this.f19562b) {
                    if (materialContainerTransform.getDuration() >= 0) {
                        window.setTransitionBackgroundFadeDuration(materialContainerTransform.getDuration());
                    }
                    materialContainerTransform.addListener(new TransitionListenerAdapter(this) { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.1
                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionEnd(Transition transition) {
                            Window window2 = window;
                            WeakReference<View> weakReference = MaterialContainerTransformSharedElementCallback.f19560e;
                            Drawable background = window2.getDecorView().getBackground();
                            if (background == null) {
                                return;
                            }
                            background.mutate().clearColorFilter();
                        }

                        @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                        public void onTransitionStart(Transition transition) {
                            MaterialContainerTransformSharedElementCallback.m10625a(window);
                        }
                    });
                    return;
                }
                return;
            }
            return;
        }
        Transition sharedElementReturnTransition = window.getSharedElementReturnTransition();
        if (sharedElementReturnTransition instanceof MaterialContainerTransform) {
            MaterialContainerTransform materialContainerTransform2 = (MaterialContainerTransform) sharedElementReturnTransition;
            materialContainerTransform2.f19499b = true;
            materialContainerTransform2.addListener(new TransitionListenerAdapter(this) { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.2
                @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                public void onTransitionEnd(Transition transition) {
                    View view2;
                    WeakReference<View> weakReference = MaterialContainerTransformSharedElementCallback.f19560e;
                    if (weakReference != null && (view2 = weakReference.get()) != null) {
                        view2.setAlpha(1.0f);
                        MaterialContainerTransformSharedElementCallback.f19560e = null;
                    }
                    m10142a.finish();
                    m10142a.overridePendingTransition(0, 0);
                }
            });
            if (this.f19562b) {
                if (materialContainerTransform2.getDuration() >= 0) {
                    window.setTransitionBackgroundFadeDuration(materialContainerTransform2.getDuration());
                }
                materialContainerTransform2.addListener(new TransitionListenerAdapter(this) { // from class: com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback.3
                    @Override // com.google.android.material.transition.platform.TransitionListenerAdapter, android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        MaterialContainerTransformSharedElementCallback.m10625a(window);
                    }
                });
            }
        }
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementEnd(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && (list2.get(0).getTag(C2507R.id.mtrl_motion_snapshot_view) instanceof View)) {
            list2.get(0).setTag(C2507R.id.mtrl_motion_snapshot_view, null);
        }
        if (!this.f19561a && !list2.isEmpty()) {
            View view = list2.get(0);
            RectF rectF = TransitionUtils.f19584a;
            this.f19563c = new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        this.f19561a = false;
    }

    @Override // android.app.SharedElementCallback
    public void onSharedElementStart(@NonNull List<String> list, @NonNull List<View> list2, @NonNull List<View> list3) {
        if (!list2.isEmpty() && !list3.isEmpty()) {
            list2.get(0).setTag(C2507R.id.mtrl_motion_snapshot_view, list3.get(0));
        }
        if (this.f19561a || list2.isEmpty() || this.f19563c == null) {
            return;
        }
        View view = list2.get(0);
        view.measure(View.MeasureSpec.makeMeasureSpec(this.f19563c.width(), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f19563c.height(), 1073741824));
        Rect rect = this.f19563c;
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
    }
}

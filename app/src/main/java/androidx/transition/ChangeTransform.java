package androidx.transition;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Log;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import com.swiftsoft.anixartd.C2507R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class ChangeTransform extends Transition {

    /* renamed from: F */
    public static final String[] f6170F = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: G */
    public static final Property<PathAnimatorMatrix, float[]> f6171G = new Property<PathAnimatorMatrix, float[]>(float[].class, "nonTranslations") { // from class: androidx.transition.ChangeTransform.1
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ float[] get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, float[] fArr) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            float[] fArr2 = fArr;
            System.arraycopy(fArr2, 0, pathAnimatorMatrix2.f6189c, 0, fArr2.length);
            pathAnimatorMatrix2.m4200a();
        }
    };

    /* renamed from: H */
    public static final Property<PathAnimatorMatrix, PointF> f6172H = new Property<PathAnimatorMatrix, PointF>(PointF.class, "translations") { // from class: androidx.transition.ChangeTransform.2
        @Override // android.util.Property
        public /* bridge */ /* synthetic */ PointF get(PathAnimatorMatrix pathAnimatorMatrix) {
            return null;
        }

        @Override // android.util.Property
        public void set(PathAnimatorMatrix pathAnimatorMatrix, PointF pointF) {
            PathAnimatorMatrix pathAnimatorMatrix2 = pathAnimatorMatrix;
            PointF pointF2 = pointF;
            Objects.requireNonNull(pathAnimatorMatrix2);
            pathAnimatorMatrix2.f6190d = pointF2.x;
            pathAnimatorMatrix2.f6191e = pointF2.y;
            pathAnimatorMatrix2.m4200a();
        }
    };

    /* renamed from: I */
    public static final boolean f6173I = true;

    /* renamed from: C */
    public boolean f6174C = true;

    /* renamed from: D */
    public boolean f6175D = true;

    /* renamed from: E */
    public Matrix f6176E = new Matrix();

    public static class GhostListener extends TransitionListenerAdapter {

        /* renamed from: a */
        public View f6185a;

        /* renamed from: b */
        public GhostView f6186b;

        public GhostListener(View view, GhostView ghostView) {
            this.f6185a = view;
            this.f6186b = ghostView;
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        /* renamed from: b */
        public void mo4191b(@NonNull Transition transition) {
            this.f6186b.setVisibility(4);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        /* renamed from: c */
        public void mo4192c(@NonNull Transition transition) {
            transition.mo4255z(this);
            View view = this.f6185a;
            if (Build.VERSION.SDK_INT == 28) {
                if (!GhostViewPlatform.f6228h) {
                    try {
                        GhostViewPlatform.m4214b();
                        Method declaredMethod = GhostViewPlatform.f6223c.getDeclaredMethod("removeGhost", View.class);
                        GhostViewPlatform.f6227g = declaredMethod;
                        declaredMethod.setAccessible(true);
                    } catch (NoSuchMethodException e2) {
                        Log.i("GhostViewApi21", "Failed to retrieve removeGhost method", e2);
                    }
                    GhostViewPlatform.f6228h = true;
                }
                Method method = GhostViewPlatform.f6227g;
                if (method != null) {
                    try {
                        method.invoke(null, view);
                    } catch (IllegalAccessException unused) {
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException(e3.getCause());
                    }
                }
            } else {
                int i2 = GhostViewPort.f6230h;
                GhostViewPort ghostViewPort = (GhostViewPort) view.getTag(C2507R.id.ghost_view);
                if (ghostViewPort != null) {
                    int i3 = ghostViewPort.f6234e - 1;
                    ghostViewPort.f6234e = i3;
                    if (i3 <= 0) {
                        ((GhostViewHolder) ghostViewPort.getParent()).removeView(ghostViewPort);
                    }
                }
            }
            this.f6185a.setTag(C2507R.id.transition_transform, null);
            this.f6185a.setTag(C2507R.id.parent_matrix, null);
        }

        @Override // androidx.transition.TransitionListenerAdapter, androidx.transition.Transition.TransitionListener
        /* renamed from: e */
        public void mo4194e(@NonNull Transition transition) {
            this.f6186b.setVisibility(0);
        }
    }

    public static class PathAnimatorMatrix {

        /* renamed from: a */
        public final Matrix f6187a = new Matrix();

        /* renamed from: b */
        public final View f6188b;

        /* renamed from: c */
        public final float[] f6189c;

        /* renamed from: d */
        public float f6190d;

        /* renamed from: e */
        public float f6191e;

        public PathAnimatorMatrix(View view, float[] fArr) {
            this.f6188b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f6189c = fArr2;
            this.f6190d = fArr2[2];
            this.f6191e = fArr2[5];
            m4200a();
        }

        /* renamed from: a */
        public final void m4200a() {
            float[] fArr = this.f6189c;
            fArr[2] = this.f6190d;
            fArr[5] = this.f6191e;
            this.f6187a.setValues(fArr);
            ViewUtils.f6341a.mo4278d(this.f6188b, this.f6187a);
        }
    }

    public static class Transforms {

        /* renamed from: a */
        public final float f6192a;

        /* renamed from: b */
        public final float f6193b;

        /* renamed from: c */
        public final float f6194c;

        /* renamed from: d */
        public final float f6195d;

        /* renamed from: e */
        public final float f6196e;

        /* renamed from: f */
        public final float f6197f;

        /* renamed from: g */
        public final float f6198g;

        /* renamed from: h */
        public final float f6199h;

        public Transforms(View view) {
            this.f6192a = view.getTranslationX();
            this.f6193b = view.getTranslationY();
            this.f6194c = ViewCompat.m2166F(view);
            this.f6195d = view.getScaleX();
            this.f6196e = view.getScaleY();
            this.f6197f = view.getRotationX();
            this.f6198g = view.getRotationY();
            this.f6199h = view.getRotation();
        }

        /* renamed from: a */
        public void m4201a(View view) {
            float f2 = this.f6192a;
            float f3 = this.f6193b;
            float f4 = this.f6194c;
            float f5 = this.f6195d;
            float f6 = this.f6196e;
            float f7 = this.f6197f;
            float f8 = this.f6198g;
            float f9 = this.f6199h;
            String[] strArr = ChangeTransform.f6170F;
            view.setTranslationX(f2);
            view.setTranslationY(f3);
            ViewCompat.m2238z0(view, f4);
            view.setScaleX(f5);
            view.setScaleY(f6);
            view.setRotationX(f7);
            view.setRotationY(f8);
            view.setRotation(f9);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Transforms)) {
                return false;
            }
            Transforms transforms = (Transforms) obj;
            return transforms.f6192a == this.f6192a && transforms.f6193b == this.f6193b && transforms.f6194c == this.f6194c && transforms.f6195d == this.f6195d && transforms.f6196e == this.f6196e && transforms.f6197f == this.f6197f && transforms.f6198g == this.f6198g && transforms.f6199h == this.f6199h;
        }

        public int hashCode() {
            float f2 = this.f6192a;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.f6193b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f6194c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f6195d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f6196e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f6197f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f6198g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f6199h;
            return floatToIntBits7 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0);
        }
    }

    /* renamed from: P */
    public static void m4198P(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        ViewCompat.m2238z0(view, 0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setRotation(0.0f);
    }

    /* renamed from: O */
    public final void m4199O(TransitionValues transitionValues) {
        View view = transitionValues.f6318b;
        if (view.getVisibility() == 8) {
            return;
        }
        transitionValues.f6317a.put("android:changeTransform:parent", view.getParent());
        transitionValues.f6317a.put("android:changeTransform:transforms", new Transforms(view));
        Matrix matrix = view.getMatrix();
        transitionValues.f6317a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (this.f6175D) {
            Matrix matrix2 = new Matrix();
            ViewUtils.f6341a.mo4279h((ViewGroup) view.getParent(), matrix2);
            matrix2.preTranslate(-r2.getScrollX(), -r2.getScrollY());
            transitionValues.f6317a.put("android:changeTransform:parentMatrix", matrix2);
            transitionValues.f6317a.put("android:changeTransform:intermediateMatrix", view.getTag(C2507R.id.transition_transform));
            transitionValues.f6317a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C2507R.id.parent_matrix));
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e */
    public void mo4187e(@NonNull TransitionValues transitionValues) {
        m4199O(transitionValues);
    }

    @Override // androidx.transition.Transition
    /* renamed from: h */
    public void mo4188h(@NonNull TransitionValues transitionValues) {
        m4199O(transitionValues);
        if (f6173I) {
            return;
        }
        ((ViewGroup) transitionValues.f6318b.getParent()).startViewTransition(transitionValues.f6318b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x02cd, code lost:
    
        if (r15.getZ() > r2.getZ()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0386, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0383, code lost:
    
        if (r4.size() == r13) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.transition.GhostViewPlatform] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    @Override // androidx.transition.Transition
    @androidx.annotation.Nullable
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.animation.Animator mo4189l(@androidx.annotation.NonNull android.view.ViewGroup r25, @androidx.annotation.Nullable androidx.transition.TransitionValues r26, @androidx.annotation.Nullable androidx.transition.TransitionValues r27) {
        /*
            Method dump skipped, instructions count: 1073
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.mo4189l(android.view.ViewGroup, androidx.transition.TransitionValues, androidx.transition.TransitionValues):android.animation.Animator");
    }

    @Override // androidx.transition.Transition
    @NonNull
    /* renamed from: t */
    public String[] mo4190t() {
        return f6170F;
    }
}

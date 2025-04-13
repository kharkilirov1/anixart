package androidx.vectordrawable.graphics.drawable;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public interface Animatable2Compat extends Animatable {

    public static abstract class AnimationCallback {

        /* renamed from: a */
        public Animatable2.AnimationCallback f6388a;

        /* renamed from: androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback$1 */
        class C06491 extends Animatable2.AnimationCallback {
            public C06491() {
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                AnimationCallback.this.mo4292a(drawable);
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                AnimationCallback.this.mo4293b(drawable);
            }
        }

        /* renamed from: a */
        public void mo4292a(Drawable drawable) {
        }

        /* renamed from: b */
        public void mo4293b(Drawable drawable) {
        }
    }
}

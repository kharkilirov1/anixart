package androidx.browser.browseractions;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;

@Deprecated
/* loaded from: classes.dex */
class BrowserActionsFallbackMenuDialog extends Dialog {

    /* renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuDialog$1 */
    class C01521 extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ boolean f1715a;

        /* renamed from: b */
        public final /* synthetic */ BrowserActionsFallbackMenuDialog f1716b;

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1715a) {
                return;
            }
            BrowserActionsFallbackMenuDialog.super.dismiss();
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        throw null;
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // android.app.Dialog
    public void show() {
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        throw null;
    }
}

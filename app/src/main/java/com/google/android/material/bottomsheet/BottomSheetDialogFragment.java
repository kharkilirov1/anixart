package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDialogFragment;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public class BottomSheetDialogFragment extends AppCompatDialogFragment {

    /* renamed from: b */
    public boolean f17677b;

    public class BottomSheetDismissCallback extends BottomSheetBehavior.BottomSheetCallback {

        /* renamed from: a */
        public final /* synthetic */ BottomSheetDialogFragment f17678a;

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: b */
        public void mo9859b(@NonNull View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
        /* renamed from: c */
        public void mo9860c(@NonNull View view, int i2) {
            if (i2 == 5) {
                BottomSheetDialogFragment.m9866n3(this.f17678a);
            }
        }
    }

    /* renamed from: n3 */
    public static void m9866n3(BottomSheetDialogFragment bottomSheetDialogFragment) {
        if (bottomSheetDialogFragment.f17677b) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        m9867u3(false);
        super.dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        m9867u3(true);
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        return new BottomSheetDialog(getContext(), getTheme());
    }

    /* renamed from: u3 */
    public final boolean m9867u3(boolean z) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof BottomSheetDialog)) {
            return false;
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialog;
        if (bottomSheetDialog.f17659f == null) {
            bottomSheetDialog.m9862g();
        }
        boolean z2 = bottomSheetDialog.f17659f.f17592H;
        return false;
    }
}

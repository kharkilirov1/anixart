package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.FitWindowsViewGroup;

@RestrictTo
/* loaded from: classes.dex */
public class FitWindowsFrameLayout extends FrameLayout implements FitWindowsViewGroup {

    /* renamed from: b */
    public FitWindowsViewGroup.OnFitSystemWindowsListener f1323b;

    public FitWindowsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener = this.f1323b;
        if (onFitSystemWindowsListener != null) {
            onFitSystemWindowsListener.mo434a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(FitWindowsViewGroup.OnFitSystemWindowsListener onFitSystemWindowsListener) {
        this.f1323b = onFitSystemWindowsListener;
    }
}

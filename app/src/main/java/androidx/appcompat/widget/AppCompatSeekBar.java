package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.swiftsoft.anixartd.C2507R;

/* loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* renamed from: b */
    public final AppCompatSeekBarHelper f1204b;

    public AppCompatSeekBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, C2507R.attr.seekBarStyle);
        ThemeUtils.m945a(this, getContext());
        AppCompatSeekBarHelper appCompatSeekBarHelper = new AppCompatSeekBarHelper(this);
        this.f1204b = appCompatSeekBarHelper;
        appCompatSeekBarHelper.mo752a(attributeSet, C2507R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatSeekBarHelper appCompatSeekBarHelper = this.f1204b;
        Drawable drawable = appCompatSeekBarHelper.f1206e;
        if (drawable != null && drawable.isStateful() && drawable.setState(appCompatSeekBarHelper.f1205d.getDrawableState())) {
            appCompatSeekBarHelper.f1205d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1204b.f1206e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1204b.m757d(canvas);
    }
}

package androidx.core.view;

import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class MotionEventCompat {
    /* renamed from: a */
    public static boolean m2134a(@NonNull MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}

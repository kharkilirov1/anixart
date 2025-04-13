package androidx.transition;

import android.view.View;
import android.view.ViewOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewOverlayApi18 implements ViewOverlayImpl {

    /* renamed from: a */
    public final ViewOverlay f6340a;

    public ViewOverlayApi18(@NonNull View view) {
        this.f6340a = view.getOverlay();
    }
}

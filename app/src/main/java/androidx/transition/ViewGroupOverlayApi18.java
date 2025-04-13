package androidx.transition;

import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {

    /* renamed from: a */
    public final ViewGroupOverlay f6333a;

    public ViewGroupOverlayApi18(@NonNull ViewGroup viewGroup) {
        this.f6333a = viewGroup.getOverlay();
    }
}

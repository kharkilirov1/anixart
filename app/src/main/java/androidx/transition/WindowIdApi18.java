package androidx.transition;

import android.view.View;
import android.view.WindowId;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi
/* loaded from: classes.dex */
class WindowIdApi18 implements WindowIdImpl {

    /* renamed from: a */
    public final WindowId f6375a;

    public WindowIdApi18(@NonNull View view) {
        this.f6375a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof WindowIdApi18) && ((WindowIdApi18) obj).f6375a.equals(this.f6375a);
    }

    public int hashCode() {
        return this.f6375a.hashCode();
    }
}

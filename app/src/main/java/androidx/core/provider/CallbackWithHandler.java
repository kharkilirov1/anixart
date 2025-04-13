package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.core.provider.FontRequestWorker;
import androidx.core.provider.FontsContractCompat;

/* loaded from: classes.dex */
class CallbackWithHandler {

    /* renamed from: a */
    @NonNull
    public final FontsContractCompat.FontRequestCallback f3466a;

    /* renamed from: b */
    @NonNull
    public final Handler f3467b;

    public CallbackWithHandler(@NonNull FontsContractCompat.FontRequestCallback fontRequestCallback, @NonNull Handler handler) {
        this.f3466a = fontRequestCallback;
        this.f3467b = handler;
    }

    /* renamed from: a */
    public void m1979a(@NonNull FontRequestWorker.TypefaceResult typefaceResult) {
        final int i2 = typefaceResult.f3493b;
        if (!(i2 == 0)) {
            final FontsContractCompat.FontRequestCallback fontRequestCallback = this.f3466a;
            this.f3467b.post(new Runnable(this) { // from class: androidx.core.provider.CallbackWithHandler.2
                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback.mo1798a(i2);
                }
            });
        } else {
            final Typeface typeface = typefaceResult.f3492a;
            final FontsContractCompat.FontRequestCallback fontRequestCallback2 = this.f3466a;
            this.f3467b.post(new Runnable(this) { // from class: androidx.core.provider.CallbackWithHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    fontRequestCallback2.mo1799b(typeface);
                }
            });
        }
    }
}

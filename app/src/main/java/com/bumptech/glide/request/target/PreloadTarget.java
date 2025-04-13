package com.bumptech.glide.request.target;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.request.transition.Transition;
import java.util.Objects;

/* loaded from: classes.dex */
public final class PreloadTarget<Z> extends SimpleTarget<Z> {

    /* renamed from: e */
    public static final Handler f8802e = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bumptech.glide.request.target.PreloadTarget.1
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 1) {
                return false;
            }
            Objects.requireNonNull((PreloadTarget) message.obj);
            throw null;
        }
    });

    @Override // com.bumptech.glide.request.target.Target
    /* renamed from: c */
    public void mo4877c(@NonNull Z z, @Nullable Transition<? super Z> transition) {
        f8802e.obtainMessage(1, this).sendToTarget();
    }
}

package com.google.android.play.core.tasks;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    @Override // com.google.android.play.core.tasks.OnCompleteListener
    /* renamed from: a */
    public void mo10839a(Task<Object> task) {
        if (!task.mo11003g()) {
            throw new IllegalStateException("onComplete called for incomplete task: 0");
        }
        if (task.mo11004h()) {
            nativeOnComplete(0L, 0, task.mo11002f(), 0);
            return;
        }
        Exception mo11001e = task.mo11001e();
        if (!(mo11001e instanceof zzj)) {
            nativeOnComplete(0L, 0, null, -100);
            return;
        }
        int mo10669a = ((zzj) mo11001e).mo10669a();
        if (mo10669a == 0) {
            throw new IllegalStateException("TaskException has error code 0 on task: 0");
        }
        nativeOnComplete(0L, 0, null, mo10669a);
    }

    public native void nativeOnComplete(long j2, int i2, @Nullable Object obj, int i3);
}

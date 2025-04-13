package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
@KeepForSdk
/* loaded from: classes.dex */
public class NativeOnCompleteListener implements OnCompleteListener<Object> {
    @KeepForSdk
    public native void nativeOnComplete(long j2, @Nullable Object obj, boolean z, boolean z2, @Nullable String str);

    @Override // com.google.android.gms.tasks.OnCompleteListener
    @KeepForSdk
    public void onComplete(@NonNull Task<Object> task) {
        Object obj;
        String str;
        Exception mo9707l;
        if (task.mo9712q()) {
            obj = task.mo9708m();
            str = null;
        } else if (task.mo9710o() || (mo9707l = task.mo9707l()) == null) {
            obj = null;
            str = null;
        } else {
            str = mo9707l.getMessage();
            obj = null;
        }
        nativeOnComplete(0L, obj, task.mo9712q(), task.mo9710o(), str);
    }
}

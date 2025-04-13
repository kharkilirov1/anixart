package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
final class zacz extends com.google.android.gms.internal.base.zaq {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Objects.requireNonNull(null);
            throw null;
        }
        if (i2 == 1) {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            String valueOf = String.valueOf(runtimeException.getMessage());
            Log.e("TransformedResultImpl", valueOf.length() != 0 ? "Runtime exception on the transformation worker thread: ".concat(valueOf) : new String("Runtime exception on the transformation worker thread: "));
            throw runtimeException;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("TransformationResultHandler received unknown message type: ");
        sb.append(i2);
        Log.e("TransformedResultImpl", sb.toString());
    }
}

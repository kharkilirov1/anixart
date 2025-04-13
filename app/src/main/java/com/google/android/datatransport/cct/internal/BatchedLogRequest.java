package com.google.android.datatransport.cct.internal;

import androidx.annotation.NonNull;
import com.google.auto.value.AutoValue;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

@AutoValue
@Encodable
/* loaded from: classes.dex */
public abstract class BatchedLogRequest {
    @NonNull
    /* renamed from: a */
    public static BatchedLogRequest m5478a(@NonNull List<LogRequest> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    @NonNull
    @Encodable.Field
    /* renamed from: b */
    public abstract List<LogRequest> mo5438b();
}

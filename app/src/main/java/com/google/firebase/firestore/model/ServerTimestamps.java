package com.google.firebase.firestore.model;

import androidx.annotation.Nullable;
import com.google.firestore.p012v1.Value;
import com.google.protobuf.Timestamp;

/* loaded from: classes2.dex */
public final class ServerTimestamps {
    /* renamed from: a */
    public static Timestamp m12454a(Value value) {
        return value.m12811T().m12770N("__local_write_time__").m12814W();
    }

    /* renamed from: b */
    public static boolean m12455b(@Nullable Value value) {
        Value m12769M = value.m12811T().m12769M("__type__", null);
        return m12769M != null && "server_timestamp".equals(m12769M.m12813V());
    }
}

package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.Timeline;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Random;

/* loaded from: classes.dex */
public final class DefaultPlaybackSessionManager implements PlaybackSessionManager {

    /* renamed from: e */
    public static final Random f10125e = new Random();

    /* renamed from: d */
    public final Supplier<String> f10129d = new Supplier() { // from class: com.google.android.exoplayer2.analytics.t
        @Override // com.google.common.base.Supplier
        public final Object get() {
            byte[] bArr = new byte[12];
            DefaultPlaybackSessionManager.f10125e.nextBytes(bArr);
            return Base64.encodeToString(bArr, 10);
        }
    };

    /* renamed from: a */
    public final Timeline.Window f10126a = new Timeline.Window();

    /* renamed from: b */
    public final Timeline.Period f10127b = new Timeline.Period();

    /* renamed from: c */
    public final HashMap<String, SessionDescriptor> f10128c = new HashMap<>();

    public final class SessionDescriptor {
    }
}

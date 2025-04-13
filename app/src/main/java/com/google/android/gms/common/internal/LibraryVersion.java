package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
@KeepForSdk
/* loaded from: classes.dex */
public class LibraryVersion {

    /* renamed from: b */
    public static final GmsLogger f15721b = new GmsLogger("LibraryVersion", "");

    /* renamed from: c */
    public static LibraryVersion f15722c = new LibraryVersion();

    /* renamed from: a */
    public ConcurrentHashMap<String, String> f15723a = new ConcurrentHashMap<>();

    @VisibleForTesting
    public LibraryVersion() {
    }
}
